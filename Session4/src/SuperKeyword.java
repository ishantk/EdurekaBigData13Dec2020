
class Animal{
	
	int weight;
	
	Animal() {
		weight = 10;
		System.out.println("[DEFAULT CON] Animal Object Constructed");
	}
	
	Animal(int weight) {
		this.weight = weight;
		System.out.println("[PARAMETERIZED CON] Animal Object Constructed");
	}
}

class Dog extends Animal{
	
	int weight;
	
	Dog(){
		super(15); // this is execution of Parent Constructor from the Child
		weight = 20;
		super.weight++;
		System.out.println("[DEFAULT CON] Dog Object Constructed");
	}
	
	void show() {
		System.out.println("ANIMAL weight is: "+super.weight ); // access attribute of Parent from the Child
		System.out.println("DOG weight is: "+weight);
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.show();

	}

}
