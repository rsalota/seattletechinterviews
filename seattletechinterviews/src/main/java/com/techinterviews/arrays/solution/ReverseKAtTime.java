package com.techinterviews.arrays.solution;

public class ReverseKAtTime {
	public int[] algorithm(int[] array,int k) {
		int[] newArray = array.clone();
		if (k<=0){
			throw new IllegalArgumentException("k == 0 we need k to be atleast 1 ");
		}
		for(int j=0;j+k-1<newArray.length;j+=k){
			int i=0;
			while(i<k/2){
				int tmp = newArray[j+i];
				newArray[j+i]= newArray[j+k-i-1];
				newArray[j+k-i-1]=tmp;
				i++;
			}
		}
		return newArray;
	}
}
