package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class x4_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String selectedOption=driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText().toLowerCase();
		
		System.out.println(selectedOption);
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByValue(selectedOption);
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText().contains(selectedOption));
		a.dismiss();
		
		
		
		
	}

}
