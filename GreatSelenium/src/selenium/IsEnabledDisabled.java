package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IsEnabledDisabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("http://opensource-demo.orangehrmlive.com//");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();

		int rows = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
		System.out.println(rows);

		
		int countEnabled = 0;
		int countDisabled = 0;
		for (int i = 0; i < rows; i++) {
			String status = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]")).get(i).getText();
		
			if (status.equals("Enabled")) {
				countEnabled++;
			} else if (status.equals("Disabled")) {
				countDisabled++;
			}
		}
		System.out.println(countEnabled);
		System.out.println(countDisabled);

	}

}
