package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.orangehrmlive.page.repository.LoginPageRepo;

public class Base  {

	public static WebDriver driver;
	public static Properties prop;
	public static String childWindowId;
	
	public WebDriver initializeWebDriver() throws IOException {

		prop = new Properties();
		FileInputStream f = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//resources/data.properties");
		prop.load(f);

		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//main//java//resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src//main//java//resources/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Check your browser name");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;

	}

	public void getScreenShot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "//screenshots//" + result + "failed.png"));
			}


	
	public void Login() {
		LoginPageRepo lp=new LoginPageRepo(driver);
		lp.getUsernameLP().sendKeys(prop.getProperty("username"));
		lp.getPasswordLP().sendKeys(prop.getProperty("password"));
		lp.getLoginButtonLP().click();
	}

	//MOVED TO TESTUTILITIES CLASS
//	public void switchToChildWindow() {
//
//		Set<String> s = driver.getWindowHandles();
//		Iterator<String> it = s.iterator();
//		String parentWindowId = it.next();
//		childWindowId = it.next();
//		driver.switchTo().window(childWindowId);
//	}
}
