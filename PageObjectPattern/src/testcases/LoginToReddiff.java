package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepo.RediffLoginPageWebElements;

public class LoginToReddiff {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		RediffLoginPageWebElements r = new RediffLoginPageWebElements(driver);
		r.EmailId().sendKeys("Admin");
		r.Password().sendKeys("admin123");
		r.SignInButton().click();
		r.HomePageLink().click();

	}
}
