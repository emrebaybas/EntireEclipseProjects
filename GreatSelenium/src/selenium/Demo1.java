package selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) {
		
//1 Set Properties
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); // Creates a ChromeDriver object called driver and it launches the chrome browser itself if you run
	
		//2-Open Web Browser
		driver.get("https://www.google.com/");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		//Verify if the title is correct
		
	
		if(driver.getTitle().equals("Google")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		
		
		driver.close(); //when there is one tab
		//driver.quit();  // when there is multiple tabs

	}
	
	
}
