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
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class g1_DisableImagesSpeedUpScript {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		disableImages(options);
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.com");
		
 }
	
	//you can add this method in testUtilities class and call when you want to disable images
	//when you call you  need to pass options argument to your driver
	public static void disableImages(ChromeOptions options) {
		
		HashMap<String, Object> images=new HashMap<String, Object>();
		images.put("images", 2);
		
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		
		options.setExperimentalOption("prefs", prefs);

	}
}
