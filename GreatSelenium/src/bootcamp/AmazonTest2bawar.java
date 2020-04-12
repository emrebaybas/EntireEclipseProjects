package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest2bawar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
		
		//List<WebElement> list=driver.findElements(By.cssSelector("div[id*='issDiv']"));
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@id,'issDiv')]"));
		
		System.out.println("Number of suggestions for the keyword entered is :" + list.size());
		System.out.println("****************************");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());	
		}
	}
}
