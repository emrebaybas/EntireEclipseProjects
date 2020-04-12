package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CitiBank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.get("https://online.citi.com/US/login.do");
		
		Actions a=new Actions(driver);
		WebElement CreditCardsTab=driver.findElement(By.id("creditcards"));
		a.moveToElement(CreditCardsTab);
		Thread.sleep(1000);
		
		driver.findElement(By.id("lowInterestCards_Link")).click();
		
		List<WebElement> list=driver.findElements(By.linkText("Learn More & Apply"));
		
		System.out.println("Number of the credit cards listed is "+list.size());
		
	for (int i = 0; i <list.size(); i++) {
		list.get(i).sendKeys("Keys.LEFT_CONTROL"+Keys.ENTER);
	}
		
		
		
		

	}

}
