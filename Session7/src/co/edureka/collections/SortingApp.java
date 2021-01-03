package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import co.edureka.model.Product;

class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price == o2.price) {
			return 0;
		}else if(o1.price > o2.price) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

class NameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class IDComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.pid == o2.pid) {
			return 0;
		}else if(o1.pid > o2.pid) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class SortingApp {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Sia");
		names.add("Kim");
		names.add("Anna");
		names.add("George");
		names.add("Tim");
		
		System.out.println("NAMES BEFORE: ");
		System.out.println(names);
		
		// Sorting data is executing single method Sort on Collections Class in Java :)
		// But Sorting works only for numbers and Strings
		Collections.sort(names);
		
		System.out.println("NAMES AFTER: ");
		System.out.println(names);
		
		Product p1 = new Product(101, "Adidas AlphaBounce Shoe", 5000);
		Product p2 = new Product(231, "LG Refrigirator", 50000);
		Product p3 = new Product(99, "Apple iPhone 12", 80000);
		Product p4 = new Product(115, "Samsung Note", 70000);
		Product p5 = new Product(145, "Samsung LED TV", 40000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		System.out.println("PRODUCTS BEFORE: ");
		System.out.println(products);
		System.out.println();
		
		// sort method would work on Collections with Objects only if we have Comparable interface implemented
		//Collections.sort(products);
		
		PriceComparator priceComparator = new PriceComparator();
		NameComparator nameComparator = new NameComparator();
		IDComparator idComparator = new IDComparator();
		
		//Collections.sort(products, priceComparator);
		//Collections.sort(products, nameComparator);
		Collections.sort(products, idComparator);
		
		System.out.println("PRODUCTS AFTER: ");
		System.out.println(products);
		System.out.println();
		

	}

}
