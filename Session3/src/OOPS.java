import java.util.Scanner;

/*
 	OOPS in Real World
 	
 	Object: Anything in reality is an object -> which we can see and feel :)
 	Class : Drawing of an Object
 	
 	What must come in your mind first ? is it object or class ?
 	We must think of Object first !!
 	Once we know how the object must be -> thr after create its class
 	
 	
 	Principle of OOPS
 	1. Think of an Object
 	2. Create it Class i.e. Drawing
 	3. From the Drawing create the real object :)
 	
 	
 	OOPS in Computer Science
 	Object:  is a Multi Value Container i.e. a BOX
 	Class : represents textually what has to be thr in the Object
 	
 	Principle of OOPS
 	1. Think of an Object
 		An object will be a container, so we need to think about what data it will store in it
 		i.e. attributes of the object. i.e. data members or the state of object
 		
 		makemytrip : Use case
 		---------------------
 		Object: 		OneWayFlightBooking
 		Attributes:		fromLocation, toLocation, departureDate, travellers, travelClass
 		
 		
 	2. Create it Class i.e. Drawing
 		Here, we code it rather than drawing i.e. define the structure of object Textually :)
 		
 	3. From the Drawing create the real object :)
 	
 	
 */

// 1. Think of an Object
//    Object: 	  OneWayFlightBooking
//    Attributes: fromLocation, toLocation, departureDate, travellers, travelClass

// 2. Create Class
class OneWayFlightBooking{
	
	// Create Attributes in the Class which will be exactly the property of Object and not of class
	// whatever we code in class is by default the property of Object
	// attributes or data members or state or instance variables
	String fromLocation;
	String toLocation;
	String departureDate;
	int travellers;
	String travelClass;
	
	// Constructor -> DEFAULT CONSTRUCTOR (As it is not taking any inputs)
	// Same Name as of Class Name
	// Its a Method with no return type
	// It gets executed whenever object is constructed automatically
	
	OneWayFlightBooking(){
		System.out.println("OneWayFlightBooking - DEFAULT CONSTRUCTOR Executed");
		fromLocation = "Delhi";
		toLocation = "Bangalore";
		departureDate = "25th December, 2020";
		travellers = 1;
		travelClass = "economy";
	}
	
	// Constructor -> PARAMTERIZED CONSTRUCTOR (As it is taking any inputs)
	OneWayFlightBooking(String fromLocation, String toLocation, String departureDate, int travellers, String travelClass){
		System.out.println("OneWayFlightBooking - PARAMTERIZED CONSTRUCTOR Executed");
		
		// LHS this.fromLocation is the property of object
		// RHS fromLocation is the input of Constructor
		// this is a reference variable which will refer to the current object in action
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.travellers = travellers;
		this.travelClass = travelClass;
	}
	
	void setUpFlightBookingFromUser() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter From Location");
		fromLocation = scanner.nextLine();
		
		System.out.println("Enter To Location");
		toLocation = scanner.nextLine();
		
		System.out.println("Enter Travel Date");
		departureDate = scanner.nextLine();
		
		System.out.println("Enter Travel Class");
		travelClass = scanner.nextLine();
		
		System.out.println("Enter Travellers");
		travellers = scanner.nextInt();
		
		scanner.close();
	}
	
	void updateDataForFlightBooking(String fromLocation, String toLocation, String departureDate, int travellers, String travelClass){
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.travellers = travellers;
		this.travelClass = travelClass;
	}
	
	void showFlightBookingDetails() {
		System.out.println("==FlightBooking Details===");
		System.out.println("FROM: "+fromLocation+" TO: "+toLocation);
		System.out.println("DEPARTURE: "+departureDate+" ["+travellers+"] Travellers ["+travelClass+"]");
		System.out.println("==========================");
		System.out.println();
	}
}

public class OOPS {

	public static void main(String[] args) {
		
		// 3. From the Drawing create the real object :)
		OneWayFlightBooking ref1 = new OneWayFlightBooking(); // new OneWayFlightBooking() -> is instruction to create the object
		OneWayFlightBooking ref2 = new OneWayFlightBooking();
		OneWayFlightBooking ref3 = ref1;	// Reference Copy
		
		OneWayFlightBooking ref4 = new OneWayFlightBooking("Mumbai", "Pune", "1st Jan, 2021", 2, "business");
		
		// ref1, ref2 and ref3 are JUST reference variables which will hold the data i.e. HASHCODE of the Object in HEAP
		
		System.out.println("ref1 is: "+ref1);
		System.out.println("ref2 is: "+ref2);
		System.out.println("ref3 is: "+ref3);
		
		// Operations on Object
		// 1. Write Data in Object
		/*ref1.fromLocation = "Delhi";
		ref1.toLocation = "Bangalore";
		ref3.departureDate = "25th December, 2020";
		ref3.travellers = 2;
		ref1.travelClass = "economy";
		
		ref2.fromLocation = "Mumbai";
		ref2.toLocation = "Maldives";
		ref2.departureDate = "1st January, 2021";
		ref2.travellers = 4;
		ref2.travelClass = "business";*/
		
		// 2. Update Data in Object
		ref1.travellers = 8;
		ref1.departureDate = "26th December, 2020";
		
		ref2.setUpFlightBookingFromUser();
		
		// 3. Read Data From Object
		/*System.out.println(ref1.fromLocation+" to "+ref1.toLocation+" on "+ref1.departureDate+" for "+ref1.travellers+" on "+ref1.travelClass);
		System.out.println(ref2.fromLocation+" to "+ref2.toLocation+" on "+ref2.departureDate+" for "+ref2.travellers+" on "+ref2.travelClass);
		System.out.println(ref3.fromLocation+" to "+ref3.toLocation+" on "+ref3.departureDate+" for "+ref3.travellers+" on "+ref3.travelClass);
		System.out.println(ref4.fromLocation+" to "+ref4.toLocation+" on "+ref4.departureDate+" for "+ref4.travellers+" on "+ref4.travelClass);
		*/
		
		ref1.updateDataForFlightBooking("Delhi", "Chennai", "18th Jan, 2021", 12, "economy");
		
		ref1.showFlightBookingDetails();
		ref2.showFlightBookingDetails();
		ref3.showFlightBookingDetails();
		ref4.showFlightBookingDetails();
		
		// 4. Delete Objects
		// Deletion Happens Automatically by Garbage Collector of JVM
		// GC is a thread which runs after a specific period of time and deletes unused objects from memory automatically for us
		
		// Forcefully executing GC to remove unused objects for your program :)
		System.gc();
		
		// Challenge:
		// Operations on Object
		// If we have 100 objects, its really difficult to write 5 attributes again and again in 5 lines of code :(
		// i.e. for 100 Object, we may end up in writing 500 lines of code to pouplate i.e. write data in it :(
	}
}
