package co.edureka.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edureka.model.Patient;

public class SerializationDeserializationApp {

	public static void main(String[] args) {
		
		// SERIALIZATION
		// Write Object in File
		/*
		try {
		
			Patient patient = new Patient(101, "Fionna", "+91 98765 12345", "fionna@example.com", "female", 45);
			
			File file = new File("/users/ishantkumar/Downloads/fionna.txt");
			FileOutputStream stream = new FileOutputStream(file);
			ObjectOutputStream objectStream = new ObjectOutputStream(stream);
			
			// Write the Object in the File Directly :)
			objectStream.writeObject(patient);
			
			objectStream.close();
			stream.close();
			
			System.out.println("Patient Fionna Saved :) in "+file.getName());
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}*/
		
	
		// DESERIALIZATION
		// Read the file and create the Object
		try {
	
			File file = new File("/users/ishantkumar/Downloads/fionna.txt");
			FileInputStream stream = new FileInputStream(file);
			ObjectInputStream objectStream = new ObjectInputStream(stream);
			
			Patient patinet = (Patient)objectStream.readObject();
			System.out.println("PATIENT DETAILS");
			System.out.println(patinet);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	
		
		

	}

}
