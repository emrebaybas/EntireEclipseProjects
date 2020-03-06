package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

		driver.get("https://facebook.com");

		// driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

		String currentURL = driver.getCurrentUrl();
		System.out.println("URL of the page is " + currentURL);

		driver.findElement(By.cssSelector("#email")).sendKeys("Emre");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[id*='u_0']")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@title='Go to Facebook Home']/i")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Emre");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Baybas");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2026783322");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcd1234");

		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByValue("5");

		Select sl = new Select(driver.findElement(By.id("day")));
		sl.selectByValue("17");
		Select slc = new Select(driver.findElement(By.id("year")));
		slc.selectByValue("1989");
		driver.findElement(By.xpath("//input[@value='2']")).click();

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		System.out.println(driver.findElement(By.id("reg_error_inner")).getText());
		
		driver.findElement(By.linkText("Create a Page")).click();
		driver.navigate().back();
		
		
		
		driver.findElement(By.id("terms-link")).click();

		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> idIterator = windowId.iterator();

		String parentId = idIterator.next();

		driver.switchTo().window(parentId);

		driver.findElement(By.id("privacy-link")).click();

		driver.switchTo().window(parentId);

		driver.findElement(By.id("cookie-use-link")).click();

		driver.switchTo().window(parentId);
		
		
		driver.findElement(By.xpath("//a[@title='Spanish']")).click();
		
		
		driver.findElement(By.xpath("//a[@title='French (France)']")).click();
		
		
		driver.findElement(By.xpath("//a[@title='Simplified Chinese (China)']")).click();
	
	
		driver.findElement(By.xpath("//a[@title='Arabic']")).click();
		
		
		driver.findElement(By.xpath("//a[@title='Portuguese (Brazil)']")).click();

		
		driver.findElement(By.xpath("//a[@title='Italian']")).click();
	
		
		driver.findElement(By.xpath("//a[@title='Korean']")).click();
	
		
		driver.findElement(By.xpath("//a[@title='German']")).click();
		
		
		driver.findElement(By.xpath("//a[@title='Hindi']")).click();
		
		
		driver.findElement(By.xpath("//a[@title='Japanese']")).click();
		
		driver.findElement(By.xpath("//a[@title='English (US)']")).click();
		


		WebElement pageFooterChildren=driver.findElement(By.id("pageFooterChildren"));
		
		System.out.println(pageFooterChildren.findElements(By.tagName("a")).size());
		
		for (int i = 0; i < pageFooterChildren.findElements(By.tagName("a")).size(); i++) {
			
			String newTabClick=Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);		
			
			pageFooterChildren.findElements(By.tagName("a")).get(i).sendKeys(newTabClick);	
		}
		
		// driver.quit();

	}
}
