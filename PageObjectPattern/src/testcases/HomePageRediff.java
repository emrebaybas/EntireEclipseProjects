package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepo.HomePageWebElements;
import objectrepo.RediffLoginPageWebElements;

public class HomePageRediff {

	@Test
	public void HomePage() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		HomePageWebElements rh = new HomePageWebElements(driver);
		
		rh.SearchBox().sendKeys("money");
		rh.SearchButton().click();

	}
}
