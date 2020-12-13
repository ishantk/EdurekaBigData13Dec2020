
public class ReferenceTypes {

	public static void main(String[] args) {
		
		// name and address they hold references to the data 
		// they dont have the value directly stored in them
		String name = "John Watson";
		String address = "2144 Pristine Magnum, Banagalore";
		
		System.out.println(name+" lives at "+address);
		System.out.println("name hashcode is: "+name.hashCode());
		System.out.println("address hashcode is: "+address.hashCode());
		
		// Reference Types holds HashCodes to the Data
		// PS: Hashing Examples here : https://www.cs.usfca.edu/~galles/visualization/OpenHash.html
	}

}
