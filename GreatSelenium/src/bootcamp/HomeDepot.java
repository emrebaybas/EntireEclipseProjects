package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://homedepot.com");

		driver.findElement(By.xpath("//div[@class='MyAccount__icon']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		driver.findElement(By.id("email")).sendKeys("adsdQRTHh123@gmail.com");
		driver.findElement(By.id("password-input-field")).sendKeys("eeRqe@e312");
		driver.findElement(By.id("zipCode")).sendKeys("20724");
		driver.findElement(By.id("phone")).sendKeys("2024456322");
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Skip for now & Continue Shopping')]")).click();
	}
}
