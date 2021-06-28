package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	// initializing the web driver
	WebDriver driver;

	public MobilePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}

	// locator for Mobile button
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'redBus on Mobile')]")
	public WebElement Mobile;

	// method for clicking on Mobile button
	public void ClickOnMobile() {
		Mobile.click();
	}

	// locator for clicking on the enter mobile number textbox
	@FindBy(how = How.XPATH, using = "//input[@id='smsTXTBOX']")
	public WebElement EnterMobile;

	// method for entering the mobile number value
	public void enterMobileNo(String number) {
		EnterMobile.sendKeys(number);
	}
	
	// method for clicking on Send button
	public void SendSMS() {
		Send.click();
	}

	// locator for clicking on send sms button
	@FindBy(how = How.XPATH, using = "//input[@id='sendLinkButton']")
	public WebElement Send;
		

	
	// method for changing the new browser window
	static String winHandleBefore;

	public void changeWindow() {
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	// method for closing the new browser window

	public void closeWindow() {
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}

		
}
