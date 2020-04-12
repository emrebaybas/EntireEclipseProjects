package udemyselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a7_StaticDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
		Select s=new Select(driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")));
	
		s.selectByIndex(1);
		s.selectByValue("b");
		s.selectByVisibleText("Business");

//		<select id="package-advanced-preferred-class-hp-package" class="gcw-storeable gcw-show-with-value" autocomplete="off" data-gcw-storeable-name="gcw-cabin-class">
//        <option value="f">First class</option>
//        <option value="b">Business</option>
//        <option value="p">Premium economy</option>
//        <option value="" selected="selected">Economy/Coach</option>
//    </select>
		
		
		
//		If the drop-down has multiple selected items you can use deselect method to deselect the option.
	}

}
