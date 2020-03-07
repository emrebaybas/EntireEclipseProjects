package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageWebElements {

	WebDriver driver;

	public HomePageWebElements(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.id("srchword");
	By searchButton=By.xpath("//input[@class='newsrchbtn']");

	public WebElement SearchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement SearchButton() {
		return driver.findElement(searchButton);
	}

}
