package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://html.com/input-type-file/");
		
		driver.manage().window().maximize();
		
		//Uploading a file with selenium is not possible from physical application.
		//This is how you do it. select the locator for upload/chooseFile button and sendKeys("path to the file")
		
		driver.findElement(By.id("fileupload")).sendKeys("C://Users//emrba//OneDrive//Masaüstü/Portfolio Template_New.docx");

	}

}
