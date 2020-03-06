package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b0_DynamicDropDownWithSpecifiedParent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //*[@value='AMD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='BOM']")).click();
		
//		FIND THE PARENT XPATH FOR THE ARRIVAL or DEPARTURE WINDOW  THEN ONE SPACE THEN TARGET XPATH
	}

}
