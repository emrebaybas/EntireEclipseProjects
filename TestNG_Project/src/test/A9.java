package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A9 {

	@BeforeMethod
	public void m1() {
		System.out.println("You will see me BEFORE EACH method ");
	}
	
	@AfterMethod
	public void m2() {
		System.out.println("You will see me AFTER EACH method");
		System.out.println("****************");
	}
	@Test
	public void m3() {
		System.out.println("Method3");
	}
	
	@Test
	public void m4() {
		System.out.println("Method4");
	
	}

	@BeforeClass
	public void m5() {
		System.out.println("I AM BeforeClass ");
		System.out.println("****************");
	}
	
	@AfterClass
	public void m6() {
		System.out.println("I AM AfterClass ");
	}
	
	
}
