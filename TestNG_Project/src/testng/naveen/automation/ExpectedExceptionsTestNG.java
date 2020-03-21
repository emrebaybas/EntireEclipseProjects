package testng.naveen.automation;

import org.testng.annotations.Test;

public class ExpectedExceptionsTestNG {

	int a[]= {1,2,3,4,5};
	
	@Test (expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void test1() {
		
		for (int i = 0; i < a.length+200; i++) {
				System.out.println(a[i]);
			}

	}
}
