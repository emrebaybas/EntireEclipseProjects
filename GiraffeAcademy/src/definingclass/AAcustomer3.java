 package definingclass;

public class AAcustomer3 {

	String firstName;
	String lastName;
	AAaccount3 acc;
	
	
	
//	void init(String fn,String ln){
//		firstName=fn;
//		lastName=ln;
//	}
	
//Lets modify this and make it a constructor
//delete the void bc constructor does not return a type not even void
//change the init to AAcustomer3 because
//Constructor name has to be same as class name!
	//also go to AAbank3 class and delete the init method
	
	AAcustomer3(){    //this is how you set a default value for constructor
		this("N/A","N/A");   //using THIS keyword
	}
	
	//Now This is a Constructor.
	AAcustomer3(String fn,String ln){
		firstName=fn;
		lastName=ln;
	}
	
	// addAccount Method when no balance entered
	// if you look at cust1 has no initialBalance
	// So account for cust1 will be created with this method
	void addAccount() {
//		acc = new AAaccount3();
//		acc.accountId = AAaccount3.getNextId();
//		acc.balance = 0;
//		acc.display();
		//instead we can call second method by entering
		//0 for initial balance  would be faster
		addAccount(0);
	}

//addAccount Method when initialBalance is entered.
//if you look at cust2 has  initialBalance of 500.0
//So account for cust2 will be created with this method
	void addAccount(double initialBalance) {
		acc = new AAaccount3();
		acc.accountId = AAaccount3.getNextId();
		acc.balance = initialBalance;
		System.out.println("Account for "+firstName+" "+lastName+" is created");
		acc.display();

	}
}