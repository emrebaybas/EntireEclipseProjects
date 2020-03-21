package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//
//		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		Thread.sleep(1000);
//		Alert a=driver.switchTo().alert();
//		System.out.println(a.getText());
//		a.accept();
//	
//		driver.findElement(By.id("login1")).sendKeys("emre");
		
		driver.get("https://freecrm.com/");
		//driver.switchTo().alert().dismiss();
	
	
	
		WebElement frame=driver.findElement(By.xpath("//div[@class='video-block']//iframe"));
		
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
		Thread.sleep(8000);
		
		//driver.switchTo().defaultContent();
		

		Set<String> s= driver.getWindowHandles();
		Iterator<String>it=s.iterator();
		String parentId= it.next();
		
		driver.switchTo().window(parentId);
		
	
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		}
}
