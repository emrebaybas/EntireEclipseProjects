package definingclass;

public class EEaccount5 {

	double balance;
	String accountId;
	static int nextId = 0;
	static final int ROUTINGNUMBER = 1234567;
	
	EEaccount5(){
		this(0.0);
	}

		EEaccount5(double initialBalance){
			balance=initialBalance;
			accountId= EEaccount5.getNextId();
		}
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
		return "ACCT: " + EEaccount5.nextId++;
	}
}
