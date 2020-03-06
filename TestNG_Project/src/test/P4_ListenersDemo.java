package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P4_ListenersDemo {
	

	@Test
	public void m0() {
		System.out.println("Hello");
		System.out.println("Emre");
		
	}

	@Test
	public void m1() {
		System.out.println("Personal Loan ");
		Assert.assertTrue(false);
	}
	
	@Test
	public void m2() {
		System.out.println("Application is ");
	}
	
	@Test
	public void m3() {
		System.out.println("Successfull");
	}
	
	
}
