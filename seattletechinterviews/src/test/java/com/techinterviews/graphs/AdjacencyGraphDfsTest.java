package com.techinterviews.graphs;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class AdjacencyGraphDfsTest {
	private com.techinterviews.graphs.solutions.AdjacencyGraph adj;

	@Before
	public void setUp() {
		adj = new com.techinterviews.graphs.solutions.AdjacencyGraph(10);
	}

	@Test
	public void adjacencyMatrixDfsTest() {
		adj.addEdge(1, 1);
		adj.addEdge(1, 4);
		adj.addEdge(1, 2);
		adj.addEdge(2, 3);
		adj.addEdge(2, 3);
		adj.addEdge(4, 6);
		List<Integer> dfsT = adj.dfs(1);
		Assert.assertEquals(dfsT.get(0), new Integer(1));
		Assert.assertEquals(dfsT.get(1), new Integer(4));
		Assert.assertEquals(dfsT.get(2), new Integer(6));
		Assert.assertEquals(dfsT.get(3), new Integer(2));
		Assert.assertEquals(dfsT.get(4), new Integer(3));
	}
	
	@Test
	public void adjacencyMatrixDfsTest2() {
	    adj.addEdge(0, 1);
	    adj.addEdge(0, 2);
	    adj.addEdge(1, 2);
	    adj.addEdge(2, 0);
	    adj.addEdge(2, 3);
	    adj.addEdge(3, 3);
		List<Integer> dfsT = adj.dfs(2);
		Assert.assertEquals(dfsT.get(0), new Integer(2));
		Assert.assertEquals(dfsT.get(1), new Integer(3));
		Assert.assertEquals(dfsT.get(2), new Integer(0));
		Assert.assertEquals(dfsT.get(3), new Integer(1));
		
	}
	

}
