package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class d2_Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//IF You want to find out how many frames on the page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		WebElement targetFrame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(targetFrame);
		
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		a.moveToElement(source).dragAndDrop(source, target).build().perform();
		
			
		//If you are done, //Switch back to page content.
			driver.switchTo().defaultContent();
			
			System.out.println(driver.getTitle());
		
			//IF YOU HAVE MORE THAN ONE FRAME, YOU CANNOT SWITCH from Frame1 to Frame2 directly
			//You need to switch back to defaultContent() first than switch  to frame2.
			
	}

}
