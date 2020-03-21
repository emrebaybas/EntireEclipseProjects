package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
	
	String targetCheckbox="Angular";
	List<WebElement> list=driver.findElements(By.xpath("//label[@class='checkbox']/input"));
	
//	for (int i = 0; i < list.size(); i++) {
//		
//		if(list.get(i).getText().equals(targetCheckbox)){
//			list.get(i).click();
//			break;
//		}
//		
//	}

	
	for (int i = 0; i < list.size(); i++) {
		
		Thread.sleep(1000);
		if(list.get(i).isSelected()==false) {
			list.get(i).click();
		}
			
	}
	
	}

}
