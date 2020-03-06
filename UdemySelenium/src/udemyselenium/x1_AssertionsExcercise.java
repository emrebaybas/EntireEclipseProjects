package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class x1_AssertionsExcercise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);
		
	
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
