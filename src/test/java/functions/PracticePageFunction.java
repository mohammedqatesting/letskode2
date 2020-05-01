package functions;

import org.openqa.selenium.WebDriver;

import mainFunction.Util;
import xPath.practicePage;

public class PracticePageFunction extends Util{

	public PracticePageFunction(WebDriver driver) {
		super(driver);

		practicePage pp = new practicePage() {

		public void clickBmwRadioButton() {
		
			clickElement(pp.bmwRadioButton);
		}
		
		public void clicBenzRadioButton() {
			
			clickElement(pp.benzRadioButton);
		}
		public void clickBenzDropdown() {
			clickElement(pp.benzDropDown);
		}
		public void clickColorButton() {
			clickElement(pp.peachColor);
		}
		public void clickCheckButton() {
			clickElement(pp.)
		}
		}
		
		
	}
}