package definingclass;

public class EEcustomer5 {

	String firstName;
	String lastName;
	EEaccount5 acc;

	EEcustomer5(String fName, String lName) { // this is how you set a default value for constructor
		this(fName, lName, 0.0); // using THIS keyword
	}

	EEcustomer5(String fName, String lName, double initialBalance) {
		firstName = fName;
		lastName = lName;
		acc = new EEaccount5(initialBalance);
		System.out.println("Account for "+firstName+" "+lastName+" is created");
		acc.display();
	}
}
