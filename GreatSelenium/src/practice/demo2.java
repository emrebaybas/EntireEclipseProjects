package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü/Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions a=new Actions(driver);
		
		
		WebElement leave=driver.findElement(By.xpath("//b[contains(text(),'Leave')]"));
		WebElement configure=driver.findElement(By.xpath("//a[@id='menu_leave_Configure']"));
		WebElement holidays=driver.findElement(By.id("menu_leave_viewHolidayList"));
		
		Thread.sleep(2000);
		a.moveToElement(leave).moveToElement(configure).moveToElement(holidays).click().build().perform();
		
	
	}				

}
