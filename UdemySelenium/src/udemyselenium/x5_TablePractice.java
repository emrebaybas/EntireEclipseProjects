package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class x5_TablePractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int numRows=driver.findElements(By.xpath("//*[@id='product']/tbody/tr")).size();
		System.out.println(numRows);
		
		int numColumns=driver.findElements(By.xpath("//*[@id='product']/tbody/tr[2]/td")).size();
		System.out.println(numColumns);
		
		for (int i = 0; i < numColumns; i++) {
			
			System.out.println(driver.findElements(By.xpath("//*[@id='product']/tbody/tr[3]/td")).get(i).getText());
			
		}
	}

}
