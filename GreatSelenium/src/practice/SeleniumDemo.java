package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü/Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://expedia.com/");
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.LEFT_SHIFT,"DUL");
		
		Thread.sleep(1000);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("package-origin-hp-package")).getText());
		
	
	}				

}
