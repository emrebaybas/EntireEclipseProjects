package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P1_Global_SuiteLevelParameters {
	
	@Parameters({"URL","username"})
	@Test
	public void m0(String bankUrl,String user) {
		System.out.println("Hello");
		System.out.println(user);
		System.out.println(bankUrl);

	}

	@Test
	public void m1() {
		System.out.println("Personal Loan ");
	}
	
	@Test
	public void m2() {
		System.out.println("Application is ");
	}
	
	@Test
	public void m3() {
		System.out.println("Successfull");
		System.out.println("***********");
	}
	
}
