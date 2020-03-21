package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://calendar.google.com/calendar/r");
	driver.manage().window().maximize();
	
	String targetMonthAndYear="May 2020";
	String targetday="17";
	
	driver.findElement(By.id("identifierId")).sendKeys("emsfs@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("E");
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

	
	String currentMonthAndYear=driver.findElement(By.xpath("//span[contains(@class,'r4nke')]")).getText();
	
	if(currentMonthAndYear.contains(targetMonthAndYear)) {
		
	}else if(!(currentMonthAndYear.contains(targetMonthAndYear))) {
		while(!(currentMonthAndYear.contains(targetMonthAndYear))) {
			driver.findElement(By.xpath("//div[@class='U26fgb mUbCce fKz7Od rF3YF Vp20je Eh2tw']//span[@class='Ce1Y1c']")).click();
		}
	}

	List<WebElement> l=driver.findElements(By.xpath("//div[@class='yRgNBf']/div/span"));
	
	for (int i = 0; i < l.size(); i++) {
		if(l.get(i).getText().contentEquals(targetday)) {
			l.get(i).click();
			break;
		}
			
	}

	
	}

}
