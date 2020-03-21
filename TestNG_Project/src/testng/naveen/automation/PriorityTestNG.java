package testng.naveen.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTestNG {

	WebDriver driver;
	
	@BeforeMethod
	public void initializeDriver() {
		
		System.setProperty("webdriver.chrome.driver","C://Users//emrba//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test (priority=1)
	public void getTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test (priority=2)
	public void getLogo() {
		boolean logoValidated=driver.findElement(By.xpath("//div[@class='ddlv-a']")).isDisplayed();
		Assert.assertTrue(logoValidated);
	}
	
	@Test (priority=3)
	public void getGmailLink() {
		boolean gmailLinkValidated=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(gmailLinkValidated);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
