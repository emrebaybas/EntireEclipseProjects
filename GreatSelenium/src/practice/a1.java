package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("hahahah@hhah.com");
	driver.findElement(By.id("pass")).sendKeys("1234sd");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		
	Thread.sleep(2000);
	driver.findElementByClassName("fb_logo").click();
	
//	driver.findElementByLinkText("Forgot account?").click();
//	driver.navigate().back();
	
//	driver.findElementById("u_0_m").sendKeys("sam");
//	driver.findElementById("u_0_o").sendKeys("smith");
//	driver.findElementById("u_0_r").sendKeys("2025777889");
//	driver.findElementById("u_0_w").sendKeys("afgtA12345@");
//	
//	driver.findElementById("month").sendKeys("April");
//	driver.findElementById("day").sendKeys("5");
//	driver.findElementById("year").sendKeys("1989");
//	driver.findElement(By.xpath("//input[@value='1']")).click();
//	driver.findElementById("u_0_13").click();
//	driver.navigate().back();
	
//	driver.findElementById("terms-link").click();
//	driver.get("https://www.facebook.com/");
//	driver.findElementById("privacy-link").click();
//	driver.get("https://www.facebook.com/");
//	driver.findElementById("cookie-use-link").click();
//	
//	driver.findElementByLinkText("Create a Page").click();
//	driver.navigate().back();
	
	//Xpath:                               //tagName[@Attribute='Value']
	
//	driver.findElementByXPath("//a[@title='Sign Up for Facebook']").click();
													//input[@name='firstname']
	//driver.findElementByXPath("//input[@name='firstname']").sendKeys("Anastasia");
	//driver.findElementByXPath("//input[@data-testid='royal_login_button']").click();
	//driver.findElementByXPath("//button[@name='websubmit']").click();
	
//	driver.findElementByXPath("//input[@value='1']").click();
	
	}

}
