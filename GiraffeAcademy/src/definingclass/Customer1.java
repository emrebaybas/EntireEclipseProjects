package definingclass;

public class Customer1 {

	String firstName;
	String lastName;
	Account1 acc;
	
	//addAccount method created here
	void addAccount(double initialBalance) {
		
		acc=new Account1();
		acc.balance=initialBalance;
		System.out.println("Account added for "+ firstName
		+ " "+ lastName);
	}
}
