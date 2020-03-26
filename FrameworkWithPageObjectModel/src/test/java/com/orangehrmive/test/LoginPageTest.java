package com.orangehrmive.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrmlive.page.repository.LoginPageRepo;

import resources.Base;


public class LoginPageTest extends Base {

	public static Logger log= LogManager.getLogger(LoginPageTest.class.getName());
	
	 LoginPageRepo lp;
	
	 
	@BeforeMethod
	public void initialize() throws IOException {
	
		driver=initializeWebDriver();
		driver.get(prop.getProperty("url"));
		log.info("Successfully initialize the driver and navigated to login page");
	}
	
	@Test
	public void validateTitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "12321321OrangeHRM");
		log.info("Login page title is validated" );
	}
	
//	@Test
//	public void ValidateLoginWithValidCredentials() {
//		lp=new LoginPageRepo(driver);
//		lp.getUsernameLP().sendKeys(prop.getProperty("username"));
//		lp.getPasswordLP().sendKeys(prop.getProperty("password"));
//		lp.getLoginButtonLP().click();
//		
//		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("urlDashboardPage"));
//		log.info("Successfully logged in");
//	}
//	
//	@Test
//	public void ValidateLoginDeniedWithInvalidCredentials() {
//		lp=new LoginPageRepo(driver);
//		lp.getUsernameLP().sendKeys("invalidcredentials@gmail.com");
//		lp.getPasswordLP().sendKeys("Invalidpassword123");
//		lp.getLoginButtonLP().click();
//		
//		Assert.assertEquals(lp.getInvalidCredentialsMessageLP().getText(), "Invalid credentials");
//		log.info("Login denied with invalid credentials as expected");
//	}
//	@Test
//	public void validateOrangeHrmImageIsDisplayed() {
//		lp=new LoginPageRepo(driver);
//		boolean imgDisplayed =lp.getOrangeHrmImageLP().isDisplayed();
//		Assert.assertTrue(imgDisplayed);
//		log.info("Orange HRM image is displayed as per requirements");
//	}
//	
//	@Test
//	public void validateForgotPasswordLink() {
//		lp=new LoginPageRepo(driver);
//		lp.getForgotPasswordLP().click();
//		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("urlForgotPasswordPage"));
//		log.info("Successfully navigated to forgot password page");
//	}
//	
//	@Test
//	public void validateLinkedInLogo() {
//		lp=new LoginPageRepo(driver);
//		lp.getLinkedInLP().click();
//		Set<String> list=driver.getWindowHandles();
//		Iterator<String> it=list.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		driver.switchTo().window(childWindowID);
//		String title=driver.getTitle();
//		Assert.assertTrue(title.contains("LinkedIn"));
//		log.info("Successfully navigated to LinkedIn");
//	}
//	
//	@Test
//	public void validateFacebookLogo() {
//		lp=new LoginPageRepo(driver);
//		lp.getFacebookLP().click();
//		Set<String> list=driver.getWindowHandles();
//		Iterator<String> it=list.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		driver.switchTo().window(childWindowID);
//		String title=driver.getTitle();
//		Assert.assertTrue(title.contains("Facebook"));
//		log.info("Successfully navigated to Facebook");
//	}
//	
//	@Test
//	public void validateTwitterLogo() {
//		lp=new LoginPageRepo(driver);
//		lp.getTwitterLP().click();
//		Set<String> list=driver.getWindowHandles();
//		Iterator<String> it=list.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		driver.switchTo().window(childWindowID);
//		String title=driver.getTitle();
//		Assert.assertTrue(title.contains("Twitter"));
//		log.info("Successfully navigated to Twitter");
//	}
//	
//	@Test
//	public void validateYoutubeLogo() {
//		lp=new LoginPageRepo(driver);
//		lp.getYoutubeLP().click();
//		Set<String> list=driver.getWindowHandles();
//		Iterator<String> it=list.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		driver.switchTo().window(childWindowID);
//		String currentURL=driver.getCurrentUrl();
//		Assert.assertTrue(currentURL.equals("https://www.youtube.com/user/orangehrm"));
//		log.info("Successfully navigated to Youtube");
//	}
//	
//	@Test
//	public void validateOrangeHrmFooterLink() {
//		lp=new LoginPageRepo(driver);
//		lp.getOrangeHrmFooterLinkLP().click();
//		Set<String> list=driver.getWindowHandles();
//		Iterator<String> it=list.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		driver.switchTo().window(childWindowID);
//		String currentUrl=driver.getCurrentUrl();
//		Assert.assertEquals(currentUrl, "https://www.orangehrm.com/");
//		log.info("Successfully navigated to OrangeHrm.com");
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		driver=null;
	}
	
}
