package udemyselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class d7_StaleElementExceptionLoopClicking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

		driver.get("https://facebook.com");

		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

		String currentURL = driver.getCurrentUrl();
		System.out.println("URL of the page is " + currentURL);

		
		
		
		//Languages part on FaceBook will not allow CONTROL BUTTON TO open in new Tab 
		//So We will click manually one by one

		
		
		
		
		

		//		Other link in the footer can be automated by openin in a new tab easily
		
		
		WebElement pageFooterChildren=driver.findElement(By.id("pageFooterChildren"));
		
		System.out.println(pageFooterChildren.findElements(By.tagName("a")).size());
		
		for (int i = 0; i < pageFooterChildren.findElements(By.tagName("a")).size(); i++) {
			
			String newTabClick=Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);		
			
			pageFooterChildren.findElements(By.tagName("a")).get(i).sendKeys(newTabClick);	
		}
		
			

	

	}
}
