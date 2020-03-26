package udemyselenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class f8_DownloadingFile {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");

			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
			 
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			WebDriver driver = new ChromeDriver(options);
					
		
			driver.get("https://www.thinkbroadband.com/download");
			 
			//We find the download links
			List<WebElement> list =driver.findElements(By.cssSelector("div.module>p>a>img"));
			 
			//Click the last one to downaload 5MB file :)
			WebElement el = list.get(list.size()-1);
			el.click();
			
			File folder = new File(System.getProperty("user.dir"));
			 
			//List the files on that folder
			File[] listOfFiles = folder.listFiles();
			boolean found = false;
			File f = null;
			     //Look for the file in the files
			     // You should write smart REGEX according to the filename
			     for (File listOfFile : listOfFiles) {
			         if (listOfFile.isFile()) {
			              String fileName = listOfFile.getName();
			               System.out.println("File " + listOfFile.getName());
			               if (fileName.matches("5MB.zip")) {
			                   f = new File(fileName);
			                   found = true;
			                }
			            }
			        }
			Assert.assertTrue(found, "Downloaded document is not found");
			f.deleteOnExit();

		
 }
}
