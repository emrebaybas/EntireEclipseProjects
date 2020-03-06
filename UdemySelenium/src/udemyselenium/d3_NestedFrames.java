package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d3_NestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[34]/a")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		//On the page there are 2 frames top and bottom first switch to top then inside top there is 3 left-right-middle
		//I will  switch to middle
		WebElement topFrame=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(topFrame);
		
		WebElement middleFrame=driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(middleFrame);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		
		
		
	}

}
