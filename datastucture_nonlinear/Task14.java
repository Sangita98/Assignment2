package datastucture_nonlinear;


import java.util.ArrayList;
import java.util.List;

//Graph data structure implementation
class Edge{
	private Product startProduct;
	private Product endProduct;
	private String type;
	
	//parameterized cons.tructor
	public Edge(Product startProduct, Product endProduct, String type) {
		super();
		this.startProduct = startProduct;
		this.endProduct = endProduct;
		this.type = type;
	}
	
	//setters and getters
	public Product getStartProduct() {
		return startProduct;
	}
	public void setStartProduct(Product startProduct) {
		this.startProduct = startProduct;
	}
	public Product getEndProduct() {
		return endProduct;
	}
	public void setEndProduct(Product endProduct) {
		this.endProduct = endProduct;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Edge [startProduct=" + startProduct + ", endProduct=" + endProduct + ", type=" + type + "]";
	}
	
}

 class ProductGraph {
	private List<Product> procucts;
	private List<Edge> edges;
	
	
	// Default const.
	
	 public ProductGraph() {
		super();
		this.procucts =  new ArrayList<>();
		this.edges = new ArrayList<>();
	}
		// only getter method
	public List<Product> getProducts() {
		return procucts;
	}

	public List<Edge> getEdges() {
		return edges;
	}
	
	public void addProduct(Product product) {
		procucts.add(product);
		
	}
	
	public void addEdge(Product start, Product end, String type) {
		Edge edge =new Edge(start, end, type);
		edges.add(edge);
		
		//Assuming graph is undirested so we add edges in both directions
		edges.add(new Edge(start, end, type));
	}
	
	//cheack if product exists
	public boolean containsProduct(Product product) {
		return procucts.contains(product);
	}
	
	//Get all edges connected to specific product
	public List<Edge> getEdgesForProduct(Product product){
		List<Edge> result=new ArrayList<>();
		for(Edge edge : edges) {
			if(edge.getStartProduct().equals(product)) {
				result.add(edge);
				
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return "ProductGraph [procucts=" + procucts + ", edges=" + edges + "]";
	}
	
	
}
 


public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductGraph graph = new ProductGraph();
		Product p1 =new Product("Laptop", 75000);
		Product p2 =new Product("Desktop", 50000);
		Product p3 =new Product("Tab", 15000);
		
		graph.addProduct(p1);
		graph.addProduct(p2);
		graph.addProduct(p3);
	
	
	graph.addEdge(p1, p2, "Type1");
	graph.addEdge(p2, p3, "Type2");
	
	System.out.println(graph);
	System.out.println("Edge for Product1:" + graph.getEdgesForProduct(p1));
	}
}
