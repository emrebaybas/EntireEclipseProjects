package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5_SelectorsWithContainsSubValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		//SIGN IN LINK HTML
		//<a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin">Sign in</a>
		
		driver.findElement(By.cssSelector("a[title*='Already']")).click();
		
//		USERNAME BOX HTML
//		<input type="text" id="login1" maxlength="30" name="login" value="" style="_width: 243px;" tabindex="1">
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("emre");
		
//		PASSWORD BOX HTML
//		<input type="password" id="password" name="passwd" value="" style="_width: 243px;" tabindex="2">
		driver.findElement(By.cssSelector("#password")).sendKeys("123123");

		
//		UNCHECK THE KEEP ME SIGN IN BOX HTML
//		<input type="checkbox" checked="checked" name="remember" id="remember" value="1" tabindex="3">
		driver.findElement(By.cssSelector("#remember")).click();
		
		
//		SIGN IN BUTTON HTML    
//		<input type="submit" name="proceed" value="Sign in" title="Sign in" tabindex="4">
		driver.findElement(By.xpath("//input[contains(@value,'Sig')]")).click();
	}

}
