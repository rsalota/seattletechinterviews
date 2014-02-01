package com.techinterviews.graphs;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class AdjacencyGraphBfsTest {
	private AdjacencyGraph adj;

	@Before
	public void setUp() {
		adj = new AdjacencyGraph(10);
	}

	@Test
	public void adjacencyMatrixBfsTest() {
		adj.addEdge(1, 1);
		adj.addEdge(1, 4);
		adj.addEdge(1, 2);
		adj.addEdge(2, 3);
		adj.addEdge(2, 3);
		adj.addEdge(4, 6);
		List<Integer> bfsT = adj.bfs(1);
		Assert.assertEquals(bfsT.get(0), new Integer(1));
		Assert.assertEquals(bfsT.get(1), new Integer(2));
		Assert.assertEquals(bfsT.get(2), new Integer(4));
		Assert.assertEquals(bfsT.get(3), new Integer(3));
		Assert.assertEquals(bfsT.get(4), new Integer(6));
	}

}
