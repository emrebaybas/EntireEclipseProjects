package bootcamp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();

		WebElement origin = driver.findElement(By.id("flight-origin-hp-flight"));

		origin.click();
		origin.sendKeys("miami");
		// departure.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

		WebElement destination = driver.findElement(By.id("flight-destination-hp-flight"));
		destination.sendKeys("dulles");

		WebElement departureDate = driver.findElement(By.id("flight-departing-hp-flight"));
		departureDate.sendKeys("04/08/2020");

		WebElement returningDate = driver.findElement(By.id("flight-returning-hp-flight"));
		returningDate.sendKeys("04/21/2020");

		WebElement travelers = driver
				.findElement(By.xpath("//div[@id='traveler-selector-hp-flight']/div/ul/li/button"));
		travelers.click();

		WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button"));
		search.click();

		WebElement nonStop = driver.findElement(By.id("stopFilter_stops-0"));
		nonStop.click();
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("//button[@class='btn-secondary btn-action t-select-btn']"));
		select.click();
		Thread.sleep(2000);
		
		
		WebElement selectThisFare = driver.findElement(By.xpath(
				"//div[@id='basic-economy-tray-content-1']//button[@class='btn-secondary btn-action t-select-btn']"));
		selectThisFare.click();
		Thread.sleep(2000);

		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(parentWindow);

		Thread.sleep(2000);
		WebElement selectReturn = driver
				.findElement(By.xpath("//button[@class='btn-secondary btn-action t-select-btn']"));
		selectReturn.click();
		Thread.sleep(2000);
		WebElement selectThisReturnFare = driver.findElement(By.xpath(
				"//div[@id='basic-economy-tray-content-1']//button[@class='btn-secondary btn-action t-select-btn']"));
		selectThisReturnFare.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it1 = s1.iterator();
		String parentWindow1 = it1.next();
		String childWindow1 = it1.next();

		driver.switchTo().window(childWindow1);

		WebElement continueBooking = driver.findElement(By.id("bookButton"));
		continueBooking.click();

		driver.findElement(By.id("firstname[0]")).sendKeys("John");
		driver.findElement(By.id("lastname[0]")).sendKeys("Johnson");
		driver.findElement(By.id("phone-number[0]")).sendKeys("2025533821");
		driver.findElement(By.id("gender_male[0]")).click();
		driver.findElement(By.id("date_of_birth_month0")).sendKeys("05 - May");
		driver.findElement(By.id("date_of_birth_day[0]")).sendKeys("05 ");
		driver.findElement(By.id("date_of_birth_year[0]")).sendKeys("1985 ");

		// Entered the traveler info and left there since i wont enter credit card info

	}
}
