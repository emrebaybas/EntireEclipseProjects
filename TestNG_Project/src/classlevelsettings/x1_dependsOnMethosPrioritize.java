package classlevelsettings;

import org.testng.annotations.Test;

public class x1_dependsOnMethosPrioritize {

	@Test
	public void login() {
		System.out.println("Login Successfull \nWelcome Emre");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void deposit() {
		System.out.println("successfully deposited #50000");
	}
	
	@Test(dependsOnMethods= {"login","deposit"})
	public void checkAccountBalance() {
		System.out.println("Balance is #75000");
	}
	
}
