package com.orangehrmlive.page.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class DashboardPageRepo extends Base {

	public WebDriver driver;
	
	public DashboardPageRepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
		@FindBy(xpath="//div[@id='branding']//a")
		WebElement orangeHrmImage;
	
		public WebElement getOrangeHrmImageDP() {
			return orangeHrmImage;
		}
		
		@FindBy(xpath="//div[@id='branding']/a")
		WebElement orangeHrmImageLink;
	
		public WebElement getOrangeHrmImageLinkDP() {
			return orangeHrmImageLink;
		}
		
		
		
		@FindBy(id="MP_link")
			WebElement marketPlaceButton;
		
			public WebElement getMarketPlaceDP() {
				return marketPlaceButton;
			}
		
			@FindBy(id="welcome")
			WebElement welcomeAdminDropdown;
		
			public WebElement getWelcomeAdminDropdownDP() {
				return welcomeAdminDropdown;
			}
			

			@FindBy(xpath="//a[@id='aboutDisplayLink']")
			WebElement welcomeAdminOptionAbout;
		
			public WebElement getwelcomeAdminOptionAboutDP() {
				return welcomeAdminOptionAbout;
			}
			
			
			@FindBy(linkText="Logout")
			WebElement welcomeAdminOptionLogout;
		
			public WebElement getWelcomeAdminOptionLogoutDP() {
				return welcomeAdminOptionLogout;
			}
		
			
			@FindBy(id="menu_admin_viewAdminModule")
			WebElement adminTab;
		
			public WebElement getAdminTabDP() {
				return adminTab;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
			WebElement adminSubTabOptionUserManagement;
		
			public WebElement getAdminSubTabOptionUserManagementDP() {
				return adminSubTabOptionUserManagement;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
			WebElement adminSubTabOptionUsers;
		
			public WebElement getAdminSubTabOptionUsersDP() {
				return adminSubTabOptionUsers;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_Job']")
			WebElement adminSubTabOptionJob;
		
			public WebElement getAdminSubTabOptionJobDP() {
				return adminSubTabOptionJob;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
			WebElement adminSubTabOptionJobTitles;
		
			public WebElement getAdminSubTabOptionJobTitlesDP() {
				return adminSubTabOptionJobTitles;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_viewPayGrades']")
			WebElement adminSubTabOptionPayGrades;
		
			public WebElement getAdminSubTabOptionPayGradesDP() {
				return adminSubTabOptionPayGrades;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_employmentStatus']")
			WebElement adminSubTabOptionEmploymentStatus;
		
			public WebElement getAdminSubTabOptionEmploymentStatusDP() {
				return adminSubTabOptionEmploymentStatus;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_jobCategory']")
			WebElement adminSubTabOptionJobCategories;
		
			public WebElement getAdminSubTabOptionJobCategoriesDP() {
				return adminSubTabOptionJobCategories;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_workShift']")
			WebElement adminSubTabOptionWorkShift;
		
			public WebElement getAdminSubTabOptionWorkShiftDP() {
				return adminSubTabOptionWorkShift;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_Organization']")
			WebElement adminTabOptionOrganization;
		
			public WebElement getAdminTabOptionOrganizationDP() {
				return adminTabOptionOrganization;
			}
			
			@FindBy(xpath="//a[@id='menu_admin_viewOrganizationGeneralInformation']")
			WebElement adminSubTabOptionGeneralInformation;
		
			public WebElement getAdminSubTabOptionGeneralInformationDP() {
				return adminSubTabOptionGeneralInformation;
			}
			
			
			@FindBy(xpath="//a[@id='menu_admin_viewLocations']")
			WebElement adminSubTabOptionLocations;
		
			public WebElement getAdminSubTabOptionLocationsDP() {
				return adminSubTabOptionLocations;
			}
			
			
			
			@FindBy(xpath="//a[@id='menu_admin_viewCompanyStructure']")
			WebElement adminSubTabOptionStructure;
		
			public WebElement getAdminSubTabOptionStructureDP() {
				return adminSubTabOptionStructure;
			}
			
			
			@FindBy(xpath="//input[@id='btnAdd']")
			WebElement adduserbutton;
			
			public WebElement getAdminAddUser() {
				return adduserbutton;
			}
			
			@FindBy(id="systemUser_userType")
			WebElement userRole;
			
			public WebElement addUserUserRole() {
				return userRole;
			}
			
			@FindBy(id="systemUser_employeeName_empName")
			WebElement employeeName;
			
			public WebElement addUserEmployeeName() {
				return employeeName;
			}
			
			@FindBy(id="systemUser_userName")
			WebElement userName;
			
			public WebElement addUserUserName() {
				return userName;
			}
			
			@FindBy(id="systemUser_status")
			WebElement status;
			
			public WebElement addUserStatus() {
				return status;
			}
						
			@FindBy(id="systemUser_password")
			WebElement password;
			
			public WebElement addUserPassword() {
				return password;
			}
			
			@FindBy(id="systemUser_confirmPassword")
			WebElement confirmPassword;
			
			public WebElement addUserConfirmPassword() {
				return confirmPassword;
			}
			
			@FindBy(id="btnSave")
			WebElement saveButton;
			
			public WebElement addUserSaveButton() {
				return saveButton;
			}
			
			
			
			
			
}