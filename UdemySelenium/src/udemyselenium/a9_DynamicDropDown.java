package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a9_DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000); //this gives 2000 milliseconds to load the second drop-down to avoid load failure
		
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click(); 
		// you have to specify that you are trying to select the 2nd value='BOM' thats in the Arrival  bc 1st one is in the Departure drop-down. 
		
		//HOWEVER USING INDEX CAN BE COMPLEX, YOU MAY NOT KNOW HOW MANY SAME OPTIONS AVAILABLE ON THE PAGE
		//THATS WHY IN THE NEXT CLASS WE WILL LOCATE THEM WITH THEIR PARENT FIRST SO IT WILL SELECT FROM THE CORRECT WINDOW
	}
}
