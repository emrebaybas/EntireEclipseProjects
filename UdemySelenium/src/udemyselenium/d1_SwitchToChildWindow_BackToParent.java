package udemyselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d1_SwitchToChildWindow_BackToParent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='EG-logo']")).click();
		//If you your link/button doesn’t open a new tab or window you are fine you don’t need to switch. 
		//Selenium will handle since your still on the same window.
		
		Set<String> windowId=driver.getWindowHandles();
		Iterator<String> idIterator=windowId.iterator();
		
		String parentId=idIterator.next();
		String childId=idIterator.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.getTitle());
		
		//When you are done on the child window you need to switch back to parent window
		
		driver.switchTo().window(parentId);
		driver.findElement(By.id("header-account-menu")).click();
		
	}

}
