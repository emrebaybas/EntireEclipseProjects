package abstractclasses;

public abstract class abst {
String username="emre";
String password="emre1234";
	
	public abstract void checkBalance();
	
	public abstract void deposit();

	public abstract void withdrawal();

public void getName() {
	System.out.println("Username is "+username);
}

public void getPassword() {
	System.out.println("Password is "+password);
}


}
