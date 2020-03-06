package udemyselenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_ {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");

		String[] itemsNeeded = { "Cucumber", "Tomato", "Onion" };

		List<WebElement> availableItems = driver.findElements(By.xpath("//h4[@class='product-name']")); // findElementssssss

		for (int i = 0; i < availableItems.size(); i++) {

			String[] name = availableItems.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List listOfItemsNeeded = Arrays.asList(itemsNeeded);

			// int j = 0;
			if (listOfItemsNeeded.contains(formattedName)) {

				// j++;
				for (int j = 0; j < itemsNeeded.length; j++) {

					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					Thread.sleep(4000); // if you do not include this time, it will select incorrect items.
				}
//				if (j == itemsNeeded.length) {
//					break;
			}
		}
	}

}
