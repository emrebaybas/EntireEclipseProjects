package inheritance;

public class Person {
	//we use protected instead of public to demonstrate
	// that protected variables can be accessed by subclasses
	//and others in the same directory
	//using public would be fine too but if you make private 
	//you cannot inherit Person class for Employee class
	protected String firstName;
	protected String lastName;
	protected int age;
	
	public Person(String f, String l, int a) {
		firstName=f;
		lastName=l;
		age=a;
	}
	public  Person() {
		this(" "," ",0);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}

}
