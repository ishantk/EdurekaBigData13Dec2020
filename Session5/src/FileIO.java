import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		
		// File Write Operation
		/*try {
			File file = new File("/users/ishantkumar/Downloads/student.txt");
			PrintWriter writer = new PrintWriter(file);
			writer.println("John Watson");
			writer.println(30);
			writer.close();
			System.out.println("Data Written in File");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}*/
		
		
		// File Read Operation
		try {
			File file = new File("/users/ishantkumar/Downloads/student.txt");
			Scanner scanner = new Scanner(file);
			String name = scanner.nextLine();
			int age = scanner.nextInt();
			
			System.out.println("Name is: "+name);
			System.out.println("Age is: "+age);
			
			scanner.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
