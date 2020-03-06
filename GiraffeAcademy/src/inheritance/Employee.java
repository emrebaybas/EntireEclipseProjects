package inheritance;

public class Employee extends Person{
// employee class gets firstName,lastName and age from Person class
	//So, we did not have to duplicate the code for that
	protected String title;
	protected float salary;
	
	//Constructors cannot be inherited so we have to create one with 5 variables
	//Because person class had only 3 variable constructors.
	public Employee(String f, String l, int a, String t, float s) {
		firstName=f;
		lastName=l;
		age=a;
		title=t;
		salary=s;
	}
	//This is the default constructor if no entry for variable values
	public Employee() {
		this(" "," ", 0, " ", 0.0F);
	}
	//these automatically created from Source/Generate getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
