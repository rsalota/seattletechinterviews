package com.techinterviews.dynamic;

public class LightBulb {
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
		int [] array = {1,0,0,0,0,0,0,0,1,1};
					    
		int [] work = swaps(0,array);
		for(int i=0;i<work.length;i++){
			System.out.println(work[i]);
		}
		
	}
	
	public static int [] swaps(int k,int [] array){

		int maxSoFar=0;
		int maxEndingHere=0;
		int indexStart=0;
		int indexEnd=0;
		int maxIndexStart=0;
		
		for(int i=0;i<array.length;i++){
			if(maxEndingHere < array[i] + maxEndingHere){
				maxEndingHere = array[i] + maxEndingHere;
				if (maxSoFar < maxEndingHere){
					maxSoFar = maxEndingHere;
					indexEnd=i;
					maxIndexStart=indexStart;
				}
			}else{
				maxEndingHere=0;
				indexStart=i+1;
			}
		}
		
		int[] newArray = new int[3];
		newArray[0]=maxIndexStart;
		newArray[1] = indexEnd;
		newArray[2]=maxSoFar;
		return newArray;
	}

}
