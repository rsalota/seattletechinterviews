package com.techinterviews.graphs;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class AdjacencyGraphRemoveTest {

	private AdjacencyListGraph g;

	@Before
	public void setup() {
		g = new AdjacencyListGraph();
	}

	@Test
	public void testAdjacencyGraphEdgeRemove() {
		g.addEdge(1, 1);
		Assert.assertTrue(g.hasEdge(1, 1));
		g.removeEdge(1, 1);
		Assert.assertFalse(g.hasEdge(1, 1));
	}
	
	
	@Test
	public void testAdjacencyGraphEdgeRemoveNotALoop() {
		g.addEdge(11, 1);
		Assert.assertTrue(g.hasEdge(11, 1));
		g.removeEdge(1, 11);
		Assert.assertFalse(g.hasEdge(11, 1));
	}

}
