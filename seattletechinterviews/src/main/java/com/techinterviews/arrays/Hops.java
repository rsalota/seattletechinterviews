package com.techinterviews.arrays;

/**
 * Given an array of integers where each element represents the max number of
 * steps that can be made forward from that element. Write a function to return
 * the minimum number of jumps to reach the end of the array (starting from the
 * first element). If an element is 0, then cannot move through that element.
 * 
 * @author rsalota
 *
 */
public class Hops {

	public static void main(String args[]) {
		int[] values = { 8, 0, 1, 1, 1, 1, 1, 1, 0, 0 };
		boolean way = findWayN2(values, 0);
		System.out.println("ways " + way);
	}

	/**
	 * O(N^2)
	 * 
	 * @param array
	 * @param i
	 * @return
	 */
	public static boolean findWayN2(int[] array, int i) {
		return true;
	}

	/**
	 * O(n)
	 * 
	 * @param array
	 * @return
	 */
	public static boolean findWay(int[] array) {
		return true;
	}

}
