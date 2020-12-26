import java.util.Scanner;

class Pay{
	
	void pay(int amount) {
		System.out.println("Pay "+amount);
	}
	
}

class GooglePay extends Pay{
	
	void pay(int amount) {
		System.out.println("GOOGLE PAY");
		System.out.println("Please Pay: "+amount);
	}
	
}

class PhonePe extends Pay{
	
	void pay(int amount) {
		System.out.println("PHONE Pe");
		System.out.println("Please Pay: "+amount);
	}
	
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
	
		/*
		GooglePay gPay = new GooglePay();
		gPay.pay(2000);
		
		System.out.println();
		
		PhonePe pPay = new PhonePe();
		pPay.pay(2000);*/
		
		System.out.println("1 PAY WITH GOOGLE");
		System.out.println("2 PAY WITH PHONE Pe");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the Payment Option: ");
		int option = scanner.nextInt();
		scanner.close();
		
		// Create Reference Variable of Parent
		Pay pay=null;
		
		if(option == 1) {
			// Reference Variable of Parent can Point to the Object of Child -> Polymorphic Statement
			pay = new GooglePay();
		}else if(option == 2) {
			// Reference Variable of Parent can Point to the Object of Child -> Polymorphic Statement
			pay = new PhonePe();
		}else {
			System.out.println("Please Select a Valid Type");
		}
		
		if (pay != null) {
			pay.pay(1000);
		}
		

	}

}
