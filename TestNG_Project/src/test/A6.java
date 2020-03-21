package test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A6 {

	@Test
	public void WebTest1() {
		System.out.println("Click on Login");
	}
	
	@Test
	public void WebTest2() {
		System.out.println("Enter username");
	}
	
	@BeforeTest
	public void XsetPage() {
		System.out.println("thanks for coming back");
	}
	
}
