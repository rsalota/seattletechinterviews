package com.techinterviews.arrays.solution;

/**
 * 
 * @author rsalota
 *
 */
public class Hops {

	public static void main(String args[]) {
		int[] values = { 8, 0, 1, 1, 1, 1, 1, 1, 0, 0 };
		boolean way = findWayN2(values,0);
		System.out.println("ways " + way);
	}
	
	/**
	 * O(N^2) 
	 * @param array
	 * @param i
	 * @return
	 */
	public static boolean findWayN2(int [] array,int i){
		if (array[i] + i >= array.length){
			return true;
		}
		for(int j=i+1;j<array[i];j++){
			boolean v = findWayN2(array, j);
			if (v == true){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * O(n)
	 * @param array
	 * @return
	 */
	public static boolean findWay(int[] array) {
		int c = 0;
		int index = array.length-1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i]  >= c) {
				index = i;
				c=1;
				continue;
			}
			c++;
		}
		if (index == 0) {
			return true;
		}
		return false;
	}

}
