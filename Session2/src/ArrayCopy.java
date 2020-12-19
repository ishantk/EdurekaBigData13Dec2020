import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		// array1 has elements as initialized with
		int[] array1 = {10, 20, 30, 40, 50};
		
		// by default will have all the elements as 0
		int[] array2 = new int[10];

		System.out.println("array2 before arraycopy is: "+Arrays.toString(array2));
		
		System.arraycopy(array1, 0, array2, 5, 3);
		
		System.out.println("array2 after arraycopy is: "+Arrays.toString(array2));
		
		char[] array3 = {'H', 'A', 'P', 'P', 'Y'};
		char[] array4 = {'$', '@', 'W', 'O', 'R', 'L', 'D'};
		
		System.out.println(Arrays.toString(array3));
		System.arraycopy(array3, 0, array4, 2, array3.length);
		System.out.println(Arrays.toString(array4));
		
	}

}
