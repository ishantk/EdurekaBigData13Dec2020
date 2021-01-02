package co.edureka.model;

import java.io.Serializable;

// Serializable is a Marker Interface
// it tells RTE that any class implementing it can be Serialized i.e. Objects can be directly Saved in file :)
public class Patient implements Serializable{
	
	int patientID;
	String name;
	String phone;
	String email;
	String gender;
	int age;
	
	public Patient() {
		
	}
	
	public Patient(int patientID, String name, String phone, String email, String gender, int age) {
		this.patientID = patientID;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	// toString is to print reference variable and show the data within object rather than shwoing HashCode :)
	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", gender=" + gender + ", age=" + age + "]";
	}

}
