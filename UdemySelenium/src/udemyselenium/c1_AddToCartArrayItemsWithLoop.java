package udemyselenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_AddToCartArrayItemsWithLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = { "Cucumber", "Tomato", "Onion" };   //created an array of items we need

		List<WebElement> availableItems = driver.findElements(By.xpath("//h4[@class='product-name']")); 
										//created a string element called  availableItems
										// Used findElementS method with a common xpath for all the add to cart buttons which is 30 buttons/list items

		for (int i = 0; i < availableItems.size(); i++) {   //created a for loop to run through 30 times for every item

			String[] name = availableItems.get(i).getText().split("-");    
										//created another string array to get the text from items 
										//Since item names comes in a format Cucumber - 1 kg it may be confusing. 
										//So we used split method and specified the split character as "-"
										//Split method creates a string array for every item. for example name[0]="Cucumber "   and name[1]=" 1 kg"
										//So we just need the name[0] items and we need to get rid of the space character after the split. So, we used split method
										//We store these information in formattedName variable.
										//Since its in the loop formatted name variable will be updated each time thru the loop
			String formattedName = name[0].trim();
			
										//Items needed is an Array so we convert it to a ArrayList to be able to use contains method with it.
										//We can't use contains method on arrays thats why we converted to an ArrayList.
			List listOfItemsNeeded = Arrays.asList(itemsNeeded);

										//if don't declare a brake statement , loop will go 30 times and its waste of time. so we declared j=0 
										//since we have 3 items in the list, we will increment j each time in the loop and 
										//when it 3 we will use break statement to stop the loop
			int j = 0;
			
										//here in this if statement we will compare if our arrayList contains our formatted names which are the items we need 
										//and if it does it will click on add to cart.
			if (listOfItemsNeeded.contains(formattedName)) {

				j++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
											//this is an example of how you can fail if you depend on text. in this site 
											//As you can see first time it clicks ADD TO CART text becomes ADDED for a second and 
											//in the same second Selenium tries to select the second item 
											//but since text index for ADD TO CART is different now it selects incorrect items.
						
				//Thread.sleep(5000); 
											// So You need to include this sleep time for text to come back to normal(ADD TO CART)
						
											//Instead we can find a locator without depending on text.
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}

	}
}