package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutoSuggestion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");

		Actions a = new Actions(driver);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		a.moveToElement(searchBox).sendKeys(Keys.ARROW_DOWN).build().perform();

		// if you want to move down 5 time you can write a for loop

//		for (int i = 0; i <=5; i++) {
//			a.moveToElement(searchBox).sendKeys(Keys.ARROW_DOWN).build().perform();
//		}

	}
}
