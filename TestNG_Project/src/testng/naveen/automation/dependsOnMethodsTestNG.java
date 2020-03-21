package testng.naveen.automation;

import org.testng.annotations.Test;

public class dependsOnMethodsTestNG {

	
//So in order to check  balance we have to login first
// Without login we can not view the balance 
//So, getAccountBalance dependsOnMethods="login'
	
	@Test 
	public void login() {
		System.out.println("Username--Password--Click on login");
	}
	
	@Test (dependsOnMethods="login")
	public void getAccountBalance() {
		System.out.println("Click on Account Balance Tab");
	}
	
	@Test (invocationCount=20)
	public void deposit() {
		System.out.println("$100 deposited to the account");
	}
	
}
