package com.orangehrmlive.page.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class LoginPageRepo extends Base {

	public WebDriver driver;
	
	public LoginPageRepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
		@FindBy(id="txtUsername")
		WebElement username;
	
		public WebElement getUsernameLP() {
			return username;
		}
		
		@FindBy(id="txtPassword")
			WebElement password;
		
			public WebElement getPasswordLP() {
				return password;
			}
		
			@FindBy(id="btnLogin")
			WebElement loginButton;
		
			public WebElement getLoginButtonLP() {
				return loginButton;
			}
			

			@FindBy(xpath="//span[@id='spanMessage']")
			WebElement invalidCredentialsMessage;
		
			public WebElement getInvalidCredentialsMessageLP() {
				return invalidCredentialsMessage;
			}
			
			
			@FindBy(linkText="Forgot your password?")
			WebElement forgotPassword;
		
			public WebElement getForgotPasswordLP() {
				return forgotPassword;
			}
		
			
			@FindBy(linkText="OrangeHRM, Inc")
			WebElement orangeHrmFooterLink;
		
			public WebElement getOrangeHrmFooterLinkLP() {
				return orangeHrmFooterLink;
			}
			
			@FindBy(xpath="//div[@id='social-icons']//a[1]")
			WebElement linkedIn;
		
			public WebElement getLinkedInLP() {
				return linkedIn;
			}
			
			@FindBy(xpath="//div[@id='social-icons']//a[2]")
			WebElement facebook;
		
			public WebElement getFacebookLP() {
				return facebook;
			}
			
			@FindBy(xpath="//div[@id='social-icons']//a[3]")
			WebElement twitter;
		
			public WebElement getTwitterLP() {
				return twitter;
			}
			
			@FindBy(xpath="//div[@id='social-icons']//a[4]")
			WebElement youtube;
		
			public WebElement getYoutubeLP() {
				return youtube;
			}
			
			@FindBy(xpath="//div[@id='divLogo']//img")
			WebElement orangeHrmImage;
		
			public WebElement getOrangeHrmImageLP() {
				return orangeHrmImage;
			}
			
	
			
			
}