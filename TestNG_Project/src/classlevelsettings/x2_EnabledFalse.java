package classlevelsettings;

import org.testng.annotations.Test;

public class x2_EnabledFalse {
	
	@Test
	public void login() {
		System.out.println("Login Successfull \nWelcome Emre");
	}
	
	//Suppose there is a Bug in deposit module and its already reported
	//So you just want to skip this test not to fail the entire test
	//(enabled=false)
	
	@Test(enabled=false)
	public void deposit() {
		System.out.println("successfully deposited #50000");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void checkAccountBalance() {
		System.out.println("Balance is #75000");
	}
	
}
