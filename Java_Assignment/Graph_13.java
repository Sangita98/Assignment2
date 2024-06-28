package assignment;

import java.util.*;

public class Graph_13 {

		private Map<Integer, List<Integer>> adjacencyList;
		
		public Graph_13(){
			adjacencyList=new HashMap<>();
		}
		
		public void addVertex(int vertex) {
			adjacencyList.putIfAbsent(vertex, new ArrayList<>());
		}
		
		public void addEdge(int vertex1, int vertex2) {
			adjacencyList.putIfAbsent(vertex1, new ArrayList<>());
			adjacencyList.putIfAbsent(vertex2, new ArrayList<>());
			adjacencyList.get(vertex1).add(vertex2);
			adjacencyList.get(vertex2).add(vertex1);

		}
		
		public void removeVertex(int vertex) {
			adjacencyList.values().forEach(e -> e.remove(Integer.valueOf(vertex)));
			adjacencyList.remove(vertex);
		}
		
		public void removeEdge(int vertex1, int vertex2) {
			List<Integer> list1 = adjacencyList.get(vertex1);
			List<Integer> list2 = adjacencyList.get(vertex2);
			if(list1 != null) list1.remove(Integer.valueOf(vertex2));
			if(list2 != null) list2.remove(Integer.valueOf(vertex1));

		}
		
		public boolean hasVertex(int vertex) {
			return adjacencyList.containsKey(vertex);
		}
		
		public boolean hasEdge(int vertex1, int vertex2) {
	        List<Integer> list1 = adjacencyList.get(vertex1);
	        List<Integer> list2 = adjacencyList.get(vertex2);
	        return list1 != null && list2 != null && list1.contains(vertex2) && list2.contains(vertex1);
	    }
		public List<Integer> dfs(int start) {
	        List<Integer> result = new ArrayList<>();
	        Set<Integer> visited = new HashSet<>();
	        java.util.Stack<Integer> stack = new java.util.Stack();
	        stack.push(start);

	        while (!stack.isEmpty()) {
	            int vertex = stack.pop();
	            if (!visited.contains(vertex)) {
	                visited.add(vertex);
	                result.add(vertex);
	                List<Integer> neighbors = adjacencyList.get(vertex);
	                if (neighbors != null) {
	                    for (int neighbor : neighbors) {
	                        stack.push(neighbor);
	                    }
	                }
	            }
	        }
	        return result;
	    }
		
		 public List<Integer> bfs(int start) {
		        List<Integer> result = new ArrayList<>();
		        Set<Integer> visited = new HashSet<>();
		        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
		        queue.offer(start);

		        while (!queue.isEmpty()) {
		            int vertex = queue.poll();
		            if (!visited.contains(vertex)) {
		                visited.add(vertex);
		                result.add(vertex);
		                List<Integer> neighbors = adjacencyList.get(vertex);
		                if (neighbors != null) {
		                    for (int neighbor : neighbors) {
		                        queue.offer(neighbor);
		                    }
		                }
		            }
		        }
		        return result;
		    }
		
		
		  public static void main(String[] args) {
		        Graph_13 graph = new Graph_13();
		        graph.addVertex(1);
		        graph.addVertex(2);
		        graph.addVertex(3);
		        graph.addVertex(4);

		        graph.addEdge(1, 2);
		        graph.addEdge(1, 3);
		        graph.addEdge(2, 4);

		        System.out.println("DFS: " + graph.dfs(1)); 
		        System.out.println("BFS: " + graph.bfs(1)); 

		        System.out.println("Has Vertex 3: " + graph.hasVertex(3)); 
		        System.out.println("Has Edge 1-2: " + graph.hasEdge(1, 2)); 

		        graph.removeEdge(1, 2);
		        System.out.println("Has Edge 1-2: " + graph.hasEdge(1, 2)); 

		        graph.removeVertex(3);
		        System.out.println("Has Vertex 3: " + graph.hasVertex(3)); // Output: Has Vertex 3: false
		    }
		}