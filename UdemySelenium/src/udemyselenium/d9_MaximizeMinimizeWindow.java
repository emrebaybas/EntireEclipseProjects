package udemyselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class d9_MaximizeMinimizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		
	}

}
