package com.techinterviews.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseKAtTimeTest {
	@Test
	public  void testEmptyArray(){
		ReverseKAtTime reverseK = new ReverseKAtTime();
		int [] array = reverseK.algorithm(new int[0], 1);
		Assert.assertArrayEquals(array, new int[0]);
	}
	
	@Test
	public  void testNonEmptyArrayWithK1(){
		int [] arrays={1,2,3,4,5};
		ReverseKAtTime reverseK = new ReverseKAtTime();
		int [] newArray = reverseK.algorithm(arrays, 1);
		Assert.assertArrayEquals(newArray, arrays);
	}
	
	@Test
	public  void testNonEmptyArrayWithK2(){
		int [] arrays={1,2,3,4,5};
		int [] result={2,1,4,3,5};
		ReverseKAtTime reverseK = new ReverseKAtTime();
		int [] newArray = reverseK.algorithm(arrays, 2);
		Assert.assertArrayEquals(result,newArray);
	}
	
	@Test
	public  void testNonEmptyArrayWithK3(){
		int [] arrays={1,2,3,4,5};
		int [] result={3,2,1,4,5};
		ReverseKAtTime reverseK = new ReverseKAtTime();
		int [] newArray = reverseK.algorithm(arrays, 3);
		Assert.assertArrayEquals(result,newArray);
	}

	@Test
	public  void testNonEmptyArrayWithK3AndNum6(){
		int [] arrays={1,2,3,4,5,6};
		int [] result={3,2,1,6,5,4};
		ReverseKAtTime reverseK = new ReverseKAtTime();
		int [] newArray = reverseK.algorithm(arrays, 3);
		Assert.assertArrayEquals(result,newArray);
	}
	
	@Test
	public  void testNonEmptyArrayWithK5(){
		int [] arrays={1,2,3,4,5,6};
		int [] result={5,4,3,2,1,6};
		ReverseKAtTime reverseK = new ReverseKAtTime();
		int [] newArray = reverseK.algorithm(arrays, 5);
		Assert.assertArrayEquals(result,newArray);
	}

}
