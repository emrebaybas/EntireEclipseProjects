package udemyselenium;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class f6_JavaScriptExecuterMethods {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
//		Select s=new Select(driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
//
//		s.selectByValue("b");
//		
//		WebElement flightClass=driver.findElement(By.id("package-advanced-preferred-class-hp-package"));
//		
//
//			
//			drawBorder(flightClass,driver);
//		
//			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src, new File("C://Users//emrba//OneDrive//Masaüstü//Drivers//ScreenShots/failedDrawBorder.png"));
//
//			generateAlert(driver,"There is an issue where border is red");
//			driver.switchTo().alert().accept();

//			driver.get("https://www.expedia.com/");
//		
//			WebElement deals=driver.findElement(By.id("primary-header-deals"));
//			
//			//clickElement(deals,driver);
			JavascriptExecutor js=((JavascriptExecutor)driver);
//			js.executeScript("arguments[0].click();", deals);
//			
//			js.executeScript("history.go(0)");
//			
//			refreshBrowser(driver);
//			
//			getTitleByJS(driver);
//			
//			
//			String title=js.executeScript("return document.title;").toString();
//			System.out.println(title);
			
			//System.out.println(getInnerTextByJS(driver));
//		
//			getInnerTextByJS(driver);
//			
//			scrollDown(driver);
			
			WebElement paris=driver.findElement(By.id("region_0_link_2"));
		//	js.executeScript("arguments[0].scrollIntoView(true);", paris);
			
			scrollDownToElement(paris,driver);
			
	}
	
	public static void scrollDownToElement( WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollDown( WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void getInnerTextByJS( WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String innerText=js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(innerText);
	}	
	
	public static String getTitleByJS( WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void refreshBrowser( WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	
	public static void clickElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert(' "+message+" ')");
	}
	

		public static void drawBorder(WebElement element, WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid  red'", element);
		}
		
	
}
