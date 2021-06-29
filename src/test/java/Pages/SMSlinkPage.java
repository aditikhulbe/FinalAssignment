package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SMSlinkPage {

	// initializing the web driver
			WebDriver driver;

			public SMSlinkPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;

			}

			//locator for filling valid number in text box button
			@FindBy(how = How.XPATH, using = "//input[@id='smsTXTBOX']")
			public WebElement ValidNumber;
			
			//locator for filling invalid number in text box button
			@FindBy(how = How.XPATH, using = "//input[@id='smsTXTBOX']")
			public WebElement InvalidNumber;
			
			//locator for SMS me the link button
			@FindBy(how = How.XPATH, using = "//input[@id='sendLinkButton']")
			public WebElement SendClick;
			
			//method for entering valid number in TextBox
			public void EnterValidNumber(String number) {
				ValidNumber.sendKeys(number);
			}
			
			//method for clicking on TextBox
			public void EnterInvalidNumber(String invalid) {
				InvalidNumber.sendKeys(invalid);
			}
			
			//method for clicking on send link button
			public void ClickonSend() {
				SendClick.click();
			}	
}
