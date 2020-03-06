package definingclass;

public class Employee {

	private String firstName;
	private String lastName;
	public int salary;
	public int empId;

public void showEmp() {
	System.out.println(firstName+" "+lastName
			+" "+"with the employee ID of "+empId+ 
			" makes "+salary +" per year.");
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
}