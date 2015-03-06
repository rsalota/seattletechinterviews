package com.techinterviews.hard;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class EditDistance {
	
	public static void main(String args[]){
		String w="bad";
		String e="suz";
		HashSet<String> dictionary= new HashSet<String>();
		dictionary.add("bad");
		dictionary.add("baz");
		dictionary.add("caz");
		dictionary.add("cuz");
		dictionary.add("cud");
		dictionary.add("suz");
		List<String> chain= new LinkedList<String>();
		chain.add(w);
		HashSet<String> visited= new HashSet<String>();
		visited.add(w);
		convert(w, e, dictionary,chain,visited);
		System.out.println(chain);
	}
	
	public static String convert(String from,String target,HashSet<String> dictionary,List<String> chain,HashSet<String> visited){
		return null;
	}

	private static String[] getOneEditWords(String from) {
		List<String> oneEditWords = new LinkedList<String>();
		char[] oneEdits = from.toCharArray();
		for(int i=0;i<oneEdits.length;i++){
			
			for(char c='a';c<='z';c++){
				
				if (oneEdits[i]== c){
					continue;
				}
				char newOneEdit[] = oneEdits.clone();
				newOneEdit[i]=c;
				oneEditWords.add(new String(newOneEdit));
			}
		}
		return oneEditWords.toArray(new String[0]);
	}
}
