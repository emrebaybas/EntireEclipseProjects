package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginTesting {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C://Users//emrba//Drivers/IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		WebDriver driver=new InternetExplorerDriver(caps); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
	
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		

		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//
//		
//		
//		
//		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
//			System.out.println("Login Successful" );
//		}else {
//			System.out.println("Incorrect credentials");
//		}
		
//		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//driver.close();
	}

}
