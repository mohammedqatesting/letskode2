package testNgTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import functions.PracticePageFunction;
import mainFunction.Util;
import xPath.HomePage;
import xPath.practicePage;

public class VerifyRadioButton extends Util{

	public VerifyRadioButton(WebDriver driver) {
		super(driver);
		
	}
	practicePage pp = new practicePage();
	HomePage hp = new HomePage();
	HomePagefunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
	
	
	
	
//	public VerifyRadioButton(WebDriver driver) {
//		super(driver);
//	
//	}
@Test

public  void testRadioButton () {
		openBrowser("chrome");
		clickElement(hp.practiceButton);
		clickElement(pp.benzRadioButton);
		clickElement(pp.bmwDropDown);
		clickElement(pp.appleColor);
		clickElement(pp.hondaCheckBox);
		
		assertEquals(verifyText("bmw", pp.bmwCheckBox), true);
		
		
}
	public void verifyAllRadioButton() {
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		ppf.clickBmwRadioButton();
		sleep(2000);
		ppf.clickBenzRadioButon();
		sleep(2000);
		ppf.clickHondaRadioButton();
		
		
	}
}
