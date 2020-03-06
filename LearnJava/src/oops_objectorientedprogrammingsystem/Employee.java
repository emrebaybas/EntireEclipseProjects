package oops_objectorientedprogrammingsystem;

public class Employee {
//class
	String firstName;
	String lastName;
	int empId;
	String jobTitle;
	int salary;
	
//method
	@Override
	public String toString() {
		return "Employee "+empId+       "     First Name= " + firstName + ",\n\t\t Last Name= " 
	+ lastName  + ",\n\t\t Job Title= "+ jobTitle + ",\n\t\t Salary= " + salary+"\n" ;
	}

	public static void main(String[] args) {
		
	//objects
		Employee e1=new Employee();
		e1.firstName="Emre";
		e1.lastName="Baybas";
		e1.empId =100;
		e1.jobTitle="Software Developer";
		e1.salary=180000;
		
		Employee e2=new Employee();
		e2.firstName="Fazil";
		e2.lastName="Kopru";
		e2.empId =101;
		e2.jobTitle=" Sales Manager";
		e2.salary=180000;
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}

