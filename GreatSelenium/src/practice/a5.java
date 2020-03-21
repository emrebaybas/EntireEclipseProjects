package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("#dropdownMenuButton")).click();
	Thread.sleep(1000);
	String target="Another action";
	List<WebElement> l=driver.findElements(By.xpath("//div[@class='dropdown show']//div[@class='dropdown-menu']/a"));
	
	for (int i = 0; i < l.size(); i++) {
		
		if(l.get(i).getText().equals(target)) {
			l.get(i).click();
			System.out.println(driver.findElement(By.cssSelector("#dropdownMenuButton")).getText());
			break;
		}
		
	}
	
	
	}

}
