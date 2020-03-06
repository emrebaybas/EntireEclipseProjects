package test;

import org.testng.annotations.Test;

public class G2 {

	@Test
	public void ma() {
		System.out.println("Method-a");
	}
	
	@Test(groups= {"Smoke"})
	public void mb() {
		System.out.println("Method-b");
	}
	
	@Test
	public void mc() {
		System.out.println("Method-c");
	}
}
