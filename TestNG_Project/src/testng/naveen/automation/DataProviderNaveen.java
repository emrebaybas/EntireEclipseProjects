package testng.naveen.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderNaveen {

	WebDriver driver;
	
	@DataProvider
	public Object[][] getData() {
		Object data[][]=new Object[3][2];
		
				data[0][0]="emre@gmail.com";
				data[0][1]="123456";
				data[1][0]="fazil@gmail.com";
				data[1][1]="123123";
				data[2][0]="erhan@gmail.com";
				data[2][1]="456456";
				
		return data;
	}
	
	@BeforeMethod
	public void initializeDriverAndNavigateToWebsite() {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	
	@Test (dataProvider="getData")
	public void login(String username, String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();	
	}
}




