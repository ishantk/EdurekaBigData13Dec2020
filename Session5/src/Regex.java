import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
							//0123456789
		String textMessage = "I will be back in 10 minuts and i am in my room";
		String regexPattern = "\\bin\\b";
		
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(textMessage);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println("Pattern Found at "+matcher.start()+" - "+matcher.end());
		}

	}

}

/*
 	1. Check if the User has Entered the Vehicle Number as 
 	PB10AL2937 -> 1st 2 chars next 2 digits, next 2 chars and last 4 as digits and total of 10 length
 */
