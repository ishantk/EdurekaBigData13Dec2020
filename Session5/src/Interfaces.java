interface Inf1{
	
	int a = 10; 	// -> public static final int a = 10;
	
	void show();	// -> public abstract void show();
	void hello();	// -> public abstract void hello();
	
}

interface Inf2{
	
	int a = 101; 	// -> public static final int a = 10;
	
	void show();	// -> public abstract void show();
	void bye();	// -> public abstract void hello();
	
}

// Multiple Inheritance on Interfaces
interface Inf3 extends Inf1, Inf2{
	
}

class CA implements Inf1{
	
	public void show() {
		System.out.println("Show in CA as implemented for Inf1");
	}
	
	public void hello() {
		System.out.println("Hello in CA as implemented for Inf1");
	}
}

// Multiple Implementation
class CB implements Inf3{//Inf1, Inf2{
	
	public void show() {
		System.out.println("Show in CB as implemented for Inf1 and Inf2 Both");
	}
	
	public void hello() {
		System.out.println("Hello in CB as implemented for Inf1");
	}
	
	public void bye() {
		System.out.println("Bye in CB as implemented for Inf2");
	}
}


public class Interfaces {

	public static void main(String[] args) {
		
		// Direct Object Construction
		CA ca = new CA();
		ca.show();
		ca.hello();
		System.out.println("a is: "+ca.a);
		System.out.println("a is: "+CA.a);
		System.out.println("a is: "+Inf1.a);
		
		System.out.println();
		
		// Polymorphic Statement
		Inf1 i1 = new CA();
		i1.show();
		i1.hello();
		System.out.println("a is: "+i1.a);
				
		// error : we cannot create objects for Interfaces :(
		// Inf1 i2 = new Inf1();
		
		System.out.println();
		
		CB cb = new CB();
		cb.show();
		cb.hello();
		cb.bye();

//		a is ambigous as in we dont know it should be from Inf1 or Inf2
//		Hence, we cannot access it directly now
//		System.out.println("a is: "+cb.a);	// err
//		System.out.println("a is: "+CB.a);	// err
		
		System.out.println("a is: "+Inf1.a);
		System.out.println("a is: "+Inf2.a);
		
		System.out.println();
		
		Inf3 i3 = new CB();
		i3.show();
		i3.hello();
		i3.bye();
		
		
	}

}
