package practice;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ankara");
	Thread.sleep(1000);
	
	List<WebElement>list=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	
	String targetSearch="ankara weather";
	
	for (int i = 0; i < list.size(); i++) {
		
	if(list.get(i).getText().contains(targetSearch)) {
		list.get(i).click();
		break;
	}
	}
	
	


	
	}

}
