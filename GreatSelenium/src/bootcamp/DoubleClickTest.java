package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://api.jquery.com/dblclick/#dblclick-handler");

		WebElement frame = driver.findElement(By.xpath("//div[@class='demo code-demo']//iframe"));
		driver.switchTo().frame(frame);

		Actions a = new Actions(driver);
		WebElement box = driver.findElement(By.xpath("//html//body//div"));
		a.moveToElement(box).doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(box).doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(box).doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(box).doubleClick().build().perform();
	}
}
