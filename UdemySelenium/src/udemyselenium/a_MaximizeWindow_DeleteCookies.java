package udemyselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class a_MaximizeWindow_DeleteCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//To delete a specific cookie
	//	driver.manage().deleteCookieNamed("sessionkey");
		
		driver.get("https://www.amazon.com");
	}

}
