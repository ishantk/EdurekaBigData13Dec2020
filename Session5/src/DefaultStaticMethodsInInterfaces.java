
interface Inf{
	
	// hello is abstract i.e. has not definition and will be defined by the Child which implements Inf Interface
	void hello();
	
	
	// From Java 8 onwards we can have methods with definitions and they are default and static ones :)
	default void show() {
		System.out.println("This is show of Inf");
		foo(); // to execute private methods of an interface we need to execute them in default methods
	}
	
	static void bye() {
		System.out.println("This is bye of Inf");
	}
	
	private void foo() {
		System.out.println("This is private foo of Inf");
	}
}

class PA implements Inf{
	public void hello() {
		System.out.println("This is hello in PA as impmented for Inf");
	}
	
	public void show() {
		System.out.println("This is show of PA overrided");
	}
	
	// we are not redefining bye of Inf. This bye is all together  a new method of PA class
	static void bye() {
		System.out.println("This is bye of PA");
	}
}


public class DefaultStaticMethodsInInterfaces {

	public static void main(String[] args) {
		
		Inf i1 = new PA();
		i1.hello();
		i1.show();
		
		//i1.foo(); // err -> private is not accessible :(
		
		//i1.bye(); // not accessible -> we can access static method if interface strictly with its name only
		Inf.bye();

	}

}
