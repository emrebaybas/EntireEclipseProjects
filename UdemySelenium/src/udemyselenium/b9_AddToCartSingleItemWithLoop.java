package udemyselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b9_AddToCartSingleItemWithLoop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> availableItems = driver.findElements(By.xpath("//h4[@class='product-name']")); // findElementssssss

		for (int i = 0; i < availableItems.size(); i++) {

			String name = availableItems.get(i).getText();

			if (name.contains("Cucumber")) {

				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			// If we want to add multiple items, we need to create an array and an arraylist
			// showing in the next class

		}

	}
}
