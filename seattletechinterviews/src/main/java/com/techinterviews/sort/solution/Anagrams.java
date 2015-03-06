package com.techinterviews.sort.solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Anagrams {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String anagrams[] = { "rahul", "salota", "luhar", "aslota" };
		Anagrams.sort(anagrams);
		for (int i = 0; i < anagrams.length; i++) {
			System.out.println(anagrams[i]);
		}
	}

	public static void sort(String[] sortit) {
		HashMap<String, List<String>> anagramMap = new HashMap<String, List<String>>();
		//make an anagram map 
		for (int i = 0; i < sortit.length; i++) {
			char[] word = sortit[i].toCharArray();
			Arrays.sort(word);
			String key = new String(word);
			if (anagramMap.containsKey(word.toString())) {
				List<String> anas = anagramMap.get(word.toString());
				anas.add(sortit[i]);
			}else{
				List<String> list = new LinkedList<String>();
				list.add(sortit[i]);
				anagramMap.put(key, list);
			}
		}
		Set<String> keys = anagramMap.keySet();
		for(String k : keys){
			//
		}
	}
}
