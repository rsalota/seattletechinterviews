package com.techinterviews.lists;

import org.junit.Assert;
import org.junit.Test;

public class InsertAtLinkedListTest {
	
	@Test
	public void insertAtZeroLocationWhenEmptyList(){
		LinkedList list = new LinkedList();
		list.insert(10, 0);
		ListNode n = list.get(0);
		Assert.assertEquals(10,n.value);
	}
	
	@Test
	public void insertAtZeroLocationWhenListNotEmpty(){
		LinkedList list = new LinkedList();
		list.add(7);
		list.insert(10, 0);
		ListNode n = list.get(0);
		Assert.assertEquals(10,n.value);
		
		ListNode n2 = list.get(1);
		Assert.assertEquals(7,n2.value);
	}
	
	@Test
	public void insertAtNthLocationWhenListNotEmpty(){
		LinkedList list = new LinkedList();
		list.add(7);
		list.add(8);
		list.insert(10, 1);
		ListNode n = list.get(0);
		Assert.assertEquals(8,n.value);
		ListNode n2 = list.get(1);
		Assert.assertEquals(10,n2.value);
	}
	
	@Test(expected=Exception.class)
	public void insertAtLocationNotYetExisiting(){
		LinkedList list = new LinkedList();
		list.add(7);
		list.add(8);
		list.insert(10, 10);			
		Assert.fail("Should have thrown an exception");
		
	}
	
	@Test(expected=Exception.class)
	public void insertAtNegativeLocation(){
		LinkedList list = new LinkedList();
		list.add(7);
		list.add(8);
		list.insert(10, -10);			
		Assert.fail("Should have thrown an exception");
		
	}

}
