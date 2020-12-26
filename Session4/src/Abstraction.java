
abstract class Base{
	
	Base(){
		System.out.println("Base Class Object Constrcuted");
	}
	
	// Regular or Concrete Method
	void show() {
		System.out.println("This is show of Base");
	}
	
	// Abstract Method: which will not have any definition
	// its a RULE created by Parent for the child
	// We can have n-number of abstract methods and all of them must be defined by child
	abstract void hello();
}

class Derived extends Base{
	
	Derived(){
		System.out.println("Derived Class Object Constrcuted");
	}
	
	// Abstract Method which was in the Parent, must be defined by the Children
	void hello() {
		System.out.println("This is hello in Derived :)");
	}
}

public class Abstraction {

	public static void main(String[] args) {
	
		// As a Dev, We cannot create the objects of Abstract class
		//Base ref = new Base();
		
		//Derived dRef = new Derived();
		Base dRef = new Derived(); 		// Polymorphic Statement
		dRef.show();
		dRef.hello();
		
	}

}
