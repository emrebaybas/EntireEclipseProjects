package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import globalvariables.HashMapTestData;

public class aaaHashmapTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void validateSuccessfulLoginWithValidCredentials() {
		
		String validCredentials[]=HashMapTestData.getLoginCredentials().get("Valid user").split("_");
		String username= validCredentials[0];
		String password=validCredentials[1];
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void validateUnsuccessfulLoginWithInvalidCredentials() {
		
		String invalidCredentials[]=HashMapTestData.getLoginCredentials().get("Invalid user").split("_");
		String username= invalidCredentials[0];
		String password=invalidCredentials[1];
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver=null;
	}
}
