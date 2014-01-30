package com.techinterviews.graphs;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class AdjacencyGraphRemoveTest {

	private AdjacencyGraph g;

	@Before
	public void setup() {
		g = new AdjacencyGraph(10);
	}

	@Test
	public void testAdjacencyGraphEdgeRemove() {
		g.addEdge(1, 1);
		Assert.assertTrue(g.hasEdge(1, 1));
		g.removeEdge(1, 1);
		Assert.assertFalse(g.hasEdge(1, 1));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testOutOfBoundNegativeAdjacencyGraphSet() {
		g.removeEdge(-1, 1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testOutOfBoundAdjacencyGraphSet() {
		g.removeEdge(111, 111);
	}
}
