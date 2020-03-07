package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPageWebElements {

	WebDriver driver;

	public RediffLoginPageWebElements(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.id("login1");
	By password = By.id("password");
	By signInButton = By.name("proceed");
	By homePageLink=By.linkText("rediff.com");

	public WebElement EmailId() {
		return driver.findElement(userName);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement SignInButton() {
		return driver.findElement(signInButton);
	}
	public WebElement HomePageLink() {
		return driver.findElement(homePageLink);
	}
}
