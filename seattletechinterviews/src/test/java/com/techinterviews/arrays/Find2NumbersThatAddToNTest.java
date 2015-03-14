package com.techinterviews.arrays;

import java.util.Arrays;

import org.junit.Test;

import com.techinterviews.arrays.Find2NumbersThatAddToN;

import junit.framework.Assert;

public class Find2NumbersThatAddToNTest {
	
	@Test
	public void testNormalNumbers(){
		int numbers[]={1,2,3,4};
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, 7);
		Arrays.sort(result);
		Assert.assertEquals(result[0], 3);
		Assert.assertEquals(result[1], 4);
	}
	
	@Test
	public void testDupsNumbers(){
		int numbers[]={1,3,4,4};
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, 8);
		Arrays.sort(result);
		Assert.assertEquals(result[0], 4);
		Assert.assertEquals(result[1], 4);
	}
	
	@Test
	public void testBigNumbers(){
		int numbers[]={1,2,Integer.MAX_VALUE,4};
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, 7);
		Arrays.sort(result);
		Assert.assertEquals(result[0], 2);
		Assert.assertEquals(result[1], Integer.MAX_VALUE+2);
	}
	
	
	@Test
	public void testNegativeNumbers(){
		int numbers[]={1,2,-2,4};
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, 0);
		Arrays.sort(result);
		Assert.assertEquals(result[0], -2);
		Assert.assertEquals(result[1], 2);
	}
	
	@Test
	public void testWhenNumberDoesNotExist(){
		int numbers[]={1,2,-2,3};
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, 2);
		Assert.assertEquals(0,result.length);
	}
	
	@Test
	public void testTakesTooMuchTime(){
		int numbers[]=new int[100001];
		for(int i=0;i<100001;i++){
			numbers[i]=i;
		}
		long start = System.currentTimeMillis();
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, 199999);
		long end = System.currentTimeMillis();
		Arrays.sort(result);
		Assert.assertEquals(result[0], 99999);
		Assert.assertEquals(result[1], 100000);
		Assert.assertTrue((end-start) < 1000);
	}
	
	@Test
	public void testNullArray(){
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		f.algorithm(null, 1);
	}
	
	public void testNegativeSum(){
		int numbers[]={1,-22,-2,4};
		Find2NumbersThatAddToN f = new Find2NumbersThatAddToN();
		int result[] = f.algorithm(numbers, -24);
		Arrays.sort(result);
		Assert.assertEquals(result[0], -22);
		Assert.assertEquals(result[1], -2);
	}
	
}
