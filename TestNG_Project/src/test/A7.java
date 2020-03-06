package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A7 {

	@AfterTest
	public void WebTest1() {
		System.out.println("Close The Browser!");
	}
	
	@Test
	public void WebTest2() {
		System.out.println("Enter username");
	}
	
	@BeforeTest
	public void XsetPage() {
		System.out.println("Go to the 'https://www.abcd.com'");
	}
	
}
