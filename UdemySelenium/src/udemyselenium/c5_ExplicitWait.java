package udemyselenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class c5_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// By creating this implicit wait we handles all our wait times globally without using thread.sleep
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//you will realize that this code sometimes will fail because line 38 may take more than 5 seconds to for text to be visible.
		//in the next class we will use explicit wait and handle that .

		String[] itemsNeeded = { "Cucumber", "Tomato", "Onion" };

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");

		addItems(driver, itemsNeeded);

		// If you did not declare addItems method as STATIC it would not work without
		// creating object for this class
		// c3_AddToCartWithMethod a=new c3_AddToCartWithMethod();
		// a.addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.cssSelector("div.action-block>button")).click();

		driver.findElement(By.cssSelector("input.promoCode[placeholder='Enter promo code']"))
				.sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		//EXPLICIT WAIT FOR A SPECIFIC TARGET
		WebDriverWait w=new WebDriverWait(driver,8);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());

		driver.findElement(By.cssSelector("[id='root']>div>div>div>div>button")).click();
		driver.findElement(By.cssSelector("[id='root']>div>div>div>div>div>select")).click();

		driver.findElement(By.cssSelector("[id='root']>div>div>div>div>div>select>option[value='United States']"))
				.click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> availableItems = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < availableItems.size(); i++) { // created a for loop to run through 30 times for every item

			String[] name = availableItems.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List listOfItemsNeeded = Arrays.asList(itemsNeeded);

						for (int j = 0; j < itemsNeeded.length; j++) {
			
							if (listOfItemsNeeded.contains(formattedName)) {
								driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
								continue;
			
							} else {
							
								break;
							}

			}
		}
	}
}
