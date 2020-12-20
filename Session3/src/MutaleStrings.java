
public class MutaleStrings {

	public static void main(String[] args) {
	
		// String is IMMUTABLE
		String str = new String("Hello");
		String newStr = str.concat(" World");
		
		String salutation = "Dr.";
		String fname = "John";
		String lname = "Watson";
		
		String fullName = salutation + fname + " " + lname;
		System.out.println("Full Name is: "+fullName);
		
		System.out.println("str is: "+str);
		System.out.println("newStr is: "+newStr);
		
		// StringBuffer is MUTABLE
		//StringBuffer buffer = "Hello";	// error
		StringBuffer buffer = new StringBuffer("Hello");	// StringBuffer cannot be represented as Interned Strings :(
		buffer.append(" World");
		
		System.out.println("buffer is: "+buffer);
		// Other APIs i.e. Built in methods on Strings they work in the same way on String Buffer as well :)
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("builder is: "+builder);
		
		
		// StringBuffer is Thread Safe			
		// StringBuilder is not Thread Safe
		// ThreadSafe i.e. when multiple threads are accessing the same String it may be a problem :)
	}

}
