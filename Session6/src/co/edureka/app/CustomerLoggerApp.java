package co.edureka.app;

import java.util.Date;
import java.util.Scanner;

import co.edureka.fileio.FileIO;
import co.edureka.model.Customer;

public class CustomerLoggerApp {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------");
		System.out.println("Welcome to Customer Logger App");
		System.out.println("--------------------------------");
		System.out.println("Note Down Your Customer's Temperature");
		
		FileIO io = new FileIO();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.println();
			System.out.println("1. Enter Customer Visit");
			System.out.println("2. Check All Customer Visits");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choice:  ");
			
			
			int choice = scanner.nextInt();
			
			// do an empty nextLine in case we wish to read String after number
			scanner.nextLine();
			
			if (choice == 1) {
				
				Customer customer = new Customer();
				
				System.out.println("Enter Customer Name: ");
				customer.name = scanner.nextLine();
				
				System.out.println("Enter Customer Phone: ");
				customer.phone = scanner.nextLine();
				
				System.out.println("Enter Customer Temperature: ");
				customer.temperature = scanner.nextDouble();
				
				Date date = new Date();
				customer.dateTimeStamp = date.toString(); 
				
				System.out.println("We will be saving Customer");
				// Since we have overrided toString, now if we will display reference variable
				// it will not show HashCode and will show the String returned by toString method
				System.out.println(customer);
				
				// do an empty nextLine in case we wish to read String after number
				scanner.nextLine();
				
				System.out.println("Would You like to Save the Details (yes/no): ");
				String option = scanner.nextLine();
				
				if(option.equals("yes")) {
					System.out.println("Saving "+customer.name+"....");
					String data = customer.toCSV();
					System.out.println("Saving Data: "+data);
					
					//io.writeInFile(data);
					io.writeInFileAgain(data);
				}
				
			}else if (choice == 2){
				System.out.println("-------------");
				System.out.println("ALL CUSTOMERS");
				System.out.println("-------------");
				//io.readFromFile();
				io.readFromFileAgain();
			}else if (choice == 3){
				System.out.println("Thank you for Using Customer Logger App :)");
				break;	// quite the loop
			}else {
				System.out.println("Sorry ! An Invalid Choice");
			}
		}
	
		scanner.close();
		
	}
	

}
