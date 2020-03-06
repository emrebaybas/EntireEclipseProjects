package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b1_AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		
			System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.expedia.com/");
			
			WebElement departure=driver.findElement(By.cssSelector("#package-origin-hp-package"));
		
			departure.click();
			departure.sendKeys("ank");
			departure.sendKeys(Keys.ARROW_DOWN);
			departure.sendKeys(Keys.ENTER);
			
			WebElement arrival=driver.findElement(By.cssSelector("#package-destination-hp-package"));
			
			arrival.click();
			arrival.sendKeys("new");
		
			for (int i = 0; i <5; i++) {
				arrival.sendKeys(Keys.ARROW_DOWN);
			}
				arrival.sendKeys(Keys.ENTER);
				
//				Look into how to handle when suggestion order changes
	}
}
