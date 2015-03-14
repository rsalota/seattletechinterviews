package com.techinterviews.lists;

import junit.framework.Assert;

import org.junit.Test;

public class ReverseLinkedListTest {
	
	@Test
	public void reverseEmptyList(){
		LinkedList list = new LinkedList();
		list.reverse();
	}

	@Test
	public void reverseOneList(){
		LinkedList list = new LinkedList();
		list.add(1);
		list.reverse();
		ListNode l = list.get(0);
		Assert.assertEquals(1, l.value);
	}
	
	
	@Test
	public void reverseTwoList(){
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.reverse();
		ListNode l = list.get(0);
		Assert.assertEquals(1, l.value);
	}
	
	@Test
	public void testOhOfNComplexSolution(){
		LinkedList list = new LinkedList();
		
		for(int i=0;i<10000000;i++){
			list.add(i);
		}
		long startTime = System.currentTimeMillis();
		list.reverse();
		long endTime = System.currentTimeMillis();
		long timeTaken= endTime - startTime;
		
		
		for(int i=0;i<100000000;i++){
			list.add(i);
		}
		startTime = System.currentTimeMillis();
		list.reverse();
		endTime = System.currentTimeMillis();
		long timeTaken2= endTime - startTime;
		double ration = timeTaken2/timeTaken;
		 
		System.out.println("Ration of 100000000/10000000  : " + ration );
	}
	
}
