package com.techinterviews.dynamic.solution;

public class RodCutOptimizer {
/**
 * l=10
 * 0 -> 0
 * 1 -> 10
 * 2 -> 20
 * 3 -> 30
 * 4-> 40 
 * 
 * price(l) = max(price(l-1) + p(1))
 *              10
 *  (1 + max(9)) ,(max(2),max(8)),(max(3), max(7)), (max(4),max(6))....        
 *     
 * @param length
 * @param array
 */
	public static int algorithm(int length, int array[]){
		int maxArray[] = new int[length+1];
		for (int i=0;i<maxArray.length;i++){
			maxArray[i]=-1;
		}
		return maxPrice(length, array,maxArray);
	}
	
	public static int maxPrice(int l, int array[],int maxArray[]){
		int maxPrice = array[l];
		if (maxArray[l] > -1){
			return maxArray[l];
		}
		for (int i=1;i<l;i++){
			int priceI = maxPrice(i, array,maxArray);
			int maxPriceNMinusI = maxPrice(l-i, array,maxArray);
			if (priceI + maxPriceNMinusI > maxPrice ){
				maxPrice = priceI + maxPriceNMinusI;
			}
		}
		maxArray[l]=maxPrice;
		return maxPrice;
	}
	
	
	public static void main(String args[]){
		int array[]={0,400,5,200,100};
		int v = algorithm(4, array);
		System.out.println(v);
	}

}
