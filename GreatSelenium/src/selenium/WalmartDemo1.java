package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); // Creates a ChromeDriver object called driver and it launches the chrome browser itself if you run
	
		driver.get("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getTitle().equals("Walmart.com | Save Money. Live Better.")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		driver.close();
	}

}
