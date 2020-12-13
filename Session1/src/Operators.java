
public class Operators {

	public static void main(String[] args) {
	
		// Unary ++ --
		int age = 10;
		// postfix: add 1 to current value
		age++;	// 11
		// prefix: add 1 to current value
		++age;	// 12
		age--;	// 11 // subtract 1 from current value
		--age;	// 10
		
		//  10			11
		int johnsAge = age++;	// first assign and than increment
		//  12			12
		int jenniesAge = ++age;	// increment first and than assign
		
		System.out.println("age is: "+age);			      // 12
		System.out.println("johnsAge is: "+johnsAge);	  // 10
		System.out.println("jenniesAge is: "+jenniesAge); // 12

		// Arithmetic +, -, *, , %
		int num1 = 10;
		int num2 = num1 % 3; // remainder
		int num3 = num1/3;	 // integral division
		System.out.println("num2 is: "+num2);
		System.out.println("num3 is: "+num3);
		
		// Relational Operators >, <, >=, <=, ==, !=
		int totalCartAmount = 600;
		int promoCode = 24505;
		System.out.println("Can we Apply Promo Code "+(totalCartAmount >= 500));
		
		// Logical Operators && ||
		System.out.println("Can we Get Flat 50% OFF "+ ( (totalCartAmount >= 500) && (promoCode == 24505) ) );
		
		// Shift Operators >> and <<
		int a = 8;
		int b = a >> 3;	// divide a by 2 power 3
		int c = a << 4;	// multiply a by 2 power 4
		
		System.out.println("b is: "+b);
		System.out.println("c is: "+c);
		
		// BitWise Operators & | ^
		int x = 8;		// 1 0 0 0
		int y = 10;		// 1 0 1 0
		
		int z1 = x & y;	// 1 0 0 0	-> 8	
		int z2 = x | y; // 1 0 1 0  -> 10
		int z3 = x ^ y; // 0 0 1 0  -> 2
		System.out.println("z1 is: "+z1);
		System.out.println("z2 is: "+z2);
		System.out.println("z3 is: "+z3);
		
		// Ternary Operator
		int discount = (totalCartAmount >= 500) ? 200 : 100;
		System.out.println("For cart value of "+totalCartAmount+" you will get a discont of "+discount);
	}

}
