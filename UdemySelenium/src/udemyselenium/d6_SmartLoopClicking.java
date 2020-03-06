package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d6_SmartLoopClicking {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerLeft = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		for (int i = 1; i < footerLeft.findElements(By.tagName("a")).size(); i++) {
			
			//To avoid StaleElementException we open them in new Tab by ctrl=enter on the link
			//store ctrl+enter in a string and pass it into a sendKeys() method.
			String newTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			footerLeft.findElements(By.tagName("a")).get(i).sendKeys(newTab);
			
		}
	}
}
