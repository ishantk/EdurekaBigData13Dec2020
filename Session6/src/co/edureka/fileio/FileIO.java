package co.edureka.fileio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.edureka.model.Customer;

public class FileIO {
	
	File file;
	
	public FileIO() {
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
		String formattedDate = dateFormat.format(date);
		
		file = new File("/users/ishantkumar/Downloads/customers_"+formattedDate+".csv");
		System.out.println("Working on File: "+file.getName());
	}
	

	public void writeInFile(String data) {
		
		try {
			
			// write data as text
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // true -> means enable append mode
			writer.write(data);
			writer.close();
			
			System.out.println("Data Saved in File :)");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public void writeInFileAgain(String data) {
		
		try {
			
			// write data as bytes :)
			//FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream stream = new FileOutputStream(file, true);	// true -> means enable append mode
			
			stream.write(data.getBytes());
			stream.close();
			
			System.out.println("Data Saved in File :)");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public void readFromFile() {
		
		try {
			FileReader reader = new FileReader(file);				// read char by char
			BufferedReader buffer = new BufferedReader(reader);		// line by line
			
			String line = "";
			
			while((line = buffer.readLine()) != null) {
				//System.out.println(line);
				Customer customer = new Customer(line);
				customer.showCustomer();
				
				//if(customer.name.toLowerCase().contains("e")) {
				//customer.showCustomer();
				//}
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void readFromFileAgain() {
		
		try {
			FileInputStream stream = new FileInputStream(file);				// read byte by byte
			// Assignment -> how can you get an entire line :)
			
			int ch=0;
			
			while((ch = stream.read()) != -1) {	// -1 here means end of file i.e. no more byte to be read
				System.out.print((char)ch);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
