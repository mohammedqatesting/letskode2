package mainFunction;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util extends MainDriver{

	public Util(WebDriver driver) {
		super(driver);
	}

	public void takeScreenshot(String pictureName) {
		
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			FileUtils.copyFile(screen, new File ("C:\\Users\\smuskan1524\\Documents\\SeleniumErrorScreenshot"+pictureName+".jpg"));

		}
		catch (Exception R){

			System.out.println("Error Screenshot not taken");

	}
	}
	
	public void sleep () {
	try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		
		System.out.println("The Ugly wait is not working");
	}
			
	}
		public void clickElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		}

		public void sentText(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);	
			
		}

		public boolean verifyText (String expectedText, String xpath) {
		
			String actualText = driver.findElement(By.xpath(xpath)).getText();
			if (actualText.equalsIgnoreCase(expectedText)){
				
				System.out.println("Expected Text matched, Test Passed");
				return true;
			}

			else {
				System.out.println("Test Failed");
				return false;
			}
			
		}
		public boolean notVerifyText (String expectedText, String xpath) {
			
			String actualText = driver.findElement(By.xpath(xpath)).getText();
			if (actualText.equalsIgnoreCase(expectedText)){
				
				System.out.println("Expected Text matches Actual Text, Test failed");
				return false;
			}

			else {
				System.out.println("Test Passed");
				return true;
			}
			
		}
}
