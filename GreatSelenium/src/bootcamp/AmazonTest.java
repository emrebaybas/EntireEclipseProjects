package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bluetooth mouse"+Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Logitech M557 Bluetooth Mouse')]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		WebElement noThanks=driver.findElement(By.xpath("//button[@id='siNoCoverage-announce']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();"	, noThanks);
		
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
		
		//I went to amazon searched bluetooth mouse, select a model from logitech , added to cart and clicked on checkout
		
		

	}

}
