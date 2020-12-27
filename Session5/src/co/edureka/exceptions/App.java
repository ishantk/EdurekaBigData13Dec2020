package co.edureka.exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Lucky Draw App");
		
		int[] cashBacks = {10, 30, 90, 100, 20, 55, 70, 80, 50, 60};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Lucky Number: ");
		int luckyNumber = scanner.nextInt();
		
		
		int cashBackWon = 0;
		int additionalCashBack = 0;
		try {
			cashBackWon = cashBacks[luckyNumber];
			
			if(luckyNumber %2 == 0) {
				additionalCashBack = cashBackWon/luckyNumber;
			}
			
		}catch(ArrayIndexOutOfBoundsException ref) {
			//System.out.println("Something Went Wrong: "+ref);
			System.out.println("Sorry !! No Luck Found Today :(");
			//ref.printStackTrace(); // this is to be used by developer for debugging
		}/*catch(ArithmeticException ref) {
			//System.out.println("Something Went Wrong: "+ref);
			System.out.println("Sorry !! No Additional CashBack Won :(");
			//ref.printStackTrace(); // this is to be used by developer for debugging
		}*/
		/*catch(Exception ref) { // Exception is parent of all the exceptions in Java | RTP
			System.out.println("Something Went wrong");
		}*/finally {
			scanner.close();
			System.out.println("finally executed");
		}
		
		System.out.println("You have Won CashBack of "+cashBackWon+" amount :)");
		System.out.println("You are a bit more lucky and have won "+additionalCashBack+" additional amount :)");
		System.out.println("Thank You for Using Lucky Draw App");
		
	}

}
