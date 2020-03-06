package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b6_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		//here we just enter a name and click on alert button to generate the alert so we can handle and click ok
		driver.findElement(By.id("name")).sendKeys("Emre");
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(3000);
		
		
		//this alert is not coming from the HTML code of the web-page its coming from JavaScript
		//in order to click OK we need to switchTo()  alert() method so that we can accept() the alert.
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}

}
