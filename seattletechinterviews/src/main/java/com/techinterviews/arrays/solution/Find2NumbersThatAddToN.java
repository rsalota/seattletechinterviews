package com.techinterviews.arrays.solution;

import java.util.HashSet;
/**
 * Find 2 numbers in an array that add up to a given number.
 * 
 * @author rsalota
 *
 */
public class Find2NumbersThatAddToN {
	
	/**
	 * O(n2) solution 
	 * 
	 * @param array
	 * @param n
	 * @return
	 */
	public int[] algorithm(int array[],int n){
		
		for (int i = 0;i <array.length;i++){
			for (int j=i+1;j<array.length;j++){
				if (array[i] + array[j] == n){
					int[] result ={array[i],array[j]};
					return result;
				}
			}
		}
		int result[]={};
		return result;
	}
	
	/**
	 * O (N) solution
	 *   
	 * @param array
	 * @param n
	 * @return
	 */
	public int[] algorithm2(int array[],int n){
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0;i<array.length;i++){
			int difference = n - array[i];
			if (hashSet.contains(difference)){
				int [] result = {difference,array[i]};
				return result;
			}else{
				hashSet.add(array[i]);
			}
		}
		int result[]={};
		return result;
	}


}
