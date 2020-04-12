package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("money");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			list.get(i).sendKeys(Keys.LEFT_CONTROL, Keys.ENTER);
		}
		driver.quit();
	}
}
