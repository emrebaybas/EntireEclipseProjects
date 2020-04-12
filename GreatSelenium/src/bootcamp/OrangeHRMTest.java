package bootcamp;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebElement adminTab = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", adminTab);

		List<WebElement> list = driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr//td[5]"));
		System.out.println(list.size());

		int numberOfEnabled = 0;
		int numberOfDisabled = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getText().equalsIgnoreCase("enabled")) {
				numberOfEnabled++;
			} else if (list.get(i).getText().equalsIgnoreCase("disabled")) {
				numberOfDisabled++;
			}
		}
		System.out.println("numberOfEnabled is " + numberOfEnabled);
		System.out.println("numberOfDisabled is " + numberOfDisabled);
	}
}
