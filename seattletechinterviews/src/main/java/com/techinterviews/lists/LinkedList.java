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

	public void reverse() {
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
