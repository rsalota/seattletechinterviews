package com.techinterviews.graphs;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class AdjacencyGraphAddTest {

	private AdjacencyGraph g;

	@Before
	public void setup() {
		g = new AdjacencyGraph(10);
	}

	@Test
	public void testAdjacencyGraphSet() {
		g.addEdge(1, 1);
		Assert.assertTrue(g.hasEdge(1, 1));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testOutOfBoundNegativeAdjacencyGraphSet() {
		g.addEdge(-1, 1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testOutOfBoundAdjacencyGraphSet() {
		g.addEdge(111, 111);
	}

}
