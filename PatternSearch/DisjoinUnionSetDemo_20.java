package assignment;


public class DisjoinUnionSetDemo_20 {
	int parent[], rank[];
	int n;
	
	public  DisjoinUnionSetDemo_20(int n) {
		rank = new int[n];
		parent =new int[n];
		this.n=n;
		makeSet();
		
	}
	
	void makeSet() {
		for(int i=0 ; i< n; i++) {
			parent[i] =i;
		}
	}
	
	int find(int x) {
		if(parent[x]!=x ) {
			parent[x] =find(parent[x]);
		}
		return parent[x];
	}
	
	void union(int x, int y) {
		int xRoot = find(x),yRoot=find(y);
		if(xRoot== yRoot) 
			return ;
	
	
	if(rank[xRoot] < rank[yRoot])
		parent[xRoot]= yRoot;
	
	else if(rank[yRoot] < rank[xRoot])
		parent[yRoot]= xRoot;
	
	else {
		parent[yRoot]=xRoot;
		rank[xRoot] = rank[xRoot] +1;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		DisjoinUnionSetDemo_20 djDemo=new DisjoinUnionSetDemo_20(n); 
		djDemo.union(0, 2);
		djDemo.union(4, 2);
		djDemo.union(3, 1);
		
		if(djDemo.find(4) ==djDemo.find(0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		if(djDemo.find(1) ==djDemo.find(0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if(djDemo.find(2) ==djDemo.find(3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
