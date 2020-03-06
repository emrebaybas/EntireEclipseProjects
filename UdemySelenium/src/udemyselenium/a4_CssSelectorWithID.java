package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4_CssSelectorWithID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("emre@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
	
		driver.findElement(By.cssSelector("#Login")).click();
		
		driver.close();
	}

}
