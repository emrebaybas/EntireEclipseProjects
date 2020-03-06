package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class e1_Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

		driver.get("https://expedia.com");

		String targetMonth = "may";
		String targetDay = "May\n17"; // this is how expedia returns for getText method

		driver.findElement(By.id("package-departing-hp-package")).click();

		while (!(driver
				.findElement(By.cssSelector("div[class='datepicker-cal'] caption[class='datepicker-cal-month-header']"))
				.getText().toLowerCase().contains(targetMonth))) {

			driver.findElement(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/button[2]")).click();
		}

		for (int i = 0; i < driver.findElements(By.className("datepicker-cal-date")).size(); i++) {

			if (driver.findElements(By.className("datepicker-cal-date")).get(i).getText().equals(targetDay)) {

				driver.findElements(By.className("datepicker-cal-date")).get(i).click();
				break;
			}
		}

		/*
		 * CALENDER HANDLING
		 * 
		 * first click the Calender
		 * 
		 * TO SELECT THE MONTH
		 * 
		 * then create a while loop logic is as long as your target month is not there
		 * click the next button AND WHEN ITS MATCHING STOP In condition statement -->
		 * if not matching go click next we used ! for NOT --> SO WHEN NOT MATCHING
		 * CONDITION BECOMES TRUE AND IT CLICKS NEXT WHEN MATCHING IT WONT DO ANYTHING
		 * BC WE GOT THE TARGET MONTH
		 * 
		 * 
		 * TO SELECT THE DAY
		 * 
		 * WE CREATED A FOR LOOP FOR THE TARGET MONTH WE SELECTED A COMMON LOCATOR THAT
		 * LOCATES ALL THE DAYS AVAILABLE IN THAT MONTH LOOP GOES AS LONG AS THE SIZE OF
		 * THAT LOCATOR WHICH IS ALL THE DATES AVAIILABLE
		 * 
		 * INSIDE THE LOOP WE CREATED AN IF STATEMENT WITH THE CONDITION: IF YOUR TARGET
		 * DAY MATCHES THE DAT YOU GET FROM GETTEXT(), CLICK ON IT IF NOT MATCHING KEEP
		 * LOOPING AND WHEN YOU FIND CLICK
		 * 
		 */
		Thread.sleep(1000);
		driver.findElement(By.id("package-returning-hp-package")).click();

		String targetReturnMonth = "May";
		String targetReturnDay = "May\n23";

		if ((driver
				.findElement(By.xpath("//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[2]/table/caption"))
				.getText().contains(targetReturnMonth))) {
			
			for (int i = 0; i < driver.findElements(By.className("datepicker-cal-date")).size(); i++) {

				if (driver.findElements(By.className("datepicker-cal-date")).get(i).getText().equals(targetReturnDay)) {

					driver.findElements(By.className("datepicker-cal-date")).get(i).click();
					break;
				}
				}	
			}
		}
	}


