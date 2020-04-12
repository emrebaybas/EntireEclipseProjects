package selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OrangeHRMInsteadOfCigna {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).click();
//		a.moveToElement(driver.findElement(By.id("menu_admin_UserManagement")));
//		a.moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click();
	
		
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		
		WebElement orangeHrmImageLink=driver.findElement(By.xpath("//div[@id='branding']/a"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",orangeHrmImageLink);
		
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[@id='pieLabel3']")),150,150).build().perform();
		
System.out.println(driver.findElement(By.xpath("//div[@id='hover_div_graph_display_emp_distribution']")).getText());



		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		boolean x=driver.getCurrentUrl().equals(expectedURL);
		
		if(x==false) {
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("C://Users//emrba//OneDrive//Masaüstü//Drivers//ScreenShots/failedLogin.png"));
		}
	}
}
