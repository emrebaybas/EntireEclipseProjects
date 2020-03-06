package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Page_Testing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
       driver.findElement(By.partialLinkText("Forgot")).click();
      // driver.navigate().back(); // when you wanna come back to the previous page
       driver.findElement(By.cssSelector("#identify_email")).sendKeys("2024563315");
		driver.findElement(By.xpath("//input[@name='did_submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[2]/div[1]/div[1]")).getText());
	}
}
