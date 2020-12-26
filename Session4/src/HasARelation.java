
class Customer{
	
	String name;
	String phone;
	String email;
	
	// Customer HAS reference to Order Object
	Order order;	// HAS-A Relationship
}

class Order{
	
	int orderId;
	int price;
	String description;
}

public class HasARelation {

	public static void main(String[] args) {
		

		Customer customer = new Customer();
		customer.name = "John";
		customer.email = "john@example.com";
		customer.phone = "+91 99999 11111";
		
		Order order = new Order();
		order.orderId = 101;
		order.price = 5000;
		order.description = "Deliver the Package Soon";
		
		// Has-A Relationship
		customer.order = order;
	}

}
