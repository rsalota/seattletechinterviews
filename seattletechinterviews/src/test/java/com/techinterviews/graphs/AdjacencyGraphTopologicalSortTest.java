package com.techinterviews.graphs;

import java.util.List;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techinterviews.graphs.AdjacencyGraph;

/**
 * Tests the following condition for topological sort 
 *
 * 1. Simple graph 0->1->2->3
 * 
 * 2. Graph with a loop 
 *     1<-0->2->3
 *       | ^    
 *       | |
 *       ->3
 * 3. Multi Root Graph 
 *  
 * @author rsalota
 *
 */
public class AdjacencyGraphTopologicalSortTest {
	AdjacencyGraph g;
	
	@Before
	public void setup(){
		g = new AdjacencyGraph(4);
	}
	
	@Test
	public void testSimpleTopologicalSort(){
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		List<Integer> sorted = g.topologicalSort();
		
		Assert.assertEquals(0,sorted.get(0).intValue());
		Assert.assertEquals(1,sorted.get(1).intValue());
		Assert.assertEquals(2,sorted.get(2).intValue());
		Assert.assertEquals(3,sorted.get(3).intValue());
	}
	
	
	@Test
	public void testSimpleTopologicalSortWithLoop(){
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 3);
		g.addEdge(0,1);
		g.addEdge(3,0);
		Assert.assertEquals(g.topologicalSort().size(),0);
	}
	
	@Test
	public void testMultipleRootsTopologicalSortWithLoop(){
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		List<Integer> sorted = g.topologicalSort();
		if (sorted.get(0).intValue() == 0 ){
			Assert.assertEquals(0,sorted.get(0).intValue());
			Assert.assertEquals(1,sorted.get(1).intValue());
			Assert.assertEquals(2,sorted.get(2).intValue());
			Assert.assertEquals(3,sorted.get(3).intValue());
		}else if (sorted.get(0).intValue() ==1){
			Assert.assertEquals(1,sorted.get(0).intValue());
			Assert.assertEquals(0,sorted.get(1).intValue());
			Assert.assertEquals(2,sorted.get(2).intValue());
			Assert.assertEquals(3,sorted.get(3).intValue());
		}
	}
}
