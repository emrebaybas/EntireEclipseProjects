package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginHRM {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("invalidUsername");
		driver.findElement(By.id("txtPassword")).sendKeys("invalidPasword");
		driver.findElement(By.id("btnLogin")).click();
		

		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		boolean x=driver.getCurrentUrl().equals(expectedURL);
		
		if(x==false) {
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("C://Users//emrba//OneDrive//Masaüstü//Drivers//ScreenShots/failedLogin.png"));
		}
	}
}
