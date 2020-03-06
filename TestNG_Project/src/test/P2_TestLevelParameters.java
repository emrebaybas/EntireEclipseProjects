package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P2_TestLevelParameters {
	
	@Parameters({"URL","username"})
	@Test
	public void m0(String url,String user) {
		System.out.println("Hello");
		System.out.println(url);
		System.out.println(user);
	}

	@Test
	public void m1() {
		System.out.println("Car Loan ");
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
