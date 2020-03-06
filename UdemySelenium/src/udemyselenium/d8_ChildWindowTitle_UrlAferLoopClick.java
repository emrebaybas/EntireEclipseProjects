package udemyselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d8_ChildWindowTitle_UrlAferLoopClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

	driver.get("https://facebook.com");

	String title = driver.getTitle();
	System.out.println("Title of the page is " + title);

	String currentURL = driver.getCurrentUrl();
	System.out.println("URL of the page is " + currentURL);
	

	//	 links in the bottom footer can be automated by opening in a new tab easily
	
	driver.get("https://facebook.com");
	WebElement pageFooterChildren=driver.findElement(By.id("pageFooterChildren"));
	
	System.out.println(pageFooterChildren.findElements(By.tagName("a")).size());
	
	for (int i = 0; i < pageFooterChildren.findElements(By.tagName("a")).size(); i++) {
		
		String newTabClick=Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);		
		
		pageFooterChildren.findElements(By.tagName("a")).get(i).sendKeys(newTabClick);	
	}
	
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> idIterator = windowId.iterator();
		
		String parentId=idIterator.next();

		while(idIterator.hasNext()) {
			
			driver.switchTo().window(idIterator.next());
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		}
		
		
		System.out.println("YOU ARE BACK ON THE HOME PAGE");
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());



}
}
