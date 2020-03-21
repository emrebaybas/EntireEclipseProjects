package testng.naveen.automation;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

/*
Sysem.setProperty('webdriver.chrome.diver','C://users/emreba/drivers/chromedriver.exe')
Decide if you will run testsby invoking browser or headless 
WebDriver driver= new ChromeDriver();
driver.get('https://www.website.com')
driver.getTitle();
driver.findElement(By.id('btnLogin')).click();
driver.close();
driver.manage().deleteAllCookies();
 */
	
	
	//Pre-Conditions
	@BeforeSuite // 1
	public void setProperty() {
		System.out.println("@BeforeSuite---Sysem.setProperty('webdriver.chrome.diver','C://users/emreba/drivers/chromedriver.exe')");
	}
	@BeforeTest //2
	public void headlessBrowser() {
		System.out.println("@BeforeTest----Decide if you will run testsby invoking browser or headless ");
	}
	@BeforeClass //3
	public void launchBrowser() {
	System.out.println("@BeforeClass---WebDriver driver= new ChromeDriver();");	
	}	
	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("@BeforeMethod---driver.get('https://www.website.com')");
	}
	//Actual Test
	@Test  //5
	public void getTitle() {
		System.out.println("@Test---driver.getTitle();");
	}
	@Test  //5
	public void getCurrentURL() {
		System.out.println("@Test---driver.getCurrentURL();");
	}
	@Test  //5
	public void getNavigate() {
		System.out.println("@Test---driver.navigate();");
	}
	//Post-Conditions
	@AfterMethod  //6
	public void logOut() {
		System.out.println("@AfterMethod---driver.findElement(By.id('btnLogin')).click();");
	}
	@AfterClass //7
	public void deleteAllCookies() {
		System.out.println("@AfterClass---driver.manage().deleteAllCookies();");
	}
	@AfterTest  //8
	public void closeBrowser() {
		System.out.println("@AfterTest----driver.close();");
	}
	@AfterSuite //9
		public void generateTests() {
		System.out.println("@AfterSuite----ExtentReport");
	}

}
