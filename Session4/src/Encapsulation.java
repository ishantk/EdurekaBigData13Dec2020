
class Employee{
	
	private String name;
	private String email;
	private int salary;
	
	// SETTERS - To Set the Data
	
	public void setName(String name) {
		if(name.isEmpty()) {
			name = "NA";
		}else {
			this.name = name;
		}
	}
	
	public void setEmail(String email) {
		if(email.contains("@") && email.contains(".")) {
			this.email = email;
		}else {
			email = "NA";
		}
	}
	
	public void setSalary(String designation) {
		if(designation == "Manager") {
			salary = 100000;
		}else if(designation == "Software Engineer") {
			salary = 50000;
		}else {
			salary = 30000;
		}
	}
	
	
	// GETTERS - To Read the Data
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getSalary() {
		return salary;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();

		// errors
		// as direct access to attributes is now not possible due to private :)
		//emp1.name = "John";
		//emp1.email = "johnjohn.haha";
		//emp1.salary = 150000;

		emp1.setName("John");
		emp1.setEmail("johnjohn.haha");
		emp1.setSalary("Manager");
		
		System.out.println(emp1.getName()+" "+emp1.getEmail()+" "+emp1.getSalary());
		
	}

}
