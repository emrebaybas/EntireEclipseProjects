package Tutorial1;

public class Student2 {

	public static void main(String[] args) {
		
		Student myStudent = new Student();
		myStudent.firstName = "Emre";
		myStudent.lastName = "Baybas";
		myStudent.major = "IT";
		myStudent.age= 30;
		myStudent.gpa=3.52;
		myStudent.onProbation= false;
		
		System.out.println(myStudent.lastName);
		System.out.println(myStudent.age);
		System.out.println(myStudent.gpa);
	}

}
