
interface PayTmPaymentGateway{
	
	// error
	/*PayTmPaymentGateway(){
		
	}*/
	
	// error
	/*void hello() {
		System.out.println("This is hello");
	}*/
	
	boolean isGatewayUp = true;	//	-> public static final boolean isGatewayUp = true;
	
	void pay(int amount);	// -> public abstract void pay(int amount);
	void onSuccess();		// -> public abstract void onSuccess();
	void onFailure();		// -> public abstract void onFailure();
	
}

class ZomatoPaymentsPage implements PayTmPaymentGateway{
	
	public void pay(int amount) {
		System.out.println("[Zomato] Pay an amount of "+amount);
//		isGatewayUp = false; cannot be manipulated
		if(isGatewayUp) {
			onSuccess();
		}else {
			onFailure();
		}
	}
	
	public void onSuccess() {
		System.out.println("[Zomato] Payment is successfully done");
	}
	
	public void onFailure() {
		System.out.println("[Zomato] Error while making Payment");
	}
	
}

class SwiggyPaymentsPage implements PayTmPaymentGateway{
	
	public void pay(int amount) {
		System.out.println("[Swiggy] Pay an amount of "+amount);
//		isGatewayUp = false; cannot be manipulated
		if(isGatewayUp) {
			onSuccess();
		}else {
			onFailure();
		}
	}
	
	public void onSuccess() {
		System.out.println("[Swiggy] Payment is successfully done");
	}
	
	public void onFailure() {
		System.out.println("[Swiggy] Error while making Payment");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		
		// error -> we cannot create object of Interface
		//PayTmPaymentGateway gateway = new PayTmPaymentGateway();
		
		PayTmPaymentGateway ref = new ZomatoPaymentsPage();
		//ref = new SwiggyPaymentsPage();
		
		ref.pay(2000);

	}

}
