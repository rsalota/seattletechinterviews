package com.techinterviews.hard.solution;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleDeckOfCards {

	/**
	 * 52 cards and you would like to shuffle  
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		int [] shuffle = ShuffleDeckOfCards.shuffleD(52);
		for(int i=0;i<52;i++){
			System.out.println(shuffle[i]);			
		}
		
	}
	/**
	 *  ->[0,1]
	 *  [0,1] or [1,0]
	 *  [1/k*1/k*1/k...] 
	 *  
	 * 
	 * @param n
	 * @return
	 */
	public static int[] shuffleDeterministic(int n){
		Random r = new Random(52);
		Set<Integer> s = new HashSet<Integer>();
		int shuffle[] = new int[n];
		for(int i=0;i<n;i++){
			while(true){
				int v = r.nextInt();
				int cardId=Math.abs(v%n);
				if (s.contains(cardId)){
					System.out.println("wasted");
					continue;
				}else{
					s.add(cardId);
					shuffle[i]=cardId;
					break;
				}
			}
		}
		return shuffle;
	}

	public static int[] shuffleD(int n){
		Random r = new Random(52);
		int shuffle[] = new int[n];
		for (int i=0;i<n;i++){
			int k = Math.abs(r.nextInt());
			
			int v = k%(i+1);
			int tmp = shuffle[v];
			shuffle[v]=i;
			shuffle[i]=tmp;
		}
		return shuffle;
	}
	
	
	/**
	 * Non deterministic 
	 * 
	 * @param n
	 * @return
	 */
	public static int[] shuffle(int n){
		Random r = new Random(52);
		Set<Integer> s = new HashSet<Integer>();
		int shuffle[] = new int[n];
		for(int i=0;i<n;i++){
			while(true){
				int v = r.nextInt();
				int cardId=Math.abs(v%n);
				if (s.contains(cardId)){
					System.out.println("wasted");
					continue;
				}else{
					s.add(cardId);
					shuffle[i]=cardId;
					break;
				}
			}
		}
		return shuffle;
	}
	
	
}
