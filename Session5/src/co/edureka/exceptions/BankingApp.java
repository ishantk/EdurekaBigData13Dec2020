package co.edureka.exceptions;

import java.io.IOException; // CHECKED EXCEPTION

// User Defined -> UNCHEKCED EXCEPTION
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined -> CHEKCED EXCEPTION
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}


class BankAccount{
	
	int balance;
	int minBalance;
	int attempts;
	
	BankAccount(){
		balance = 10000;
		minBalance = 2000;
		attempts = 0;
	}
	
	// in the methods signature add throws keyword for the exception which we will throw and is UNCHECKED
	void withdraw(int amount) throws IOException, YourBankingException{
		
		balance -= amount;
		
		if(balance <= minBalance ) {
			attempts++;
			balance += amount;
			System.out.println("[WITHDRAW] ["+amount+"] Failed. Low Balance: "+balance);
		}else {
			System.out.println("[WITHDRAW] ["+amount+"] Success. New Balance is: "+balance);
		}
		
		// in case user has tried for 3 times
		if(attempts == 3) {
			// ArithmeticException is the Child of RuntimeException Class and hence is an UNCHECKED EXCEPTION
			// Throwing an UNCHECKED EXCEPTION
			//ArithmeticException ref = new ArithmeticException("Illegal Attempts "+attempts);
			//throw ref;
			
			// Throw CHECKED EXCEPTION
			//IOException io = new IOException("Illegal Attempts "+attempts);
			//throw io;
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts "+attempts);
			throw yRef;
		}

	}
}

public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Banking Started...");
		
		BankAccount john = new BankAccount();
		
		// if john will continue doing the transaction again and again which is a failure case
		// Banks resources will be used and they are being MIS-USED
		
		try {
			for(int i=1;i<=500;i++) {
				john.withdraw(3000);
			}	
		}catch(Exception ref) {
			System.out.println("Something Went Wrong. "+ref);
		}
		
		System.out.println("Banking Finished...");

	}

}
