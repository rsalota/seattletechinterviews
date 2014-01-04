package com.techinterviews.lists;

public class LinkedList {
	ListNode head;
	/**
	 * Please implement and execute the <code>AddLinkedListTest</code> 
	 * 
	 * @param k
	 */
	public void add(int k) {
	}

	/**
	 * Please implement and execute the <code>InsertAtLikedListTest</code>
	 * @param k
	 * @param at
	 */
	public void insert(int k, int at) {
		
	}

	/**
	 * 1. Empty linked list 
	 * 2. One element [0]->null 
	 * 2. 2 elements [0]=>[1]=>NULL
	 * 3. 3 elements 
	 */
	public void reverse() {
		if (head == null){
			return;
		}
		ListNode current = head;
		ListNode prev = null;
		while(current != null){
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public ListNode get(int at) {
		ListNode current = head;
		while (current != null) {
			if (at == 0) {
				return current;
			} else {
				current = current.next;
				at--;
			}
		}
		return current;
	}
}
