class Student{
	
	int rollNum;
	String name;
	String subject1, subject2, subject3;
	
	Student(){
		subject1 = "Physics";
		subject2 = "Chemistry";
		subject3 = "Mathematics";
	}
	
	Student(int rollNum, String name){
		this();	// execute default constructor
		this.rollNum = rollNum;
		this.name = name;
	}
	
	void showStudentDetails() {
		System.out.println(rollNum+" belongs to "+name);
		System.out.println("Subjects: "+subject1+", "+subject2+", "+subject3);
		System.out.println();
	}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "John");
		Student s2 = new Student(201, "Fionna");
		
		s1.showStudentDetails();
		s2.showStudentDetails();
	}

}
