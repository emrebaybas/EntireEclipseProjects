package classlevelsettings;

import org.testng.annotations.Test;

public class x3_Timeout {
	
	@Test
	public void login() {
		System.out.println("Login Successfull \nWelcome Emre");
	}
	
	//Suppose this part is taking about 40 seconds to load i
	//We can set timeout period only for this specific part 
	//(timeOut=40000)   means don't fail before 40 seconds
	
	@Test(timeOut=40000)
	public void deposit() {
		System.out.println("successfully deposited #50000");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void checkAccountBalance() {
		System.out.println("Balance is #75000");
	}
	
}

