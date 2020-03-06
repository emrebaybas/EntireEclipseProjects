package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class c7_MouseOver {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		WebElement signIn=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		Actions a=new Actions(driver);
		//Thread.sleep(2000);
		a.moveToElement(signIn).build().perform();
		
		
		WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
		
		a.moveToElement(searchDropDown).doubleClick().build().perform();
		
	
		
	}

}
