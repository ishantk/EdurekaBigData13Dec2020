package co.edureka.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import co.edureka.model.Product;

public class ListApp {

	public static void main(String[] args) {
		
		
		Product p1 = new Product(101, "Adidas AlphaBounce Shoe", 5000);
		Product p2 = new Product(231, "LG Refrigirator", 50000);
		Product p3 = new Product(99, "Apple iPhone 12", 80000);
		Product p4 = new Product(115, "Samsung Note", 70000);
		Product p5 = new Product(145, "Samsung LED TV", 40000);
		
		// Polymophic Statement | Without Generics
		// Hetrogeneous Container
		//List list1 = new ArrayList(); // as per RTP, ref var of interface can refer to the object of the class which implements it
		
		// Direct Object Construction | Without Generics
		// Hetrogeneous Container
		//ArrayList list1 = new ArrayList();						// Here we can add any possible object
		//LinkedList list1 = new LinkedList();
		Vector list1 = new Vector();
		
		// Direct Object Construction | With Generics
		// Homogeneous Container
		//ArrayList<String> list2 = new ArrayList<String>();		// Here we can only add Strings
		//LinkedList<String> list2 = new LinkedList<String>();
		Vector<String> list2 = new Vector<String>();
		
		//ArrayList<Product> list3 = new ArrayList<Product>();	// Here we can only add Product Objects :)
		//LinkedList<Product> list3 = new LinkedList<Product>();
		Vector<Product> list3 = new Vector<Product>();
		
		// 1 Add Objects in List
		list1.add("John");	// 0
		list1.add(100);		// 1
		list1.add(20.2);	// 2
		list1.add("Fionna");// 3
		list1.add(p3);		// 4
		list1.add(p5);		// 5
		
		list2.add("Jennie");
		list2.add("Fionna");
		list2.add("Kim");
		list2.add("Sia");
		list2.add("Joe");
		//list2.add(100);	// error
		//list2.add(p1);	// error
		
		list3.add(p1);
		list3.add(p2);
		list3.add(p3);
		list3.add(p4);
		list3.add(p5);
		//list3.add("Harry");	// error
		//list3.add(101)		// error
		
		
		// 2 Update Object in List
		list1.set(3, "Fionna Flynn");
		
		// 3 Remove the Object from List
		list1.remove(4);
		
		// 4 Check Size of List
		int size1 = list1.size();
		System.out.println("Size of list1 is: "+size1);
		
		// 5 Extract single element from list
		System.out.println("Element at 3rd index is: "+list1.get(3));
		System.out.println("Element at 1st index is: "+list1.get(1));
		
		System.out.println();
		
		// 6 Show all the elements in one go
		System.out.println("list1 content");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("list2 content");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("list3 content");
		System.out.println(list3);
		System.out.println();
		
		
		// 7 clear all the list
		//list1.clear();
		
		// 8 Check of element is in the list or not
		if(list1.contains("John")) {
			System.out.println("John is in the list1");
		}
		
		// 9 extract index of element
		int idx = list1.indexOf("John");
		System.out.println("idx of John is: "+idx);
		System.out.println();
		
		// 10 Iterating in the List

		// Regular For Loop
		System.out.println("Regular For Loop - list1");
		for(int i=0;i<list1.size();i++) {
			Object ref = list1.get(i);
			System.out.println(ref);
		}
		
		System.out.println();
		
		System.out.println("Regular For Loop - list2");
		for(int i=0;i<list2.size();i++) {
			String ref = list2.get(i);
			System.out.println(ref);
		}
		
		System.out.println();
		
		System.out.println("Regular For Loop - list3");
		for(int i=0;i<list3.size();i++) {
			Product ref = list3.get(i);
			System.out.println(ref);
		}
		
		System.out.println();
		
		// 11 Iterating in the List

		// Enhanced For Loop
		System.out.println("Enhanced For Loop - list1");
		for(Object ref : list1) {
			System.out.println(ref);
		}
		
		System.out.println();
		
		System.out.println("Enhanced For Loop - list2");
		for(String ref : list2) {
			System.out.println(ref);
		}
		
		System.out.println();
		
		System.out.println("Enhanced For Loop - list3");
		for(Product ref : list3) {
			System.out.println(ref);
		}
		System.out.println();
		
		
		// 12 Iterating in the List

		// Iterator API
		System.out.println("Iterator API - list1");
		
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext()) {
			Object ref = itr1.next();
			System.out.println(ref);
		}
		System.out.println();
		
		System.out.println("Iterator API - list2");
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			String ref = itr2.next();
			System.out.println(ref);
		}
		System.out.println();
		
		System.out.println("Iterator API - list3");
		
		Iterator<Product> itr3 = list3.iterator();
		while(itr3.hasNext()) {
			Product ref = itr3.next();
			System.out.println(ref);
		}
	}

}
