package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsTourNumberOfLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}

}



