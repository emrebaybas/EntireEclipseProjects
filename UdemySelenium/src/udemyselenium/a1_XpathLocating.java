package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1_XpathLocating {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//Xpath for username from Chrome                    //*[@id=\"username\"]  
		
		//As you can see here Chrome  used forward slashes with double-quotations for JAVA to understand these are quotations of the Xpath.
		//Some browsers may give you Xpath with out forward slash and that would confuse JAVA to understand where the String starts-ends
		// So if other browsers do not provide forward slash either you add to it, or easier just change double quotations to single quotation
		
		//LETS SAY THIS IS XPATH FROM FIREFOX  //*[@id="username"]   This is not reliable change it to //*[@id='username']
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("emre@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		

	
		
	}

}
