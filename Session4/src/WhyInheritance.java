import java.util.Scanner;

/*
class MobilePhone{
	int pid;
	String name;
	String brand;
	int price;
	String color;
	int ram;
	int memory;
	
	MobilePhone(){
		System.out.println("Mobile Phone Object Constructed");
	}
	
	void setMobilePhoneData(int pid, String name, String brand, int price, String color, int ram, int memory) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.memory = memory;
	}
	
	void showMobilePhoneDetails() {
		System.out.println("Mobile Phone Details");
		System.out.println(pid+" | "+name+" | "+brand+" | "+price+" | "+color+" | "+ram+" | "+memory);
	}
}

class Shoe{
	int pid;
	String name;
	String brand;
	int price;
	String color;
	int shoeSize;
	String type; // sports, formal ...
	char gender; // m, f
	
	Shoe(){
		System.out.println("Shoe Object Constructed");
	}
	
	void setShoeData(int pid, String name, String brand, int price, String color, int shoeSize, String type, char gender) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.shoeSize = shoeSize;
		this.type = type;
		this.gender = gender;
	}
	
	void showShoeDetails() {
		System.out.println("Shoe Details");
		System.out.println(pid+" | "+name+" | "+brand+" | "+price+" | "+color+" | "+shoeSize+" | "+type+" | "+gender);
	}
}*/

// Parent Class for Our Use Case -> Having the common attributes
class Product{
	
	int pid;
	String name;
	String brand;
	int price;
	String color;
	
	Product(){
		System.out.println("Product Object Constructed");
	}
	
	void setProductData(int pid, String name, String brand, int price, String color) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	void showProductDetails() {
		System.out.println("Product Details");
		System.out.println("[PRODUCT] "+pid+" | "+name+" | "+brand+" | "+price+" | "+color);
	}
}

class MobilePhone extends Product{
	
	// code only additional attributes here -> CODE REUSABILITY
	int ram;
	int memory;
	
	MobilePhone(){
		System.out.println("Mobile Phone Object Constructed");
	}
	
	void setMobilePhoneData(int pid, String name, String brand, int price, String color, int ram, int memory) {
		setProductData(pid, name, brand, price, color); // execute Parent's Method
		this.ram = ram;
		this.memory = memory;
	}
	
	void showMobilePhoneDetails() {
		System.out.println("Mobile Phone Details");
		showProductDetails();
		System.out.println("[Mobile] "+ram+" | "+memory);
	}
}

class Shoe extends Product{

	int shoeSize;
	String type; // sports, formal ...
	char gender; // m, f
	
	Shoe(){
		System.out.println("Shoe Object Constructed");
	}
	
	void setShoeData(int pid, String name, String brand, int price, String color, int shoeSize, String type, char gender) {
		setProductData(pid, name, brand, price, color);
		this.shoeSize = shoeSize;
		this.type = type;
		this.gender = gender;
	}
	
	void showShoeDetails() {
		System.out.println("Shoe Details");
		showProductDetails();
		System.out.println("[Shoe] "+shoeSize+" | "+type+" | "+gender);
	}
}

public class WhyInheritance {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		int pid = scanner.nextInt();
		
		MobilePhone phone = new MobilePhone();
		phone.setMobilePhoneData(pid, "iPhone12", "Apple", 60000, "Black", 4, 256);
		phone.showMobilePhoneDetails();
		
		System.out.println();
		
		Shoe shoe = new Shoe();
		shoe.setShoeData(201, "Alphabounce", "Adidas", 5000, "black", 9, "sports", 'm');
		shoe.showShoeDetails();
		
		// release the memory resources
		scanner.close();
		
	}

}


