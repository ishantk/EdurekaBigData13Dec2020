
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE -> they cannot be changed
		//			 0123456
		String s1 = "John, Jennie, Jim, Jack, Joe";
		
		// Any modification on String will generate a new String in the memory
		String s2 = s1.toUpperCase();
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		
		System.out.println("length of s1 is: "+s1.length());
		
		char ch1 = s1.charAt(0);
		char ch2 = s1.charAt(s1.length()-1);
		
		System.out.println("ch1: "+ch1);	// J
		System.out.println("ch2: "+ch2);	// e
		
		int idx = s1.indexOf("Jennie");
		System.out.println("idx is: "+idx);	// 6
		
		//String s3 = s1.substring(6);
		String s3 = s1.substring(6, 12);	// from 6 to 11 :)
		System.out.println("s3 is: "+s3);

		String s4 = s1.replace('J', 'K');
		System.out.println("s4 is: "+s4);
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
		
		String songName = "hello.mp3";
		if(songName.endsWith(".mp3")) {
			System.out.println("We can Play this audio files");
		}else {
			System.out.println("Error with file. Cannot be Played.");
		}
		
		String[] array = s1.split(",");
		for(String str : array) {
			System.out.println(str.trim());
		}
	}

}
