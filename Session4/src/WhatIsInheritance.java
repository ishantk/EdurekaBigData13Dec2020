class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	static int vehicles;
	
	// Default Constructor: Executed automatically whenever object is created in memory
	Parent(){
		System.out.println("Parent Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		vehicles = 2;
	}
	
	void show() {
		System.out.println();
		System.out.println("-----------Parent [show]------------");
		System.out.println("Data In Parent Object");
		System.out.println(fname+" "+lname+" "+wealth);
		System.out.println("------------------------------------");
	}
}


class Child extends Parent{ // Inheritance Relationship
	
	String fname;
	int wealth;
	String companyName;
	
	static int vehicles;
	
	// Default Constructor: Executed automatically whenever object is created in memory
	Child(){
		System.out.println("Child Object Constructed");
		fname = "Fionna";
		wealth = 50000;
		companyName = "ABC Ltd";
		vehicles = 3;
	}
	
	// Method Overriding -> We ReDefine Method of Parent in Child
	// with the same signature i.e. name and inputs remains same in the child also
	void show() {
		
		// super is a reference variable which refers to the Parent Object, from Child :)
		super.show();
		
		System.out.println();
		System.out.println("-----------Child [show]------------");
		System.out.println("Data In Child Object");
		System.out.println(fname+" "+lname+" "+wealth+" "+companyName);
		System.out.println("------------------------------------");
	}
}

public class WhatIsInheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.show();
		
		
		// RULE #1 : Whenever we create the Object of Child, Object of Parent will be created before the Object of Child by RTE
		Child cRef = new Child();
		//System.out.println("cRef is: "+cRef);
		
		// RULE #2 : Anything available in Parent other than private is accessible by Child
		//			 * in case child has a property within it, than it will use its own property rather than Parent's
		//cRef.wealth = cRef.wealth - 5000; // 1. here as of now, child has no attribute wealth, hence it is accessing wealth of Parent Object
		cRef.wealth = cRef.wealth - 5000;   // 2. here as of now, child has attribute wealth, hence it is accessing wealth of child Object
		
		//show of Parent will be accessible by child as it does not have it
		// cRef.show(); // 1. as show is not in the Child, it will execute show of Parent and will also show the data in Parent Object
		cRef.show(); 	// 2. as show is now in the Child, it will execute show of Child and will also show the data in Child Object
		
		
		System.out.println("Vehicles: "+Child.vehicles);
	}

}
