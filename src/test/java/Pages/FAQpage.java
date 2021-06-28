package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FAQpage {
	
	// initializing the web driver
	WebDriver driver;

	public FAQpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

		}

	// locator for FAQ button
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQ')]")
	public WebElement FAQ;

	// method for clicking on FAQ button
	public void ClickOnFAQ() {
		FAQ.click();
	}
	
	// method for changing the new browser window
	static String winHandleBefore;

	public void changeWindow() {
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	// locator for clicking on general tab in the FAQ page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'GENERAL')]")
	public WebElement General;

	// method for clicking on general tab in the FAQ page
	public void ClickOnGeneral() {
		General.click();
	
	}
	
	// locator for clicking on Ticket Related tab in the FAQ page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'TICKET-RELATED')]")
	public WebElement TicketRelated;

		
	// method for clicking on Ticket Related tab in the FAQ page
	public void ClickOnTicketRelated() {
		TicketRelated.click();
		
	}
	
	
	// locator for clicking on Payment Related tab in the FAQ page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'PAYMENT-RELATED')]")
	public WebElement paymentRelated;

	// method for clicking on Ticket Related tab in the FAQ page
	public void ClickOnPaymentRelated() {
		paymentRelated.click();

	}
	
	// locator for clicking on Cancellation Related tab in the FAQ page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'CANCELLATION-RELATED')]")
	public WebElement CancelRelated;

	// method for clicking on Cancellation  Related tab in the FAQ page
	public void ClickOncancelRelated() {
		CancelRelated.click();

	}
	
	// locator for clicking on Refund Related tab in the FAQ page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'REFUND-RELATED')]")
	public WebElement RefundRelated;

	// method for clicking on Refund Related tab in the FAQ page
	public void ClickOnRefundRelated() {
		RefundRelated.click();

	}
	

	// locator for clicking on Insurance Related tab in the FAQ page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'INSURANCE RELATED')]")
	public WebElement InsuranceRelated;

	// method for clicking on Cancellation Related tab in the FAQ page
	public void ClickOnInsuranceRelated() {
		InsuranceRelated.click();

	}
		
		
	// method for closing the new browser window

	public void closeWindow() {
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}

}
