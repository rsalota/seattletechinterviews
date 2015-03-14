package com.techinterviews.graphs.solutions;

import java.util.LinkedList;
import java.util.List;

public class AdjacencyListGraph {
	
	List<Vertex> vs = new LinkedList<AdjacencyListGraph.Vertex>();

	class Vertex {
		int vertex;
		List<Vertex> adjacent = new LinkedList<Vertex>();

		public Vertex(int vertex) {
			this.vertex = vertex;
		}
	}

	public void addEdge(int vi, int vj) {
		Vertex vFrom = null;
		Vertex vTo = null;
		//find the vertex
		for (Vertex v : vs) {
			if (v.vertex == vi) {
				vFrom = v;
			}
			
			if (v.vertex == vj) {
				vTo = v;
			}
		}
		//vertex vFrom not found 
		if (vFrom == null) {
			vFrom = new Vertex(vi);
			vs.add(vFrom);
		}
		//both v1 and vj are equal
		if (vi != vj){
			if (vTo == null) {
				vTo = new Vertex(vj);
				vs.add(vTo);
			}
			vFrom.adjacent.add(vTo);
			vTo.adjacent.add(vFrom);
		}else{
			vFrom.adjacent.add(vFrom);
		}
	}

	public void removeEdge(int vi, int vj) {
		Vertex vFrom = null;
		Vertex vTo = null;
		
		for (Vertex v : vs) {
			if (v.vertex == vi) {
				vFrom = v;
			}
			
			if (v.vertex == vj) {
				vTo = v;
			}
		}
		
		if (vFrom == null || vTo == null){
			throw new IllegalArgumentException("The vertices donot exit");
		}
		
		vFrom.adjacent.remove(vTo);
		vTo.adjacent.remove(vFrom);
	}

	public boolean hasEdge(int vi, int vj) {
		Vertex vFrom = null;
		Vertex vTo = null;

		for (Vertex v : vs) {
			if (v.vertex == vi) {
				vFrom = v;
			}
			if (v.vertex == vj) {
				vTo = v;
			}
		}
		
		if (vFrom == null || vTo == null){
			return false;
		}
		
		for(Vertex v2 : vFrom.adjacent){
			if (v2.vertex == vj){
				return true;
			}
		}
		return false;
	}

}
