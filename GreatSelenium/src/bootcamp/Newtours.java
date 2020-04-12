package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newtours {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Car Rentals")).click();
		//explicit wait
		WebDriverWait w=new WebDriverWait(driver,6);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("REGISTER")));
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		
	}

}
