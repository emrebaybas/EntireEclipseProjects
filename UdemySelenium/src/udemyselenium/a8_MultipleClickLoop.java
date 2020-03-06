package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a8_MultipleClickLoop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
//		PARENT CHILD RELATIONSHIP XPATH uses / SLASH    ---     CSS uses > GREATER THAN SIGN
//		BOTH OPTIONS BELOW WORKS
		
		//driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/button")).click(); 
		
		driver.findElement(By.cssSelector("[id='traveler-selector-hp-package']>div>ul>li>button")).click();
		
		//We want to make 5 adults it starts from 2 adults so we need to click 3 times
		
		for (int i = 0; i <3; i++) {
			driver.findElement(By.cssSelector("#traveler-selector-hp-package > div > ul > li > div > div > div.traveler-selector-room-data.target-clone-field > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon > svg")).click();
		}
		
		
		driver.findElement(By.cssSelector("#traveler-selector-hp-package > div > ul > li > div > footer > div > div:nth-child(2) > button")).click();
	
		System.out.println(driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/button")).getText()); //to validate it selected 5 adults
	}
}
//