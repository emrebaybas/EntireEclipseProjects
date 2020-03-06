package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b4_Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
		driver.findElement(By.cssSelector("#package-departing-hp-package")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@data-year='2020'])[1]")).click();
		
//		this is just a locator i could come up with (//button[@data-year='2020'])[1] to select the current/first enabled date
		//but if year becomes 2021 i have to change this locator to 2021 so its not reliable enough
	}

}


