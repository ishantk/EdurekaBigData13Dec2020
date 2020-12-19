import java.util.Arrays;

public class Methods {
	
	// 	non static method -> which can be executed by the object of class
	// void -> return type | return nothing
	// array -> input
	// findMax -> name of method
	void findMax(int[] array) {
		int max = array[0];
		
		// Lookup for any number greater in the loop
		for(int i=1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("Array HashCode: "+array); // We get HashCode printed for where the array is in the memory
		System.out.println("Array Elements: "+Arrays.toString(array)); // We get HashCode printed for where the array is in the memory
		System.out.println("Maximum is: "+max);
	}
	
	// Change the return type to integer
	int findMaxAgain(int[] array) {
		int max = array[0];
		
		// Lookup for any number greater in the loop
		for(int i=1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	// static method -> which can be executed directly by class name :)
	static void findMaxElement(int[] array) {
		int max = array[0];
		
		// Lookup for any number greater in the loop
		for(int i=1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("Array Elements: "+array);
		System.out.println("Array Elements: "+Arrays.toString(array));
		System.out.println("Maximum is: "+max);
	}
	
	static int findMaxElementAgain(int[] array) {
		
		int max = array[0];
		
		// Lookup for any number greater in the loop
		for(int i=1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	

	public static void main(String[] args) {
		
		int[] productPrices = {101, 301, 543, 1675, 900, 510, 1000, 1200, 200};
		int[] scores = {10, 30, 45, 88, 72, 12, 101, 10, 5};
		int[] activeCovidCases = {23122, 34321, 33121, 8654, 1123};
		
		/*
		
		// Problem: Find max priced product
		//          Find maximum Score made by cricketer
		//			Find maximum Active Cases
		
		// assuming the first element itself is the maximum number
		int max = productPrices[0];
		
		// Lookup for any number greater in the loop
		for(int i=1;i<productPrices.length;i++) {
			if(productPrices[i] > max) {
				max = productPrices[i];
			}
		}
		
		System.out.println("Product Priced Maximum is: "+max);
		
		// assuming the first element itself is the maximum number
		max = scores[0];
		
		for(int i=1;i<scores.length;i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		System.out.println("Cricketer Scored Maximum of: "+max);
		
		// assuming the first element itself is the maximum number
		max = activeCovidCases[0];
		
		for(int i=1;i<activeCovidCases.length;i++) {
			if(activeCovidCases[i] > max) {
				max = activeCovidCases[i];
			}
		}
		
		System.out.println("COVID Cases Maximum are: "+max);
		
		// In above discussion, our same algo is being coded repeatedly :)
		
		*/
		
		
		// Execution of Non Static Methods -> With Objects of Class
		// Create Object of Methods
		Methods ref = new Methods();	// Object Construction Statement
		ref.findMax(productPrices);
		ref.findMax(scores);
		ref.findMax(activeCovidCases);
		
		System.out.println();
		
		// Execution of Static Methods -> With Class Name Itself :)
		Methods.findMaxElement(productPrices);
		Methods.findMaxElement(scores);
		Methods.findMaxElement(activeCovidCases);
		
		System.out.println();
		
		// Static Methods can additionaly by executed with references to the objects
		// Alongwith a Warning: The static method findMaxElement(int[]) from the type Methods should be accessed in a static way
		ref.findMaxElement(activeCovidCases);
		
		System.out.println();
		
		System.out.println("Maximium in "+Arrays.toString(productPrices)+" is: "+Methods.findMaxElementAgain(productPrices));
		System.out.println("Maximium in "+Arrays.toString(scores)+" is: "+Methods.findMaxElementAgain(scores));
		System.out.println("Maximium in "+Arrays.toString(activeCovidCases)+" is: "+Methods.findMaxElementAgain(activeCovidCases));
	}
	
	

}
