package co.edureka.app;

import co.edureka.model.Customer;

class Point<T, U, V>{
	
	T x;
	U y;
	V z;
	
}

public class GenericsApp<T> { // T denotes some data type and can be any name
	/*
	static void printIntegralArray(int[] array) {
		for(int element: array) {
			System.out.println(element);
		}
	}
	
	static void printDoubleArray(double[] array) {
		for(double element: array) {
			System.out.println(element);
		}
	}
	
	static void printStringArray(String[] array) {
		for(String element: array) {
			System.out.println(element);
		}
	}
	
	static void printCustomerArray(Customer[] array) {
		for(Customer element: array) {
			System.out.println(element);
		}
	}
	*/
	
	// Generics will not work on static methods :(
	// Generics in java only supports non static :)
	void printArray(T[] array) {
		for(T element: array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		
		//int[] array1 = {10, 20, 30, 40, 50};
		Integer[] array1 = {10, 20, 30, 40, 50};
		
		//double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		Double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		String[] array3 = {"John", "Jennie", "Jim", "Jack", "Joe"};
		
		Customer c1 = new Customer("Fionna", "+91 99999 11111", 98.4, "2ndJan2020");
		Customer c2 = new Customer("Kim", "+91 98765 11111", 98.5, "2ndJan2020");
		Customer c3 = new Customer("Lee", "+91 99999 23456", 98.6, "2ndJan2020");
		
		Customer[] array4 = {c1, c2, c3};
		
	
		/*GenericsApp.printIntegralArray(array1);
		System.out.println();
		
		GenericsApp.printDoubleArray(array2);
		System.out.println();
		
		GenericsApp.printStringArray(array3);
		
		System.out.println();
		GenericsApp.printCustomerArray(array4);*/
		
		GenericsApp<Integer> ref1 = new GenericsApp<Integer>();
		GenericsApp<Double> ref2 = new GenericsApp<Double>();
		GenericsApp<String> ref3 = new GenericsApp<String>();
		GenericsApp<Customer> ref4 = new GenericsApp<Customer>();
		
		ref1.printArray(array1);
		System.out.println();
		
		ref2.printArray(array2);
		System.out.println();
		
		ref3.printArray(array3);
		System.out.println();
		
		ref4.printArray(array4);
		System.out.println();
		
		Point<Integer, Double, Integer> point1 = new Point<Integer, Double, Integer>();
		Point<Double, Double, Double> point2 = new Point<Double, Double, Double>();
		Point<Integer, Integer, Integer> point3 = new Point<Integer, Integer, Integer>();
		
	}

}
