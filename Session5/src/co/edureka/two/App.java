package co.edureka.two;

// we can only import public classes outside the package :)
import co.edureka.one.One;	// OK

// default is only inside the package :)
//import co.edureka.one.Two;	// error

// Inheritance across the Package
class Child extends One{
	
	void show() {
		//pvtShow(); err
		//defShow(); err
		protShow();	// protected outside the package is accessible within the child 
		pubShow();
	}
	
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		// oRef.pvtShow();  error | Not Accessible outside class
		// oRef.defShow();  error | Not Accessible outside package
		// oRef.protShow(); error | Not Accessible outside package
		oRef.pubShow();	// OK	  | Accessible everywhere		
		
		System.out.println();
		
		Child ch = new Child();
		ch.show();
		//ch.pubShow(); // ok
		//ch.defShow(); // error -> not directly accessible but within the child :)

	}

}

//1. private -> Accessible only within the class
//2. default -> Accessible only within the package + within the child outside the Package
//3. protected -> Accessible only within the package
//4. public -> Accessible everywhere		
