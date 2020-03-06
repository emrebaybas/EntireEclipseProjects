package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class e7_HiddenTextStoredAsValueAttribute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("timb");
		String TargetSearch = "timberland shoes for men";
		String value = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

		while (!(value.equalsIgnoreCase(TargetSearch))) {

			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			value = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

			if (value.equalsIgnoreCase(TargetSearch)) {
				System.out.println(value);
			}

		}
	}
}
