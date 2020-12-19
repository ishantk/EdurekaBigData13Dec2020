
public class Iterations {

	public static void main(String[] args) {
		
//		int employee1Salary = 15000;
//		int employee2Salary = 25000;
//		int employee3Salary = 35000;
//		int employee4Salary = 45000;
//		int employee5Salary = 55000;
		
		// Array
		// Multi Value Container | Homogeneous
		// Array is Indexed			  0		  1	     2		3		4
		double[] employeeSalaries = {15000, 25000, 35000, 45000, 55000};
		
		System.out.println("Employee Salary at 2nd index is: "+employeeSalaries[2]);
		
		System.out.println();
		
		// Use Case -> We need to give one increment bonus of 10% to the current salary for each employee
		/*System.out.println("employeeSalaries[0] before increment is "+employeeSalaries[0]);
		employeeSalaries[0] = employeeSalaries[0] + (0.10*employeeSalaries[0]);
		System.out.println("employeeSalaries[0] after increment is "+employeeSalaries[0]);
		
		System.out.println();
		
		System.out.println("employeeSalaries[1] before increment is "+employeeSalaries[1]);
		employeeSalaries[1] = employeeSalaries[1] + (0.10*employeeSalaries[1]);
		System.out.println("employeeSalaries[1] after increment is "+employeeSalaries[1]);
		
		System.out.println();
		
		System.out.println("employeeSalaries[2] before increment is "+employeeSalaries[2]);
		employeeSalaries[2] = employeeSalaries[2] + (0.10*employeeSalaries[2]);
		System.out.println("employeeSalaries[2] after increment is "+employeeSalaries[2]);
		
		System.out.println();
		
		System.out.println("employeeSalaries[3] before increment is "+employeeSalaries[3]);
		employeeSalaries[3] = employeeSalaries[3] + (0.10*employeeSalaries[3]);
		System.out.println("employeeSalaries[3] after increment is "+employeeSalaries[3]);
		
		System.out.println();
		
		System.out.println("employeeSalaries[4] before increment is "+employeeSalaries[4]);
		employeeSalaries[4] = employeeSalaries[4] + (0.10*employeeSalaries[4]);
		System.out.println("employeeSalaries[4] after increment is "+employeeSalaries[4]);*/
		
		//int idx = 1;
		
		/*while(idx < 5) {	// Condition Checking happens at entry
			System.out.println("employeeSalaries["+idx+"] before increment is "+employeeSalaries[idx]);
			employeeSalaries[idx] = employeeSalaries[idx] + (0.10*employeeSalaries[idx]);
			System.out.println("employeeSalaries["+idx+"] after increment is "+employeeSalaries[idx]);
			idx++;
			System.out.println();
		}*/
		
		/*do{
			System.out.println("employeeSalaries["+idx+"] before increment is "+employeeSalaries[idx]);
			employeeSalaries[idx] = employeeSalaries[idx] + (0.10*employeeSalaries[idx]);
			System.out.println("employeeSalaries["+idx+"] after increment is "+employeeSalaries[idx]);
			idx++;
			System.out.println();
		}while(idx < 5);	// Condition Checking happens at the end
		*/
		
		for(int idx=0;idx<5;idx++) {
			System.out.println("employeeSalaries["+idx+"] before increment is "+employeeSalaries[idx]);
			employeeSalaries[idx] = employeeSalaries[idx] + (0.10*employeeSalaries[idx]);
			System.out.println("employeeSalaries["+idx+"] after increment is "+employeeSalaries[idx]);
			System.out.println();
		}
		
		// Enhanced For Loop - ForEach Loop
		for(double element : employeeSalaries) {
			System.out.println(element);
		}
	}

}
