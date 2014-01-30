package com.techinterviews.graphs.solutions;

public class AdjacencyGraph {
	
	private int[][] graph;

	public AdjacencyGraph(int n) {
		graph = new int[n][n];
	}

	public void addEdge(int i, int j) {
		if (i >= graph.length || j >= graph[0].length || i< 0 || j < 0){
			throw new IllegalArgumentException("No vertex at location " + i + ":" + j);
		}
		graph[i][j] = 1;
	}

	public void removeEdge(int i, int j) {
		if (i >= graph.length || j >= graph[0].length || i< 0 || j < 0){
			throw new IllegalArgumentException("No vertex at location " + i + ":" + j);
		}
		graph[i][j] = 0;
	}

	public boolean hasEdge(int i, int j) {
		
		if (i >= graph.length || j >= graph[0].length || i< 0 || j < 0){
			throw new IllegalArgumentException("No vertex at location " + i + ":" + j);
		}
		
		if (graph[i][j] == 1) {
			return true;
		} else {
			return false;
		}
	}

}
