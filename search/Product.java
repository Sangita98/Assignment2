package datastructure.search;

public class Product {

		private int id;
		private String name;
		private double price;
		
	
		public Product(int id, String nameString, double price) {
			super();
			this.id = id;
			this.name = nameString;
			this.price = price;
		}

		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
}
