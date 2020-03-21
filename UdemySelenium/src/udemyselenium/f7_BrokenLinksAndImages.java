package udemyselenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class f7_BrokenLinksAndImages {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));     //add all the a tag elements
		list.addAll(driver.findElements(By.tagName("img")));						//add all img tags on the same list	
		
		int countAll=list.size();
		System.out.println("Number of  all the links and images on the page is: "+countAll);   //print the size of the list
		
		//Create a new EMPTY ArrayList to put the active links and img. if a tag has HREF attribute than it is an active link
		List<WebElement> activeOnes=new ArrayList<WebElement>();  
		
		for (int i = 0; i <list.size(); i++) {  //created a for loop with and if statement to add only the active ones to our new EMPTY list
				
				if(list.get(i).getAttribute("href")!=null) {
					activeOnes.add(list.get(i));
				}
		}
		
		int countActiveOnes=activeOnes.size();  //print the size of the active a and img tags with href
		System.out.println("Number of links and images that are active[with 'href' attribute] is: "+countActiveOnes);
		
		for (int j = 0; j <activeOnes.size() ; j++) {   //in this for loop we check all the links if they return response. Response should return OK
			
			HttpURLConnection c=	(HttpURLConnection)new URL(activeOnes.get(j).getAttribute("href")).openConnection();
			c.connect();
			String response=c.getResponseMessage();
			c.disconnect();
				if(response.equals("OK")) {
				System.out.println(activeOnes.get(j).getAttribute("href")+" -->"+response);
				}else {
					System.err.println(activeOnes.get(j).getAttribute("href")+" -->"+response);
				}
		}		
 }
}
