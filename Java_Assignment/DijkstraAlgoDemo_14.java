package datastructure.nonlinear.graphalgo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class DijkstraAlgoDemo {
	private int vertices;
	private LinkedList<Node>[] adjList;
	
		// TODO Auto-generated method stub
		
		class Node implements Comparable<Node>{
			int dest;
			int weight;
			
			Node(int d,int w){
				dest= d;
				weight =w;
				
			}
			
			public int compareTo(Node other) {
				return Integer.compare(this.weight, other.weight);
			}
		}
		
		 DijkstraAlgoDemo(int v){
			vertices =v;
			adjList = new LinkedList[v];
			for(int i=0; i<v; i++) {
				adjList[i] = new LinkedList<>();  
			}
		}
	
		void addEdge(int src, int dest, int weight) {
	// TODO Auto-generated method stub
	
			adjList[src].add(new Node(dest, weight));
			adjList[dest].add(new Node(src, weight));
		}
		
		void dijkstra(int start) {
			PriorityQueue<Node> pq =new PriorityQueue<>();
			int[] dist =new int[vertices];
			boolean[] visited= new boolean[vertices];
			
			Arrays.fill(dist, Integer.MAX_VALUE);
			dist[start]=0;
			pq.add(new Node(start, 0));
		

			while(!pq.isEmpty()) {
				Node node= pq.poll();
				int u =node.dest;
				
				if(!visited[u]) {
					visited[u] =true;
					for(Node neigbhor:adjList[u] ) {
						int v = neigbhor.dest;
						int weight =neigbhor.weight;
				 
			
				 if(!visited[v] && 
					 dist[u] != Integer.MAX_VALUE && dist[u]+
					 weight < dist[v]) {
		
					 dist[v] = dist[u] + weight;
					 pq.add(new Node(v, dist[v]));
			}
	
			}
		 }
	 }
	 
	 printSolution(dist);
}
 
	
private void printSolution(int[] dist) {
		System.out.println("Vertex \t Distance from source ");
		
		for(int i=0;i<dist.length; i++) {
			System.out.println(i+ "\t\t" +dist[i]);
		}
}
	
	public static void main(String[] args) {
		int V =5;
		DijkstraAlgoDemo g = new DijkstraAlgoDemo(V);
		g.addEdge(0, 1, 10);
		g.addEdge(0, 2, 1);
		g.addEdge(0, 3, 4);
		g.addEdge(1, 2, 2);
		g.addEdge(1, 3, 5);
		g.addEdge(1, 4, 1);
		g.addEdge(2, 3, 2);
		g.addEdge(3, 4, 3);
		
		
		g.dijkstra(0);
}
}

	