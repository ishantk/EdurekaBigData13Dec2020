import java.util.Scanner;

public class SelectionStatements {

	public static void main(String[] args) {
	
		/*
		    WELCOME
		    Get 50% OFF up to ₹100.
			On orders above ₹149
			
			MAXSAFETY
			Get 20% OFF up to ₹50.
			Valid on orders above ₹159.
			
		 */
		
		double totalAmount = 300;
		String promoCode = "MAXSAFETY";
		
		// Regular if-else
		/*
		if(totalAmount > 149 && promoCode == "WELCOME") {
			double discount = 0.50 * totalAmount;
			System.out.println("WELCOME APPLIED");
			System.out.println("disocunt calculated is: "+discount);
		}else {
			System.out.println("SORRY !! Promo Code Cannot be Applied");
		}*/
		
		// Nested if-else
		/*
		if(totalAmount > 149 && promoCode == "WELCOME") {
			
			double discount = 0.50 * totalAmount;
			
			if(discount >= 100) {
				discount = 100;
			}
			
			System.out.println("WELCOME APPLIED");
			System.out.println("discount calculated is: "+discount);
			System.out.println("total amount is: "+totalAmount);
			System.out.println("Amount to Pay is: "+(totalAmount-discount));
			
			
		}else {
			System.out.println("SORRY !! Promo Code Cannot be Applied");
		}*/
		
		// Ladder if-else
		if(totalAmount > 149 && promoCode == "WELCOME") {
			
			double discount = 0.50 * totalAmount;
			
			if(discount >= 100) {
				discount = 100;
			}
			
			System.out.println("WELCOME APPLIED");
			System.out.println("discount calculated is: "+discount);
			System.out.println("total amount is: "+totalAmount);
			System.out.println("Amount to Pay is: "+(totalAmount-discount));
			
			
		}else if(totalAmount > 159 && promoCode == "MAXSAFETY") {
			
			double discount = 0.20 * totalAmount;
			
			if(discount >= 50) {
				discount = 50;
			}
			
			System.out.println("MAXSAFETY APPLIED");
			System.out.println("discount calculated is: "+discount);
			System.out.println("total amount is: "+totalAmount);
			System.out.println("Amount to Pay is: "+(totalAmount-discount));
			
			
		}else {
			System.out.println("SORRY !! Promo Code "+promoCode+" Cannot be Applied");
		}
		
		
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaShared = 4;
		int olaBike = 5;
		
		// Object of Scanner class :)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Select the Cab: ");
		System.out.println("1 -> OLA MINI");
		System.out.println("2 -> OLA MICRO");
		System.out.println("3 -> OLA SEDAN");
		System.out.println("4 -> OLA SHARED");
		System.out.println("5 -> OLA BIKE");
		System.out.println("ENTER YOUR CHOICE: ");
		int userChoice = scanner.nextInt();	// userChoice can be any 1 out of 5 options
		int baseFare = 100;
		
		
		switch(userChoice) {
			case 1:
				baseFare += 50;
				System.out.println("OLA MICRO BOOKED");
				System.out.println("Please Pay "+baseFare);
			break;	
			
			case 2:
				baseFare += 100;
				System.out.println("OLA MINI BOOKED");
				System.out.println("Please Pay "+baseFare);
			break;
			
			case 3:
				baseFare += 150;
				System.out.println("OLA SEDAN BOOKED");
				System.out.println("Please Pay "+baseFare);
			break;
			
			case 4:
				baseFare += 20;
				System.out.println("OLA SHARED BOOKED");
				System.out.println("Please Pay "+baseFare);
			break;
			
			case 5:
				baseFare -= 50;
				System.out.println("OLA BIKE BOOKED");
				System.out.println("Please Pay "+baseFare);
			break;
			
			default:
				System.out.println("Please select the cab first");
				break;
			
		}
	}
	
	
	

}
