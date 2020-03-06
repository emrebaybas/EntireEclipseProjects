package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class c8_HoldDownKeyboardKeys {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		Actions a=new Actions(driver);
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//.keyDown(Keys.anykeyhere) is used to hold down a key
	}

}
