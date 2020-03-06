package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A8 {

	@Test
	public void Class1() {
		System.out.println("class1");
	}
	
	@Test
	public void Class2() {
		System.out.println("class2");
	}
	@BeforeClass
	public void Class3() {
		System.out.println("class3 is set as BeforeClass");
	}
	
	@AfterClass
	public void Class4() {
		System.out.println("class4 is set as AfterClass");
	}
	
	@Test
	public void Classt5() {
		System.out.println("class5");
	}
	
	
}
