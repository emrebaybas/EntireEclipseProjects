package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Stephen Chan");
	driver.findElement(By.xpath("//input[@class='nav-input']")).click();
	
	List<WebElement> result=driver.findElements(By.xpath("//a[@class='a-link-normal']"));
	
	System.out.println(result.size());
	
	for (int i = 0; i < result.size(); i++) {
		result.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
	}
	
	}
}
