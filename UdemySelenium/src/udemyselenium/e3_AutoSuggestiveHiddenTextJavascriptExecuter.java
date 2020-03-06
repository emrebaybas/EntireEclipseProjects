package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class e3_AutoSuggestiveHiddenTextJavascriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("timb");//enter timb in the search box
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);//press arrow down twice
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //create JavascriptExecuter and import the package for it
		
		//first get the script(hidden text) from the searchbox with return command
		//documnet.getElementBy is to locate element 
		//.value; is just like getText()
		String script="return document.getElementById(\"twotabsearchtextbox\").value;";
		
		//Once you get the script ExecuteScript and store in a string
		String text=(String) js.executeScript(script);
		
		System.out.println(text);
		

	}

}
