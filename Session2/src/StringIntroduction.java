
public class StringIntroduction {

	public static void main(String[] args) {
		
		// Interned Strings
		// where s1 and s2 are reference variables pointing to the String literal Hello
		String s1 = "Hello";
		String s2 = "HELLO";
		
		// Object Strings
		// where s1 and s2 are reference variables pointing to the String Objects containing Hello
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		// == operator is comparing the addresses and no the Hello String content :)
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}

		System.out.println();
		
		// equals method -> compares the content rather than addresses :)
		//if(s1.equals(s2)) {
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3 equals s4");
		}else {
			System.out.println("s3 not equals s4");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1 equals s3");
		}else {
			System.out.println("s1 not equals s3");
		}
		
		System.out.println();
		
		//if(s1.compareTo(s2) == 0) {
		if(s1.compareToIgnoreCase(s2) == 0) {
			System.out.println("s1 compareTo s2");
		}else {
			System.out.println("s1 not compareTo s2");
		}
		
		if(s3.compareTo(s4) == 0) {
			System.out.println("s3 compareTo s4");
		}else {
			System.out.println("s3 not compareTo s4");
		}
		
		if(s1.compareTo(s3) == 0) {
			System.out.println("s1 compareTo s3");
		}else {
			System.out.println("s1 not compareTo s3");
		}
		
	}

}
