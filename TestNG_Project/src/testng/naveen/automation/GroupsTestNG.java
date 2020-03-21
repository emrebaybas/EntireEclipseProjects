package testng.naveen.automation;

import org.testng.annotations.Test;

public class GroupsTestNG {

	
	@Test (groups="homepage", priority=2)
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test (groups="homepage", priority=1)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test (groups="homepage")
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test (groups="homepage")
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test (groups="loginpage")
	public void test5() {
		System.out.println("Test5");
	}
	
	@Test (groups="loginpage")
	public void test6() {
		System.out.println("Test6");
	}
	
	@Test (groups="loginpage")
	public void test7() {
		System.out.println("Test7");
	}
	
}
