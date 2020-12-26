// final class cannot be extended
final class BankPaymentGateway{
	final void pay(int amount) {
		System.out.println("Transacting amount of "+amount);
	}
}

/*class MyPaymentGateway extends BankPaymentGateway{ // error while extending
	
	// final method cannot be re-defined in the Child i.e. it cannot be overrided
	void pay(int amount) {
		amount = amount + 100;
		System.out.println("Transacting amount of "+amount);
	}
}*/


public class FinalKeyword {

	public static void main(String[] args) {
		
		int a = 10;
		a = 100;
		
		// b is final which cannot be modified :)
		final int b = 10;
		// b = 100; // error
		
		//MyPaymentGateway gateway = new MyPaymentGateway();
		//gateway.pay(1000);
		

	}

}
