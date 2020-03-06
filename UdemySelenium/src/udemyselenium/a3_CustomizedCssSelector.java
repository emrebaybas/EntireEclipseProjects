package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3_CustomizedCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//CUSTOMIZED CSS Selectors
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("emre");            // we could use "input#email" as CSS Selector
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[data-testid='royal_login_button']")).click();      
//		#u_0_2      is what given by Chrome copy Selector for the Log In button but its not reliable/ May be a changing id to use so i created my own

		

	}

}
