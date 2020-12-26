import java.util.Scanner;

class Auth{
	
	// Same method -> With Different Arguments
	void login(String email, String password) {
		System.out.println("Logging in with Email and Password...");
		System.out.println(email+ "| "+password);
	}
	
	void login(String phone, int otp) {
		System.out.println("Logging in with Phone and OTP");
		System.out.println(phone+ "| "+otp);
	}
	
	String login(String facebookUserName) {
		System.out.println("Logging in with Facebook...");
		System.out.println(facebookUserName);
		return "Logged In With Facebook";
	}
	
	// return type has no role to play when we overload
	/*
	void login(String facebookUserName) {
		System.out.println("Logging in with Facebook...");
		System.out.println(facebookUserName);
		return "Logged In With Facebook";
	}*/
	
}

// Method Overloading
// Compiler knows at the Compile Time which method will be executed for the calls :)
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		System.out.println("1 LOGIN WITH EMAIL");
		System.out.println("2 LOGIN WITH PHONE");
		System.out.println("3 LOGIN WITH FACEBOOK");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the Login Type: ");
		int type = scanner.nextInt();
		scanner.close();
		
		Auth auth = new Auth();
		
		if(type == 1) {
			auth.login("john@example.com", "pass123");
		}else if(type == 2) {
			auth.login("+91 99999 11111", 3456);
		}else if(type == 3) {
			auth.login("john.watson");
		}else {
			System.out.println("Please Select a Valid Type");
		}
		

	}

}
