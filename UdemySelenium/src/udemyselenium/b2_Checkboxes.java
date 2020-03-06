package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b2_Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //CHECK IF SELECTED
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); // THEN CLICK
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //CHECK IF SELECTED AGAIN/VERIFY
		
		driver.close();
	}

}
