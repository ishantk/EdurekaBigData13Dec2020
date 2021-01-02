package co.edureka.app;

public class WrapperClassesApp {

	public static void main(String[] args) {
		
		// Primitive Type : Which stores Value
		int i = 10;

		// Reference Type
		// BOXING -> i.e. Converting primitve into an Object OR Representing Primitve as an Object
		Integer iRef = new Integer(i);
		System.out.println("data in Integer object is: "+iRef.intValue()); // UNBOXING -> Extracting data from Object
		System.out.println("data in Integer object is: "+iRef);
		
		
		char ch = 'A';
		Character cRef = new Character(ch);
		System.out.println("cRef is: "+cRef.charValue());
		System.out.println("cRef is: "+cRef);
		
		double d = 2.2;
		Double dRef = new Double(d);
		System.out.println("dRef is: "+dRef.doubleValue());
		System.out.println("dRef is: "+dRef);
		
		// AUTO-BOXING
		Integer iRef1 = i;	// -> Translated as Integer iRef1 = new Integer(i);
		
		// AUTO-UNBOXING
		int j = iRef; // -> Translated as int j = iRef.intValue();
		
		String data = "100";
		int number = Integer.parseInt(data); // Use some built in methods in Integer class or any other Wrapper class for some additional utilities
		
		// why we need Wrapper Classes ?
		// To represent primitives as References. but why ? -> As in Java Collections Framework supports only references
	}

}
