package com.orangehrmive.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrmlive.page.repository.DashboardPageRepo;
import com.orangehrmlive.page.repository.LoginPageRepo;

import resources.Base;
import resources.TestUtilities;


public class DashboardPageTest extends Base {
	

	public static Logger log= LogManager.getLogger(DashboardPageTest.class.getName());
	
	 LoginPageRepo lp;
	 DashboardPageRepo dp;
	 TestUtilities ut;
	 Actions a;
	 
	 @BeforeMethod
		public void initialize() throws IOException {
	
			driver=initializeWebDriver();
			driver.get(prop.getProperty("url"));
			 lp=new LoginPageRepo(driver);
			 dp= new DashboardPageRepo(driver);
			 Login();
			log.info("Successfully initialize the driver, logged in and navigated to dashboard page");
		}
	 
	 @Test(priority = 1)
	 public void verifyTitle() {
		 String title=driver.getTitle();
		 Assert.assertEquals(title, "OrangeHRM");
		 log.info("Dashboard page title is verified");
	 }
	 
	 @Test(priority = 2)
	 public void validateOrangeHrmImageDisplayed() throws InterruptedException {

		 boolean o=dp.getOrangeHrmImageDP().isDisplayed();
		 Assert.assertTrue(o);
		 log.info("Orange Hrm image link is displayed");
	 }
	 
	 @Test(priority = 3)
	 public void validateOrangeHrmImageLink() throws InterruptedException {
		 	
		 	JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",dp.getOrangeHrmImageDP());
			
			ut=new TestUtilities(driver);
			ut.switchToChildWindow();
		
			String currentURL=driver.getCurrentUrl();
			Assert.assertEquals(currentURL, prop.getProperty("urlOrangeHrmlImageLink"));
	 }
	 
	 @Test(dataProvider = "getData"  ,priority = 4)
	 public void addUserAsAnAdmin(String userRole,String employeeName,String username,String status,String password,String confirmPassword) {
		 
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",dp.getAdminTabDP());
			js.executeScript("arguments[0].click();",dp.getAdminAddUser());
		 

		 
		 Select s=new Select(dp.addUserUserRole());
		 s.selectByVisibleText(userRole);

		 dp.addUserEmployeeName().sendKeys(employeeName);
		 dp.addUserUserName().sendKeys(username);
		 
		 Select s1=new Select(dp.addUserStatus());
		 s1.selectByVisibleText(status);
		 
		 dp.addUserPassword().sendKeys(password);
		 dp.addUserConfirmPassword().sendKeys(confirmPassword);
		 
			js.executeScript("arguments[0].click();", dp.addUserSaveButton());
	 }
	 
	 @DataProvider
	 public Object[][] getData(){
		 
		 Object[][] userData=new Object[3][6];
		 
		 userData[0][0]= "ESS";
		 userData[0][1]= "Fiona Grace";
		 userData[0][2]= "emremego";
		 userData[0][3]= "Disabled";
		 userData[0][4]= "Emre1234@#";
		 userData[0][5]= "Emre1234@#";
		 
		 userData[1][0]= "ESS";
		 userData[1][1]= "Hannah Flores";
		 userData[1][2]= "fazlimego";
		 userData[1][3]= "Enabled";
		 userData[1][4]= "Fazli1234@#";
		 userData[1][5]= "Fazli1234@#";
		 
		 userData[2][0]= "ESS";
		 userData[2][1]= "Steven Edwards";
		 userData[2][2]= "erhanmego";
		 userData[2][3]= "Enabled";
		 userData[2][4]= "Erhan1234@#";
		 userData[2][5]= "Erhan234@#";
		 
		 return userData;
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
		 driver=null;
	 }
	
}   
