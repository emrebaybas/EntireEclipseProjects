package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pop_Up_Message {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/tooltip/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		Actions a = new Actions(driver);
		WebElement toolTips = driver.findElement(By.xpath("//a[@title=\"That's what this widget is\"]"));
		WebElement themeRoller = driver.findElement(By.xpath("//a[@title=\"ThemeRoller: jQuery UI's theme builder application\"]"));
		WebElement ageBox = driver.findElement(By.id("age"));

		// Pop up 1
		System.out.println(toolTips.isDisplayed());
		System.out.println(toolTips.getAttribute("title"));
		// Pop up 2
		System.out.println(themeRoller.isDisplayed());
		System.out.println(themeRoller.getAttribute("title"));
		// Pop up 3
		System.out.println(ageBox.isDisplayed());
		System.out.println(ageBox.getAttribute("title"));
		System.out.println("*****************************************");
		a.moveToElement(toolTips).build().perform();

		if (toolTips.getAttribute("aria-describedby").contains("ui-id-")) {
			System.out.println("Pop up for Tooltips is present on the page");
		}
		a.moveToElement(themeRoller).build().perform();

		if (themeRoller.getAttribute("aria-describedby").contains("ui-id-")) {
			System.out.println("Pop up for ThemeRoller is present on the page");
		}
		a.moveToElement(ageBox).build().perform();

		if (ageBox.getAttribute("aria-describedby").contains("ui-id-")) {
			System.out.println("Pop up for Age-Box is present on the page");
		}

	}
}
