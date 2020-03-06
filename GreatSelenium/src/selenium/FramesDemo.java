package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		WebElement topLeftFrame=driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		
							driver.switchTo().frame(topLeftFrame);
		
		List<WebElement> topLeftFrameLinkList=driver.findElements(By.tagName("a"));
		
		System.out.println(topLeftFrameLinkList.size());
		
							driver.switchTo().defaultContent();
		
		WebElement bottomLeftFrame=driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		
							driver.switchTo().frame(bottomLeftFrame);
		
		List<WebElement> bottomLeftFrameLinkList=driver.findElements(By.tagName("a"));
		
		System.out.println(bottomLeftFrameLinkList.size());
		
							driver.switchTo().defaultContent();
		
		WebElement mainFrame=driver.findElement(By.xpath("//frame[@name='classFrame']"));
		
							driver.switchTo().frame(mainFrame);
							
							driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
						
//		List<WebElement> mainFrameLinkList=driver.findElements(By.tagName("a"));
//		
//		System.out.println(mainFrameLinkList.size());
		
	}
}
