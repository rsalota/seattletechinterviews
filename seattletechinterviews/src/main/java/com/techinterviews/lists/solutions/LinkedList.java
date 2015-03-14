package com.techinterviews.lists.solutions;

import com.techinterviews.lists.ListNode;

public class LinkedList {
	ListNode head;

	public void add(int k) {

		if (head == null) {
			head = new ListNode();
			head.value = k;
		} else {
			ListNode current = head;
			head = new ListNode();
			head.value = k;
			head.next = current;
		}
	}

	public void insert(int k, int at) {

		if (at < 0) {
			throw new IllegalArgumentException(
					"Insert at location must always be > 0");
		}

		/**
		 * 1. First location at = 0 , linked list not initialized 2. Nth
		 * location 2nd , linked list has 2 elements [0]->[1]->[2] linked list
		 * has 3 elements [0]->[1]->[2] linked list has 1 element [0]
		 */
		ListNode current = head;
		ListNode prev = null;

		while (current != null && at > 0) {
			prev = current;
			current = current.next;
			at--;
		}

		ListNode l = new ListNode();
		l.value = k;

		if (at > 0) {
			throw new IllegalArgumentException(
					"sorry not able to "
							+ " add to this index because there are not enough elements in it.");
		}

		if (prev == null && at == 0) {
			l.next = head;
			head = l;
		} else {
			ListNode tmp = prev.next;
			prev.next = l;
			l.next = tmp;
		}
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
