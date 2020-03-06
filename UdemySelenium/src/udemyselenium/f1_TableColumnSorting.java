package udemyselenium;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class f1_TableColumnSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//GOAL IS TO VERIFY ITEMS ON THE LIST ARE SORTED.
		
		//First created --> List of WebElement for all the item locations
		List<WebElement> items=driver.findElementsByCssSelector("[id='sortableTable'] td:nth-child(2)");
		
		//Then created an empty ArrayList<String> to store our ListItems
		ArrayList<String> listItems=new ArrayList<String>();
		
		//Went thru a for loop and added all the items to the list
		for (int i = 0; i < items.size(); i++) {
		
			listItems.add(items.get(i).getText());
		}
		//Enhanced loop to print ArrayList item
		for (String s : listItems) {
			System.out.println(s);
		}
		//Now We Created Another ArrayList then enter the first ArrayList values to second ArrayList
		//Then We Sorted out to Compare before and after sort if they are the same. 
		//if they are item on the webPage are already sorted test passes
		//If different test fails
		
		ArrayList<String> itemsToPutInOrder=new ArrayList<String>();
		for (int i = 0; i < items.size(); i++) {
			
			itemsToPutInOrder.add(items.get(i).getText());
		}
		
		Collections.sort(itemsToPutInOrder);     
		Collections.reverse(itemsToPutInOrder);
		System.out.println("***************************");
		
		for (String st : itemsToPutInOrder) {
			System.out.println(st);
		}
		
		Assert.assertTrue(listItems.equals(itemsToPutInOrder)); 
		// this line will fail the test but thats the goal. we are trying to verify that list is in order so we created our list as it stands on the website
		//then created another list with same items then sorted than compared in asssert. since they are different its not sorted in the first place.
	}

}
