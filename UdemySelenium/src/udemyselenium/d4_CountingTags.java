package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d4_CountingTags {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Counting all the a tags(links) on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
				//LIMIT THE DRIVER TO FOOTER
		
		//Counting all the a tags(links) on the FOOTER of the page
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
	}

}
