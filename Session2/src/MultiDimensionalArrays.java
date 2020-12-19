import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		// Single Dim -> 1D Array
		int[] maharashtraCovidCases = {23123, 3344, 76544};
		int[] punjabCovidCases = {13123, 344, 6544};
		int[] haryanaCovidCases = {3123, 421, 5414};
		int[] karnatakaCovidCases = {1235, 4421, 4114};
		int[] delhiCovidCases = {4231, 3344, 1214};

		// Multi Dim -> 2D Array
		//int [][] indiaCovidCases = { maharashtraCovidCases, punjabCovidCases, haryanaCovidCases, karnatakaCovidCases, delhiCovidCases};
		int [][] indiaCovidCases = {
									//    0 	1      2
										{23123, 3344, 76544},	// 0
										{13123, 344, 6544},		// 1
										{3123, 421, 5414},		// 2
										{1235, 4421, 4114},		// 3
										{4231, 3344, 1214}		// 4
								   };
		
		System.out.println("indiaCovidCases length is: "+indiaCovidCases.length);				// 5
		
		//System.out.println("indiaCovidCases is: "+Arrays.toString(indiaCovidCases));	// HashCodes
		/*for(int[] array : indiaCovidCases) {
			System.out.println(Arrays.toString(array));
		}*/
		
		for(int i=0;i<indiaCovidCases.length;i++) { // iterating 5 times from 0 to 4
			for(int j=0;j<indiaCovidCases[i].length;j++) {	// iterate over every 1d array of 2d array over the length i.e. 3 -> 0, 1, 2
				System.out.print(indiaCovidCases[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("indiaCovidCases is: "+indiaCovidCases);
		System.out.println("maharashtraCovidCases is: "+maharashtraCovidCases);
	}

}
