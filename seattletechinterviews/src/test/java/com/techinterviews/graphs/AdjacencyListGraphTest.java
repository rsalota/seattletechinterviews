package com.techinterviews.graphs;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class AdjacencyListGraphTest {

	private AdjacencyListGraph g;

	@Before
	public void setup() {
		g = new AdjacencyListGraph();
	}

	@Test
	public void testAdjacencyGraphSet() {
		g.addEdge(1, 1);
		Assert.assertTrue(g.hasEdge(1, 1));
	}
	
	@Test
	public void testNotALoopAdjacencyGraphSet() {
		g.addEdge(11, 1);
		Assert.assertTrue(g.hasEdge(11, 1));
		Assert.assertTrue(g.hasEdge(1, 11));
	}
}
