package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");

		driver.findElement(By.name("firstname")).sendKeys("Emre");
		driver.findElement(By.name("lastname")).sendKeys("NoLastName");
		driver.findElement(By.name("reg_email__")).sendKeys("AsDas32dddaD@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AsDasD@1234");

		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByVisibleText("May");

		driver.findElement(By.id("day")).sendKeys("17");
		driver.findElement(By.id("year")).sendKeys("1989");

		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();

		// I entered the user information and clicked on sign up

	}

}
