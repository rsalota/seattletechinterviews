package com.techinterviews.arrays.solution;

public class Factorial {
	
	public class MyBigInteger {
		int value;
		int maxMultiplier;
		
		public MyBigInteger(int myInt){
		}
		
		public MyBigInteger(MyBigInteger myInt){
			this.value = myInt.value;
			this.maxMultiplier=myInt.maxMultiplier;
		}

		public MyBigInteger add(MyBigInteger bigInteger){
			if (bigInteger.value > 0 && value>0){
				if (Integer.MAX_VALUE - bigInteger.value > value){
					maxMultiplier++;
					value=Integer.MAX_VALUE - bigInteger.value;
				}else{
					value=Integer.MAX_VALUE - bigInteger.value;
				}
			}
			return bigInteger;
		}
		
		public MyBigInteger multiply(MyBigInteger bigInteger){
			return null;
		}
		
		public MyBigInteger divide(MyBigInteger bigInteger){
			return null;
		}
		
		public void print(){
			
		}
	}

	public MyBigInteger algorithm(){
		return new MyBigInteger(100);
	}
}
