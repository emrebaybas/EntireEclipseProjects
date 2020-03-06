package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b8_AddToCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		
		
		//Goal is to add cucumber to cart. // you may think its easier to just provide the parent/child Css path 
		driver.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div:nth-child(3) > div.product-action > button")).click();
		
		//However, cucumber may not always be in that path/location, if other item added and cucumber moved down the list.
		//For that reason, We need to provide a UNIQUE CSS/XPATH that focuses on the Text Cucumber, then go find the add to cart button in that
		
		
		
		
		
		
		
		
	}

}
