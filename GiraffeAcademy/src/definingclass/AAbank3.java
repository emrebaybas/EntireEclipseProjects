package definingclass;

public class AAbank3 {

	public static void main(String[] args) {

		// new customer with no initialBalance
		AAcustomer3 cust1 = new AAcustomer3("Emre","Baybas");
	//	cust1.init("Emre", "Baybas");
//		cust1.firstName = "Emre";
//		cust1.lastName = "Baybas";
		cust1.addAccount();

		// new customer with 500.0 initialBalance
		AAcustomer3 cust2 = new AAcustomer3();
		
		//if i forget to call the init method here
	//cust2.init("Fazil", "Kopru");
		
//		cust2.firstName = "Fazil";
//		cust2.lastName = "Kopru";
		cust2.addAccount(500.0);
	}

}
