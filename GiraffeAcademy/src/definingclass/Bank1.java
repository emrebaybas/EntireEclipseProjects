package definingclass;

public class Bank1 {

	public static void main(String[] args) {
		Customer1 cust = new Customer1();
		cust.firstName = "Jim";
		cust.lastName = "Harper";
		//addAccount method is used here
		cust.addAccount(250.0);
	}
}