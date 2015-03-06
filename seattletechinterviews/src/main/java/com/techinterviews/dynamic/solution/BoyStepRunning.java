package com.techinterviews.dynamic.solution;

import java.util.HashMap;
import java.util.Map;

public class BoyStepRunning {
	
	public static void main(String args[]){
		System.out.println(countStep(20,19,new HashMap<Integer,Integer>()));
	}
	
	public static int countStep(int n,int m ,Map<Integer,Integer> map ){
		if (n < 0){
			return 0;
		}else if(n == 0){
			return 1;
		}
		
		if (map.get(n) !=null){
			return map.get(n);
		}
		
		int k =0;
		for (int i=1;i<=m;i++){
			 k += countStep(n-i,m,map) ;
		}
		
		map.put(n, k);
		
		return k;
	}

}
