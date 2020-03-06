package oops_objectorientedprogrammingsystem;

public class Student {
	
	
	int studentId;
	String studentName;
	char grade;
	
	void display() 
	{
		
		System.out.println(studentId+ " " +studentName+" "+grade);
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.studentId=100;
		s1.studentName="Emre Baybas";
		s1.grade='A';
		
		Student s2=new Student();
		s2.studentId=101;
		s2.studentName="Fazil Kopru";
		s2.grade='A';
		
		Student s3=new Student();
		s3.studentId=102;
		s3.studentName="Erhan Ozchare";
		s3.grade='A';
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}

}
