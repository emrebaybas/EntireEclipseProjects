package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4_HiddenTextWithJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masa�st�//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com");
		
		String targetSearch="timberland pro";
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("timb");
		Thread.sleep(1000);
		

			
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		String script="return document.getElementById(\"twotabsearchtextbox\").value;";
		String text=(String) js.executeScript(script);
		
		while(!(text.equals(targetSearch))) {
		
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			
			Thread.sleep(1200);
			String a="return document.getElementById(\"twotabsearchtextbox\").value;";
			String b=(String) js.executeScript(a);
			text=b;
			
		}
		
		System.out.println(text);
		
		
		
		
		
	
		

	}

}
