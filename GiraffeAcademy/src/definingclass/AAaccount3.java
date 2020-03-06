package definingclass;

public class AAaccount3 {

	double balance;
	String accountId;
	static int nextId = 0;
	static final int ROUTINGNUMBER = 1234567;
// when use final means it cannot be changed and use all caps
// when use static it means these fields belong to class not to an object
// can be accessed by static methods without an object

	// Deposit Method
	void deposit(double amount) {
		balance = balance + amount;
	}

	// Withdraw Method
	void withdraw(double amount) {
		balance = balance - amount;
	}

	// Display Method
	void display() {
		System.out.println("**Account Information**");
		System.out.println(" ID: " + accountId);
		System.out.println("Balance: " + balance);
		System.out.println();
	}

	static String getNextId() {
		return "ACCT: " + AAaccount3.nextId++;
	}
}
