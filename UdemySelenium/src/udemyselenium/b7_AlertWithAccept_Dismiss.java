package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b7_AlertWithAccept_Dismiss {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		//here we just enter a name and click on alert button to generate the alert so we can handle and click ok
		driver.findElement(By.id("name")).sendKeys("Emre");
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());  // To print out text for the alert
		
		//driver.switchTo().alert().accept();  // if you want to say YES
		driver.switchTo().alert().dismiss(); // if you want to say NO
	
		
	}

}
