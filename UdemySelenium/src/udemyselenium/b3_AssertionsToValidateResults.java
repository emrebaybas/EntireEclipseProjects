package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class b3_AssertionsToValidateResults {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//So in the Println statement above, we wanted to confirm the size of the for our selector is 6 and printed out to confirm.
		//however, we can use assertions do validate for us its 6, and if for some reason not 6 fail the test for us.
		//Assert.assertEquals(actual, expected);
		
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		
		/*------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //PRINT FALSE IF NOT SELECTED
		//Here I am printing out to make sure checkbox is not selected by default and isSelected() method returns false  so i can select it myself
		//however, I can user Assertions to make sure is its not selected.
		//Assert.assertFalse(condition);
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); // THEN CLICK
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //CHECK and PRINT IF SELECTED NOW

		//make sure checkbox isSelected returns true because i clicked it. it not returns true fail the test
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.close();
		
	}
}
