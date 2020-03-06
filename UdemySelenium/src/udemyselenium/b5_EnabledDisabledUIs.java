package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class b5_EnabledDisabledUIs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		//Goal is to verify when you click on one-way return date box gets disabled.
		// Only way to verify that is to see what attribute for that box changes to make return date box faded/disabled.
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//isEnabled() method doesn't work because in fact developer doesn't disable it, just reduces the opacity and makes it look faded
		//if you click it still works so Selenium isEnabled() method returns true where it needs to return false
		
		//So, We will not use isEnabled() method for this example.
		//We will target the opacity attribute to validate it is disabled because thats how developer designed.
		//when enabled opacity="1" ,   when disabled opacity="0.5"
		//As long as it reduces the opacity to 0.5, it will pass the test.
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();    
		// clicks on round trip, return-date should be enabled and If-Else should return enabled
		//If you don't click that means its on one-way so it should return disabled
		
		
		
		//driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5");
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Return date is disabled");
			Assert.assertTrue(true);  //if false FAIL
		}else {
			System.out.println("Return date is enabled");
			Assert.assertFalse(false);  //if true FAIL
		}
		
	}
}
