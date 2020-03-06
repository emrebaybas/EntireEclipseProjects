package udemyselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x3_ChildWindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		Iterator<String> idIterator=windowIds.iterator();
		
		String parentId=idIterator.next();
		String childId=idIterator.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		
		
		

		
	}

}
