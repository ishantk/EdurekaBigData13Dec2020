
public class BreakContinue {

	public static void main(String[] args) {
		
		// Array of Strings :)
		//						0		1		2		3		4		 5		 6			7			8		9		
		String[] products = {"shoe", "jeans", "tv", "laptop", "mobile", "toys", "milk", "chocolate", "rice", "sweaters"};

		String search = "tv";
		
		for(int idx=0; idx<products.length; idx++) {
			System.out.println("SEARCHING FOR "+search+" AND MATCHING WITH "+products[idx]);
			if(search == products[idx]) {
				System.out.println("PRODUCT FOUND :)");
				break; // terminate the loop
			}
		}
		
		System.out.println();
		
		
		for(int idx=0; idx<products.length; idx++) {
			
			if(search != products[idx]) {
				continue;	// take the loop to next iteration and skips the statements below
			}
			
			System.out.println("PRODUCT FOUND at idx "+idx+" :)");
		}
		
	}

}
