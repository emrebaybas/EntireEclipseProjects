package selenium;



	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScreenSShot {

		public static void main(String[] args) throws IOException {

			System.setProperty("webdriver.chrome.driver",
					"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.amazon.com");
			
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss,new File("C://Users//emrba//OneDrive//Masaüstü//Drivers//ScreenShots//s1.png"));
			
		}

	}
