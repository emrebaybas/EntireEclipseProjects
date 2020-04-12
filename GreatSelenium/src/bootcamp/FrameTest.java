package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");

		driver.switchTo().frame("packageListFrame");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of Packages is " + list.size());

		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");
		List<WebElement> list2 = driver.findElements(By.tagName("a"));
		System.out.println("Number of Classes is " + list2.size());

		driver.switchTo().defaultContent();

		driver.switchTo().frame("classFrame");
		List<WebElement> list3 = driver.findElements(By.tagName("a"));
		System.out.println("Number of Packages is " + list3.size());
		
	//TREE TAB AND GETTING THE NUMBER OF LINKS
		driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Tree')]")).click();
		//LIST4 IS FOR Package Hierarchies:
		//LIST5 IS FOR CLASS Hierarchies:
		List<WebElement> list4 = driver.findElements(By.xpath("//div[@class='header']//li//a"));
		List<WebElement> list5 = driver.findElements(By.xpath("//span[@class='typeNameLink']"));
		System.out.println("Number of links in the Tree section is " +( list4.size()+list5.size()));
		
	}
}
