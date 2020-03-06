package test;

import org.testng.annotations.Test;

public class G1 {

	@Test
	public void m1() {
		System.out.println("Method1");
	}
	
	@Test(groups= {"Smoke"})
	public void m2() {
		System.out.println("Method2");
	}
	
	@Test
	public void m3() {
		System.out.println("Method3");
	}
}

