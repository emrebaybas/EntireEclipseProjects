package udemyselenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f2_TableColumn_ListDescendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
		List<WebElement> items=driver.findElementsByCssSelector("[id='sortableTable'] td:nth-child(2)");
		

		ArrayList<String> listItems=new ArrayList<String>();
		
		for (int i = 0; i < items.size(); i++) {
		
			listItems.add(items.get(i).getText());
		}
		System.out.println("*********LIST AS IS*********");
		for (String s : listItems) {
			System.out.println(s);
		}
		
		Collections.sort(listItems);   //Puts in Ascending order
		
		System.out.println("*********LIST ASCENDING*********");
		
		for (String st : listItems) {
			System.out.println(st);
		}
		
		Collections.reverse(listItems);  //Puts in descending order
		
		System.out.println("**********LIST DESCENDING********");
		
		for (String str : listItems) {
			System.out.println(str);
		}
		
	}
}
