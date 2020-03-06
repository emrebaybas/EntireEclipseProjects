package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6_LocaterParentChildSibling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nesine.com/");
		
	//They both do the same thing.
		// First one is absolute Xpath parent child relationship
		// Second one uses Sibling relationship
		
		System.out.println(driver.findElement(By.xpath("//*[@id='hpw-editor-coupons']/div/div/div/div/div[3]/div/span")).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='hpw-editor-coupons']/div/div/div/div/div[1] /following-sibling::div[2]/div/span")).getText());
		
		
		//*[@id='hpw-editor-coupons']/div/div/div/div/div[3]/div/span/parent::div               to go back to parent add /parent::parent tagName
	}

}
