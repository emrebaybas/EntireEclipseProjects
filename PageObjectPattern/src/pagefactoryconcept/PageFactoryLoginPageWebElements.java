package pagefactoryconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPageWebElements {

	WebDriver driver;

	public PageFactoryLoginPageWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signInButton;
	

	public WebElement EmailId() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement SignInButton() {
		return signInButton;
	}

}
