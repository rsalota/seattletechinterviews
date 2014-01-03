package com.techinterviews.arrays;
import java.util.Random;

import junit.framework.Assert;

import org.junit.Test;

import com.techinterviews.arrays.ArrangeNumbersInAlternationOrders;
public class ArrangeNumbersInAlternateOrdersTest {
	@Test
	public void testNormalNumbers(){
		int array[] = {3, 5, 7, 8, 4, 9};
		int arrayResult[] = { 3 , 5 , 4, 8 ,7 , 9};
		ArrangeNumbersInAlternationOrders arrange = new ArrangeNumbersInAlternationOrders();
		arrange.algorithm(array);
		compareArrays(array, arrayResult);
	}

	private void compareArrays(int[] array, int[] arrayResult) {
		for(int i=0;i<array.length;i++){
			Assert.assertEquals(array[i], arrayResult[i]);
		}
	}
	
	@Test
	public void testNegNumbers(){
		int array[] = {3,1,2,3,-1,-1,-1};
		int arrayResult[] = {-1,-1,-1,2,1,3,3};
		ArrangeNumbersInAlternationOrders arrange = new ArrangeNumbersInAlternationOrders();
		arrange.algorithm(array);
		compareArrays(array, arrayResult);
	}
	
	@Test
	public void testJust1Number(){
		int array[] = {3};
		int arrayResult[] = {3};
		ArrangeNumbersInAlternationOrders arrange = new ArrangeNumbersInAlternationOrders();
		arrange.algorithm(array);
		compareArrays(array, arrayResult);
	}

	@Test
	public void testJust2Number(){
		int array[] = {3,-1};
		int arrayResult[] = {-1,3};
		ArrangeNumbersInAlternationOrders arrange = new ArrangeNumbersInAlternationOrders();
		arrange.algorithm(array);
		compareArrays(array, arrayResult);
	}
	
	@Test
	public void testLargeNumbers(){
		int array[] = {Integer.MIN_VALUE,1,2,3,-1,-1,Integer.MAX_VALUE};
		int arrayResult[] = {Integer.MIN_VALUE,-1,-1,2,1,Integer.MAX_VALUE,3};
		ArrangeNumbersInAlternationOrders arrange = new ArrangeNumbersInAlternationOrders();
		arrange.algorithm(array);
		compareArrays(array, arrayResult);
	}
	
	@Test
	public void testTimeComplexityNumbers(){
		
		int array[] = new int [1000];
		Random r = new Random(10000000);
		for(int i=0;i<1000;i++){
			int random =r.nextInt();
			array[i] =random;
		}
		long start = System.currentTimeMillis();
		ArrangeNumbersInAlternationOrders arrange = new ArrangeNumbersInAlternationOrders();
		arrange.algorithm(array);
		long end = System.currentTimeMillis();
		long timeSpent = end - start; 
		System.out.println("Total time 1000 "  + (end -start));
		
		int array2[] = new int [10000];
		Random r2 = new Random(10000000);
		for(int i=0;i<10000;i++){
			int random =r2.nextInt();
			array2[i] =random;
		}
		long start1 = System.currentTimeMillis();
		ArrangeNumbersInAlternationOrders arrange1 = new ArrangeNumbersInAlternationOrders();
		arrange1.algorithm(array2);
		long end1 = System.currentTimeMillis();
		
		long timeSpent1 = end1 - start1;
		System.out.println("Total time 10000 "  + (end1 -start1));
//		double ratio = timeSpent1/timeSpent;
//		System.out.println("Ratio 10000/1000 : " + ratio);
		
		int array3[] = new int [100000];
		Random r3 = new Random(10000000);
		for(int i=0;i<100000;i++){
			int random =r3.nextInt();
			array3[i] =random;
		}
		
		long start3 = System.currentTimeMillis();
		ArrangeNumbersInAlternationOrders arrange3 = new ArrangeNumbersInAlternationOrders();
		arrange1.algorithm(array3);
		long end3 = System.currentTimeMillis();
		long timeSpent3 = end3 - start3;
		
		double ratio2 = timeSpent3/timeSpent1;
		System.out.println("Total time 10000 "  + (end3 -start3));
		System.out.println("Ratio 100000/10000 : " + ratio2);
		Assert.assertTrue(ratio2 < 100);
	}
	
}
