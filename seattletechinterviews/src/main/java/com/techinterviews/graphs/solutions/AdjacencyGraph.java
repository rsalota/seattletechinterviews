package com.techinterviews.graphs.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
	
	public List<Integer> bfs(int vertex) {
		if (graph.length <= vertex) {
			throw new IllegalArgumentException(
					"Vertex is not present in the graph");
		}
		List<Integer> bfsTraversal = new LinkedList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(vertex);
		while (!q.isEmpty()) {
			vertex = q.remove();

			if (bfsTraversal.contains(vertex)) {
				continue;
			}

			for (int j = 0; j < graph[0].length; j++) {
				if (graph[vertex][j] == 1) {
					q.add(j);
				}
			}

			bfsTraversal.add(vertex);
		}
		
		return bfsTraversal;
	}
	
	public List<Integer> dfs(int vertex){
		if (graph.length <= vertex) {
			throw new IllegalArgumentException(
					"Vertex is not present in the graph");
		}
		List<Integer> dfsTraversal = new LinkedList<Integer>();
		Stack<Integer> q = new Stack<Integer>();
		q.push(vertex);
		while (!q.isEmpty()) {
			vertex = q.pop();

			if (dfsTraversal.contains(vertex)) {
				continue;
			}

			for (int j = 0; j < graph[0].length; j++) {
				if (graph[vertex][j] == 1) {
					q.push(j);
				}
			}

			dfsTraversal.add(vertex);
		}
		
		return dfsTraversal;
	}
}
