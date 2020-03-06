package definingclass;

public class Account1 {
	//field
	double balance;

	//method1
	void deposit(double amount) {
		balance = balance + amount;
	}
	//method2
	void withdrawal(double amount) {
		balance = balance - amount;
	}
}
