package resources;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestUtilities extends Base {
	
	public TestUtilities(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void switchToChildWindow() {
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parentWindowId = it.next();
		childWindowId = it.next();
		driver.switchTo().window(childWindowId);
	}
	
	
}
