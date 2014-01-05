package com.techinterviews.queues.solutions;

public class CircularQueueUsingArrays {
	int [] array;
	int head;
	int tail;
	
	public CircularQueueUsingArrays(int size){
		if (size < 1 ){
			throw new IllegalArgumentException("Too small a size");
		}
		array = new int[size];
		head = 0;
		tail = 0;
	}
	
	/**
	 * Size of array : 1
	 *  Insert 1 element.
	 *  Dequeue 1 element.
	 *  
	 *  Size of array : 5 
	 *     Insert 1 
	 *   
	 * @param v
	 */
	public void enqueue(int v){
 		int size= ((head - tail) > 0 ? head -tail : -1 * (head - tail) ) + 1;
		if (size > array.length){
			throw new IllegalArgumentException("No more space");
		}		
		if (tail < 0 ){
			tail = 0;
		}
		array[tail] = v;
		if (tail + 1  == array.length){
			if (head == 0){
				tail = -1;
			}else{
				tail = 0;
			}
		}else{
			tail++;
		}
	}
	
	public int dequeue(){
		if (head == tail){
			throw new IllegalArgumentException("Sorry no element in the queue");
		}
		
		if (tail == -1){
			tail = 0;
		}
		
		int v = array[head];
		if (head + 1 == array.length){
			head = 0;
		}else{
			head++;
		}
		return v;
	}
	

}
