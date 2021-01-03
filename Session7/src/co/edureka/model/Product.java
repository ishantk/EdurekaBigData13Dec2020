package co.edureka.model;

public class Product implements Comparable<Product>{

	public int pid;
	public String name;
	public int price;
	
	public Product() {
		
	}
	
	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]\n";
	}

	@Override
	public int compareTo(Product o) {
		if(price == o.price) {
			return 0;
		}else if(price > o.price) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
