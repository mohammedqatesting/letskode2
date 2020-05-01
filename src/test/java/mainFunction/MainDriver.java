package mainFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MainDriver {
	
	WebDriver driver;


	public void openBrowser (String browser) {
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\smuskan1524\\Documents\\SeleniumDrivers\\chromedriver80.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://google.com");
			driver.get("https://learn.letskodeit.com/");
			driver.manage().window().maximize();
		}
	
		else if (browser.equalsIgnoreCase("Mozilla"))
		{		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\smuskan1524\\Documents\\SeleniumDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://google.com");
			driver.get("https://learn.letskodeit.com/");
			driver.manage().window().maximize();
		}
		
		else if (browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\smuskan1524\\Documents\\SeleniumDrivers\\edgedriver.exe");
			driver.get("https://learn.letskodeit.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
	}


	public MainDriver(WebDriver driver) {
	
		this.driver = driver;
	
		
	
	}
	
	
	


}
