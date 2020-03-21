package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü/Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=V7rMkuIiGTE");
		
		WebElement ball=driver.findElement(By.xpath("//div[@id='movie_player']//div[@class='ytp-scrubber-button ytp-swatch-background-color']"));
		WebElement ball2=driver.findElement(By.xpath("//div[@aria-valuetext='2 Minutes 18 Seconds of 2 Minutes 50 Seconds']"));

		Thread.sleep(2000);
		Actions a=new Actions(driver);
	
		a.moveToElement(ball).clickAndHold().dragAndDrop(ball, ball2).build().perform();
//		WebElement leave=driver.findElement(By.xpath("//b[contains(text(),'Leave')]"));
//		WebElement configure=driver.findElement(By.xpath("//a[@id='menu_leave_Configure']"));
//		WebElement holidays=driver.findElement(By.id("menu_leave_viewHolidayList"));
//		
//		Thread.sleep(2000);
//		a.moveToElement(leave).moveToElement(configure).moveToElement(holidays).click().build().perform();
//		
	
	}				

}
