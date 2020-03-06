package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	
		
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
