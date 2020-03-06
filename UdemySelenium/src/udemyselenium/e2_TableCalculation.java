package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2_TableCalculation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.marketwatch.com/story/what-the-average-american-wedding-looks-like----and-costs-2017-02-10");
		
		int count=driver.findElements(By.xpath("//*[@id=\"article-body\"]/table/tbody/tr/td[2]")).size();
		int sum=0;
		
		for (int i = 2; i < count-1; i++) {
			
		
			String costFinal=driver.findElements(By.xpath("//*[@id=\"article-body\"]/table/tbody/tr/td[2]")).get(i).getText().replace("$", "").replace(",", "");
			int itemCost=Integer.parseInt(costFinal);
			
			sum=sum+itemCost;
		}
		System.out.println("Avarage wedding cost in the US is "+sum);
	}

}
