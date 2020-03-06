package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class e5_AutoSuggestiveSearchResultLocating {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com");

		String targetSearch = "timberland pro";

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("timb");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"twotabsearchtextbox\").value;";
		String text = (String) js.executeScript(script);

		while (!(text.equals(targetSearch))) {

			for (int i = 0; i < 20; i++) {

				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);

				Thread.sleep(1200);
	
				text = (String) js.executeScript(script);
			
				if (text.equals(targetSearch)) {
					System.out.println("target search is listed in the row number " + (i + 1));
					break;
				}
			}
		}

		System.out.println(text);

	}
}
