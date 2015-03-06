package com.techinterviews.hard;

import java.util.HashSet;
import java.util.Set;

public class WordList {
	
	/**
	 * 1. hello 
	 * 2. world 
	 * 3. hello world
	 * @param args
	 */
	public static void main(String args[]){
		String[] words = {"hello","helloworld","world","helloworlditis","it","is","hell"};
		String longString = WordList.getLongestWord(words);
		System.out.println(longString);
	}
	
	public static String getLongestWord(String [] list){
		Set<String>dictionary = new HashSet<String>();
		String maxString="";
		for (String str:list){
			dictionary.add(str);
		}
		for(String s : list){
			dictionary.remove(s);
			if (canBeBuiltByList(dictionary, s)){
				if (maxString.length() < s.length()){
					maxString = s;
				}
			}
			dictionary.add(s);
		}
		return maxString;
	}
	
	public static boolean canBeBuiltByList(Set<String> dictionary,String s){
		
		for(int i=1;i<=s.length();i++){
			String k = s.substring(0,i);
			if (dictionary.contains(k)){
				if (i<s.length() && canBeBuiltByList(dictionary, s.substring(i))){
					return true;
				}else if (i== s.length()){
					return true;
				}
			}
		}
		return false;
	}

}
