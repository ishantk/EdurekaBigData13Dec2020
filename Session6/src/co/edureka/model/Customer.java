package co.edureka.model;

// Represents the structure of an Object and is 
// having details regarding COVID Temperature logging into the store

public class Customer {
	
	// Attributes
	public String name;
	public String phone;
	public double temperature;
	public String dateTimeStamp;
	
	public Customer() {
		
	}
	
	public Customer(String line) {
		String[] data = line.split(",");
		name = data[0];
		phone = data[1];
		temperature = Double.parseDouble(data[2]);
		dateTimeStamp = data[3];
	}
	
	public Customer(String name, String phone, double temperature, String dateTimeStamp) {
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
		this.dateTimeStamp = dateTimeStamp;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", temperature=" + temperature + ", dateTimeStamp="
				+ dateTimeStamp + "]";
	}
	
	public String toCSV() {
		return name+","+phone+","+temperature+","+dateTimeStamp+"\n";
	}
	
	public void showCustomer() {
		System.out.println("-------------------------");
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		System.out.println("Temperature: "+temperature);
		System.out.println("DateTimeStamp: "+dateTimeStamp);
		System.out.println("-------------------------");
		System.out.println();
	}
	
}
