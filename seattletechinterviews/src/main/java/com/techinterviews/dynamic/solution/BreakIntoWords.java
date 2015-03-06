package com.techinterviews.dynamic.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class BreakIntoWords {
	
	public static void main(String args[]){
		String words ="bedbathandbeyondandbeyond";
		Set<String> dictionary=new HashSet<String>();
		dictionary.add("bed");
		dictionary.add("bath");
		dictionary.add("an");
		dictionary.add("d");
		dictionary.add("bedb");
		dictionary.add("athan");
		dictionary.add("dbey");
		dictionary.add("ond");
		
		Map<String,List<String>> broken=new HashMap<String,List<String>>();
		List<String> brokenWords = breakIntoWords2(words.toCharArray(),0,words.length(),dictionary,broken);
		
		System.out.println(brokenWords);
	}
	
	public static List<String> breakIntoWords2(char[] chars,int offset,int length,Set<String> dictionary,Map<String,List<String>> maps){
		List<String> definiteWords = new LinkedList<String>();
		String toBreak=new String(chars,offset,length);
		
		if (dictionary.contains(toBreak)){
			definiteWords.add(toBreak);
			return definiteWords;
		}
		
		//Dynamic programming 
		if (maps.containsKey(toBreak)){
			System.out.println("Use dynamic " + toBreak);
			return maps.get(toBreak);
		}
		
		for(int i=1;i<=length;i++){
			String mayBeWord=new String(chars,offset,i);
			System.out.println("may be word : " + mayBeWord);
			if(dictionary.contains(mayBeWord)){
				System.out.println("may be word found in dictionary :" + mayBeWord);
				String nextWord = new String(chars,offset+i,length-i);
				System.out.println("next word in dictionary :" + nextWord);
				List<String> definiteWordsList = breakIntoWords2(chars,offset+i,length-i, dictionary,maps);
				System.out.println("next word in dictionary :" + definiteWordsList);
				maps.put(nextWord, definiteWordsList);	
				if (definiteWordsList !=null){
					 definiteWords.add(mayBeWord);
					 definiteWords.addAll(definiteWordsList);
					 return definiteWords;
				}
			}
		}
		maps.put(toBreak, null);
		return null;
	}


}
