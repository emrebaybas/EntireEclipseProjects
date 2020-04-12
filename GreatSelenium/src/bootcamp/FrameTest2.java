package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		WebElement outerFrame=driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame=driver.findElement(By.xpath("//iframe[contains(text(),'<p>Your browser does not support iframes.<')]"));
		driver.switchTo().frame(innerFrame);	
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Emre");
		
	}
}
