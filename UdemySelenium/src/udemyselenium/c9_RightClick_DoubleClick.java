package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class c9_RightClick_DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		WebElement signIn=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		Actions a=new Actions(driver);
		a.moveToElement(signIn).contextClick().build().perform();
		//contextClick() is used to rightClick .
	}

}
