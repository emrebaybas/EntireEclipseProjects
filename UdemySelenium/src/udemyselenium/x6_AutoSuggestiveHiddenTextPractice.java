package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class x6_AutoSuggestiveHiddenTextPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String targetSearch = "United States (USA)";
		driver.findElement(By.id("autocomplete")).sendKeys("un");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = ("return document.getElementById(\"autocomplete\").value; ");
		String text = (String) js.executeScript(script);
		int i = 0;
		while (!(targetSearch.equalsIgnoreCase(text))) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			i++;
			text = (String) js.executeScript(script);
			if (targetSearch.equalsIgnoreCase(text)) {
				System.out.println("United States is search result number " + (i-1));
				//i-1 because it starts from 0 also it includes your first entry "un" as another text.
			}
		}System.out.println(text);
		

	}
}
