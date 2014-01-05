package com.techinterviews.queues;

import org.junit.Assert;
import org.junit.Test;

public class CircularQueueUsingArraysTest {
	
	@Test(expected=Exception.class)
	public void testSizeOfZero(){
		CircularQueueUsingArrays circularQ = new CircularQueueUsingArrays(0);
		Assert.fail("Should not let 0 size queue ");
	}
	
	@Test
	public void testSizeOf1EnqueueDeque(){
		CircularQueueUsingArrays circularQ = new CircularQueueUsingArrays(1);
		circularQ.enqueue(1);
		int v = circularQ.dequeue();
		Assert.assertEquals(1, v);
	}
	
	@Test(expected=Exception.class)
	public void testSizeOf1EnqueueDequeTwice(){
		CircularQueueUsingArrays circularQ = new CircularQueueUsingArrays(1);
		circularQ.enqueue(1);
		int v = circularQ.dequeue();
		Assert.assertEquals(1, v);
		v = circularQ.dequeue();
		Assert.fail("Should not reach here it allowed more than 1 deuque on a single enqueue");
	}
	
	@Test
	public void testWeDontExceedDeques(){
		CircularQueueUsingArrays circularQ = new CircularQueueUsingArrays(100);
		for(int i=0;i<1;i++){
			circularQ.enqueue(i);
		}
		int j=0;
		try{
			
			for(j=0;j<2;j++){
				circularQ.dequeue();
			}
		}catch(Exception ex){
			Assert.assertEquals(1,j);
		}
	}
	
	@Test
	public void testWeDontOverEnqueue(){
		CircularQueueUsingArrays circularQ = new CircularQueueUsingArrays(2);
		int i=0;
		try{
			for( i=0;i<3;i++){
				circularQ.enqueue(i);
			}
		}catch(Exception ex){
			Assert.assertEquals(2,i);
		}
	}
}
