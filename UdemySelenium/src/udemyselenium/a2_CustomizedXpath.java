package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2_CustomizedXpath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//We created this customized tag for Log In button "//input[@data-testid='royal_login_button']"
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("emre");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();      
	//input[@id='u_0_b']   is what given by Chrome copy Xpath for the Log In button but its not reliable/ May be a changing id to use so i created my own

	System.out.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());
	
	
	}

}
