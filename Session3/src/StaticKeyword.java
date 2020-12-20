
class Dish{
	
	String name;
	int price;
	int quantity;
	
	// dishes is not an attribute of object
	// it will not be a part of container :(
	// static belongs to class
	// its a common variable for all the objects
	static int dishes=0;
	
	Dish(){
		quantity = 1;
		dishes++;
	}
	
	Dish(String name, int price){
		this(); // default constructor execution to set quantity as by default 1
		this.name = name;
		this.price = price;
	}
	
	void increment() {
		quantity++;
	}
	
	void decrement() {
		quantity--;
	}
	
	void showDish() {
		System.out.println("====="+name+"=====");
		System.out.println("Quantity: ["+quantity+"]");
		System.out.println("Price Per Unit: ["+price+"]");
		System.out.println("Total Price: ["+price*quantity+"]");
		System.out.println("===================");
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Veggie Burger", 100);
		Dish dish2 = new Dish("Noodles", 200);
		
		dish1.increment();	// 2
		dish2.increment();	// 2
		
		dish2.increment();	// 3
		dish2.increment();	// 4
		
		dish1.decrement();	// 1
		dish1.increment();	// 2
		
		dish1.showDish();	// Veggie Burger	-> Quantity 2 	100*2 -> 200
		dish2.showDish();	// Noodles			-> Quantity 4	200*4 -> 800
		
		dish1.dishes = 300;
		dish2.dishes = -100;
		Dish.dishes = 0;

		System.out.println("TOTAL DISHES: "+Dish.dishes);
		
	}

}
