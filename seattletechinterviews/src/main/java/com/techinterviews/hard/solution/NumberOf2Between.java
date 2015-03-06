package com.techinterviews.hard.solution;

public class NumberOf2Between {
	
	public static void main(String args[]){
		System.out.println(NumberOf2Between.numberOf2Between0AndN(36));
	}
	
	/**
	 * 		0-09	: 2    =1
	 * 		10-19   :12    =1
	 * 		20-29   :21-29 =11
	 * 		30-40   :32    =1
	 * 		40-50   :42    =1
	 *      50-60   :52    =1
	 *      60-69   :62    =1
	 *      70-79   :72    =1
	 *      80-89   :82    =1
	 *      90-99   :92     =1
	 *      100-110 :102
	 *      110-120: 112
	 *      120-130 :121,122,123,124...129 
	 *      200-300
	 *      0-21 ->
	 *      0-26 = 8
	 *      
	 *      28,29
	 *      32,42,52,62,72,82,92
	 *      
	 *      32
	 *      12 ->
	 *      272 -->0,1,2,3,4,5,6,7,8,9
	 *    <2, >2 , =2 
	 *       
	 *      100 - 
	 *      227 - 
	 *      	x >= 2 
	 *      		like 3 +1
	 *      		like 1 +0
	 *      	x > 2 
	 *      		like 3 +11
	 *      	x=2	like previous x+1
	 *      	x<2 +1 
	 *      
	 *      100	x >= k to n
	 *      100-200 
	 *      
	 *      
	 *      units
	 *      	1,10,100
	 *    1-10
	 *    10-20
	 *    20-30 --> special case 
	 *    30-40
	 *    40-50
	 *    50-60
	 *    60-70
	 *    70-80
	 *    80-90
	 *    90-99
	 *    99/10 = round up ( 9.9 )
	 *    
	 *    1000 /10 = 100
	 *    
	 *    0 : if units is less than <2 =0
	 *    7 : if units is > 2 =1 
	 *    2 : if units is == 2 1
	 *    
	 *  tens 
	 *    10
	 *    	if units is less than <2  and tens is < 2 
	 *          then we don't add 
	 *    16
	 *		if units is greater than >2  and tens is < 2 
	 *          then we add +1 
	 *    26
	 *    	if units is greater than >2  and tens is = 2 
	 *          then we add +1 
	 *          
	 *    31      
	 *    	if units is greater than <2  and tens is > 2
	 *    
	 *    34
	 *    	if units is greater than >2  and tens is > 2
	 *     	
	 *    1 0 0  0  2
	 *       10*10*10
	 *       
	 *  
	 *   9
	 *   x>=2	  1 digit number = 10^1/10 =1 
	 *   x<2      1 digit number = 10^(1-1)/10 = 0
	 *   x=2
	 *   
	 *   16 
	 *   	      1st digit be 2 : 10/10 
	 *   					
	 *       
	 * @param n
	 * @return
	 */
	public static int numberOf2Between0AndN(int n){
		int index = String.valueOf(n).length();
		int k =0;
		for(int i=0;i<index;i++){
			k+=NumberOf2Between.count2InDigits(n,i);
		}
		return k;
	}
	
	/**
	 * 16 
	 *  2,12 
	 * @param n
	 * @param i
	 * @return
	 */
	private static int count2InDigits(int n, int i) {
		int pow10 = (int) Math.pow(10, i);
		int nextPow10=pow10*10;
		int right = n%pow10;
		int roundDown = n-(n%nextPow10);
		int roundUp=roundDown+nextPow10;
		int digit = (n /pow10)%10;
		if (digit < 2){
			return roundDown/10;
		}else if(digit >2 ){
			return roundUp/10;
		}else{
			return roundDown/10 + right + 1;
		}
		
		
	}


}
