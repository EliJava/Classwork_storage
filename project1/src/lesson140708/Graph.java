package lesson140708;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	final int vertices;
	private int edges;
	List<List<Integer>> adjacencyLists;
	
	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyLists = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjacencyLists.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int v, int w){
		edges++;
		List<Integer> vList = adjacencyLists.get(v);
		vList.add(w);
		List<Integer> wList = adjacencyLists.get(w);
		wList.add(v);
	}

	public int edges() {
		return edges;
	}

	public boolean areConnected(int v, int w) {
		return adjacencyLists.get(v).contains(w);
	}


	
}
