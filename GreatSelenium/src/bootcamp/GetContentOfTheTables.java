package bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetContentOfTheTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumeasy.com/test/table-pagination-demo.html");

		// first page
		for (int a = 1; a <= 5; a++) {
			List<WebElement> row = driver.findElements(By.xpath("//tr[" + a + "]//td"));
			for (int i = 0; i < row.size(); i++) {
				System.out.println(row.get(i).getText());
			}
		}
		
		WebElement page2 = driver.findElement(By.linkText("2"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", page2);

		for (int b = 6; b <= 10; b++) {
			List<WebElement> row1 = driver.findElements(By.xpath("//tr[" + b + "]//td"));
			for (int j = 0; j < row1.size(); j++) {
				System.out.println(row1.get(j).getText());
			}
		}

		WebElement page3 = driver.findElement(By.linkText("3"));
		js.executeScript("arguments[0].click();", page3);

		for (int c = 11; c <= 13; c++) {
			List<WebElement> row2 = driver.findElements(By.xpath("//tr[" + c + "]//td"));
			for (int k = 0; k < row2.size(); k++) {
				System.out.println(row2.get(k).getText());
			}
		}
	}
}
