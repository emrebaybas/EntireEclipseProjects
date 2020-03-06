package udemyselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class e8_SSL_Insecure_Certifications {

	public static void main(String[] args) {
		
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		
		//ANOTHER WAY TO SET DIFFERENT CAPABILITIES
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);  
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions ch=new ChromeOptions();
		ch.merge(dc);
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(ch);

		driver.get("https://www.amazon.com");
	}

}
