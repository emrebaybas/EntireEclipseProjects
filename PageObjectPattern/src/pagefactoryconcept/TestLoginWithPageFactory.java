package pagefactoryconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginWithPageFactory{

	WebDriver driver;
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		PageFactoryLoginPageWebElements pfl=new PageFactoryLoginPageWebElements(driver);
		pfl.username.sendKeys("emre");
		pfl.password.sendKeys("asd1234");
		pfl.signInButton.click();
		
	}
}
