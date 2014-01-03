package com.techinterviews.arrays.solution;

import java.util.Arrays;

public class ArrangeNumbersInAlternationOrders {

	/**
	 * Arrange the numbers in an array in alternating order. For example if the
	 * array is [a1, a2, a3, a4.. ]arrange the array such that b1<=b2>=b3<=b4
	 * and so on.
	 * 
	 * Sample Input: 3 5 7 8 4 9 Sample Output: 3 < 5 > 4 < 8 >7 < 9
	 *  0 1 2 3 4 5 
	 *  3 4 5 7 8 9 
	 *  3 5 4 8 7 9
	 * @param array
	 * @return
	 */
	public int[] algorithm(int[] array) {
//		sort(array);
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
			if(i%2 > 0 && i+1 < array.length){
				int tmp = array[i+1];
				array[i+1]  = array[i];
				array[i] = tmp;
			}
		}
		return array;
	}
	
	/**
	 * Bubble sort.
	 * 
	 * @param array
	 */
	public static void sort(int array[]){
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				if (array[i] > array[j]){
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
	}
}
