package bootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions a = new Actions(driver);

		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		a.dragAndDrop(oslo, norway).build().perform();

		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement sweden = driver.findElement(By.id("box102"));
		a.dragAndDrop(stockholm, sweden).build().perform();

		WebElement washington = driver.findElement(By.id("box3"));
		WebElement usa = driver.findElement(By.id("box103"));
		a.dragAndDrop(washington, usa).build().perform();

		WebElement cophenagan = driver.findElement(By.id("box4"));
		WebElement denmark = driver.findElement(By.id("box104"));
		a.dragAndDrop(cophenagan, denmark).build().perform();

		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement sKorea = driver.findElement(By.id("box105"));
		a.dragAndDrop(seoul, sKorea).build().perform();

		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.id("box106"));
		a.dragAndDrop(rome, italy).build().perform();

		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement spain = driver.findElement(By.id("box107"));
		a.dragAndDrop(madrid, spain).build().perform();

	}
}
