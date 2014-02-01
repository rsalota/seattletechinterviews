package com.techinterviews.tree;

import java.util.Stack;
import java.util.TreeMap;

public class Tree {
	Node root;
	
	private java.util.TreeMap<Integer, Integer> integerMap = new TreeMap<Integer, Integer>();

	public void insert(int value) {
		if (root == null) {
			root = new Node();
			root.value = value;
			return;
		}
		
		Node n = root;
		Node p = null;
		
		while( n != null){
			if (n.value > value){
				p = n;
				n = n.left;
			}else{
				p = n;
				n = n.right;
			}
		}
		
		Node newChild = new Node();
		newChild.value = value;
		if (p.value > value){
			p.left = newChild;
		}else{
			p.right = newChild;
		}
	}
	/**
	 *   3 
	 * 1    7
	 * 3,
	 */
	public void inOrderTraversal(){
		if (root == null){
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node n = root;
		while(n != null){
			stack.add(n);
			if (n.right != null){
				n = n.right;
				continue;
			}
			
			if (n.left != null){
				n = n.left;
				continue;
			}
		}
	}

}
