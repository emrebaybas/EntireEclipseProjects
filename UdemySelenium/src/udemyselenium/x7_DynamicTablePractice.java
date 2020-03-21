package udemyselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class x7_DynamicTablePractice {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("emrebaybas@gmail.com"	);
		driver.findElement(By.name("password")).sendKeys("Emre1234");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='ui']/div/div/a[3]")).click();

		String targetContact="guney demirci";
		List<WebElement>list =driver.findElements(By.xpath("//body//tbody//tr"));
		
		Thread.sleep(1000);
	
		
		
		for (int i = 1; i <= list.size(); i++) {
			Thread.sleep(1000);
			
			String contactName=driver.findElement(By.xpath("//div[@id='ui']/div/div/div/div/div/table/tbody/tr["+i+"]/td[2]")).getText();
			if(contactName.equals(targetContact)) {	

				WebElement element = driver.findElement(By.xpath("//div[@id='ui']/div/div/div/div/div/table/tbody/tr/td/div/input"));
				Actions a=new Actions(driver);
				a.moveToElement(element).doubleClick().build().perform();
		
			}
			
			}
		
		

		
	}

}
