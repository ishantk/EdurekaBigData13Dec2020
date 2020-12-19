import java.util.Arrays;

public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// single value container
		int data = 10;
		
		// multi value container
		// syntax 1
		int[] array1 = {10, 20, 30, 40, 50};
		int array2[] = {10, 20, 30, 40, 50};

		// syntax 2
		int[] array3 = new int[]{10, 20, 30, 40, 50};
		int array4[] = new int[]{10, 20, 30, 40, 50};
		
		// syntax 3
		int[] array5 = new int[5]; // all the values as 0 by default
		
		// can update the data later :)
		array5[0] = 11;
		array5[1] = 22;
		array5[2] = 33;
		array5[3] = 44;
		array5[4] = 55;
		
		System.out.println("array1 is: "+array1+" and its length is: "+array1.length);
		System.out.println("array2 is: "+array2+" and its length is: "+array2.length);
		System.out.println("array3 is: "+array3+" and its length is: "+array3.length);
		System.out.println("array4 is: "+array4+" and its length is: "+array4.length);
		System.out.println("array5 is: "+array5+" and its length is: "+array5.length);
		
		
		// array1, array2, array3, array4 and array5 are reference variables -> Stack
		// they hold the hash code of the array which is created in the RAM area -> Heap
		
		System.out.println("array1 is: "+Arrays.toString(array1));
		for(int element: array1) {
			System.out.print(element+" ");
		}
		System.out.println("array2 is: "+Arrays.toString(array2));
		System.out.println("array3 is: "+Arrays.toString(array3));
		System.out.println("array4 is: "+Arrays.toString(array4));
		System.out.println("array5 is: "+Arrays.toString(array5));
	}

}
