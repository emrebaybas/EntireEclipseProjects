package test;

import org.testng.annotations.Test;

public class G3 {

	@Test
	public void mX() {
		System.out.println("MethodX");
	}
	
	@Test(groups= {"Smoke"})
	public void mY() {
		System.out.println("MethodY");
	}
	
	@Test
	public void mZ() {
		System.out.println("MethodZ");
	}
	
}
