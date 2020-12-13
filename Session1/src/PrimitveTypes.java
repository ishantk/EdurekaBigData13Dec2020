
public class PrimitveTypes {

	public static void main(String[] args) {
	
		// Problem Statement
		// HDFC Bank is offering 6000 cashBack on Apple iPhone 12
		// On 2 Platforms -> Amazon and Flipkart both
		// Assume HDFC Bank's promotion, is for 5 days :)
		
		// Data Analysis expected by HDFC Bank
		// 1. which platform made more sales
		// 2. which platform made more profits from their promotion
		// 3. ....
		// 4. ...
		// 5. ......
		
		// int is data type i.e. a storage container created in RAM with 4 bytes
		// iphone12Price is name of storage container also referred to as variable
		// = -> is an operator which creates and allocates a value in container
		// 79900 -> is value or literal available in container
		int iphone12Price = 79900;
		int amazonProfits = 1000;
		int flipkartProfits = 900;
		
		int amazonDay1Sales = 112;
		int amazonDay2Sales = 102;
		int amazonDay3Sales = 109;
		int amazonDay4Sales = 213;
		int amazonDay5Sales = 75;
		
		int flipkartDay1Sales = 105;
		int flipkartDay2Sales = 56;
		int flipkartDay3Sales = 97;
		int flipkartDay4Sales = 205;
		int flipkartDay5Sales = 155;
		
		int salesForAmazon = amazonDay1Sales + amazonDay2Sales + amazonDay3Sales + amazonDay4Sales + amazonDay5Sales;
		int salesForFlipkart = flipkartDay1Sales + flipkartDay2Sales + flipkartDay3Sales + flipkartDay4Sales + flipkartDay5Sales;
		
		System.out.println("salesForAmazon is: " + salesForAmazon);
		System.out.println("salesForFlipkart is: " + salesForFlipkart);
		
		System.out.println("Amazon Made More Sales: " + (salesForAmazon > salesForFlipkart));
		System.out.println("Flipkart Made More Sales: " + (salesForFlipkart > salesForAmazon));
		
		System.out.println("Profits for Amazon: " + (salesForAmazon * amazonProfits));
		System.out.println("Profits for Flipkart: " + (salesForFlipkart * flipkartProfits));
		
		double pi = 3.14;
		// Primitive Types holds the data directly rather than the HashCodes :)
		
	}

}
