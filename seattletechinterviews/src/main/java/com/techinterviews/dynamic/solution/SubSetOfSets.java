package com.techinterviews.dynamic.solution;

import java.util.LinkedList;
import java.util.List;



public class SubSetOfSets {
	
	public static void main(String args[]){
		int a[]={1,2,3};
		List<List<Integer>> subsets = subsetOfSet(a,a.length-1);
		System.out.println(subsets);
	}
	
	public static List<List<Integer>> subsetOfSet(int a[],int i){
		
		if ( i == 0){
			List<List<Integer>> lists = new LinkedList<List<Integer>>();
			lists.add(new LinkedList<Integer>());
			List<Integer> l = new LinkedList<Integer>();
			l.add(a[0]);
			lists.add(l);
			return lists;
		}
		
		List<List<Integer>> subsets  = subsetOfSet(a,i-1);
		List<List<Integer>> subsetRet = new LinkedList<List<Integer>>();
		subsetRet.addAll(subsets);
		for(List<Integer> subset:subsets){
			List<Integer> l = new LinkedList<Integer>();
			l.addAll(subset);
			l.add(a[i]);
			subsetRet.add(l);
		}
		
		return subsetRet;
	}

}
