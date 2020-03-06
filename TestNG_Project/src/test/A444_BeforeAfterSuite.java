package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A444_BeforeAfterSuite {

	@BeforeSuite
	public void setUP() {
		System.out.println("I am @BeforeSuite, I get executed absolute first before test-suite starts");
	}
	
	@AfterSuite
	public void lastThings() {
		System.out.println("I am @AfterSuite, I get executed absolute last after test-suite finished");
	}
	
	@Test
	public void AboutNewArrivals() {
		System.out.println("New season items will be colorful!");
	}
	
	@Test
	public void NewArrivals() {
		System.out.println("New season items will be gone very fast!");
	}
}
