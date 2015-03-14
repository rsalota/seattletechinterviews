package com.techinterviews.tree;

public class Heap {
	int array[];
	int size;

	public Heap(int n) {
		array = new int[n];
		size = 0;
	}

	public void add(int v) {
		int index = size;
		size++;
		array[index] = v;
		while (index > 0) {
			int parent = -1;
			if (index % 2 == 0) {
				parent = (index - 2) / 2;
			} else {
				parent = (index - 1) / 2;
			}
			
			if (array[index] > array[parent]) {
				int tmp = array[index];
				array[index] = array[parent];
				array[parent] = tmp;
				index=parent;
			}else{
				break;
			}
		}

	}

	public void remove() {
	}
	
	public void printHeap(){
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String args[]){
		Heap h = new Heap(10);
		h.add(7);
		h.add(9);
		h.add(6);
		h.add(11);
		h.printHeap();
	}

}
