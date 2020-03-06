package udemyselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x2_NTV_Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ntv.com.tr/");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		
		
		//Learn how to handle the notifications
		//this is not working at the moment
		
		
		

	}

}
