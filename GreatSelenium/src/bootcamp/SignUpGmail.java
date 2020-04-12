package bootcamp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpGmail {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");

		driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
		WebElement forMyself = driver.findElement(By.xpath("//div[contains(text(),'For myself')]"));

		System.out.println(forMyself.isDisplayed());
		Thread.sleep(1000);
		forMyself.click();

		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Johnson");
		driver.findElement(By.id("username")).sendKeys("JohnJohnson1234JasdsdT");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Johnson123$@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Johnson123$@");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.id("phoneNumberId")).sendKeys("2025542374");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}
}
