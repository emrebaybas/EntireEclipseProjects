package globalvariables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	WebDriver driver;
	
	public  void Login() throws IOException {
		
		Properties p =new Properties();
		FileInputStream f=new FileInputStream("C:\\Users\\emrba\\eclipse-workspace\\TestNG_Project\\src\\globalvariables\\datadriven.properties");
		p.load(f);
		
		if(p.getProperty("browser").equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
			 driver=new ChromeDriver();
			
		}else if(p.getProperty("browser").equals("Firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//geckodriver_win32/geckodriver.exe");//fix path
			 driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//geckodriver_win32/geckodriver.exe");//fix path
			 driver=new InternetExplorerDriver();
		}
		
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}
