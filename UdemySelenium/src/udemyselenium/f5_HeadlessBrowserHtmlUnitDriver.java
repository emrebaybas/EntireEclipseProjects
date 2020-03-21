package udemyselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class f5_HeadlessBrowserHtmlUnitDriver {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	

		driver.get("https://opensource-demo.orangehrmlive.com/");
			
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println(driver.getCurrentUrl());

	}
}
