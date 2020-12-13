
public class TypeConversions {

	public static void main(String[] args) {
		// 8 bits
		byte age = 20;
		
		// Conversion from byte to int | Implicit
		// UpCasting -> i.e. whenever we are going to put the small data type to the larger one its OK
		// 32 bits
		int iAge = age;	

		// Conversion from int to short | Explicit
		// DownCasting -> i.e. whenever we are going to put the larger data type to the smaller one its NOT OK -> Error
		//short sAge = iAge; error
		// 16 bits
		short sAge = (short)iAge; // CASTING -> NEEDED ONLY For DOWNCASTING :)
		
		// Remember -> DownCasting may end up in loss of data :(
		// assume we are copying 32bit data into 16 bit, if data is nearly 20 bits, 4 bits will be lost :)
		
	}

}
