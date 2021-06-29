package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShowTicketPage {

	// initializing the web driver
	WebDriver driver;

	public ShowTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// locators

	//locator for drop down menu of manage bookings
	@FindBy(how = How.XPATH, using = "//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")
	public WebElement iconManageBookings;

	//locator for show my ticket
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Show My Ticket')]")
	public WebElement ShowTicket;

	//locator for entering ticket number
	@FindBy(how = How.XPATH, using = "//input[@id='searchTicketTIN']")
    public WebElement TicketNumber;
	
	//locator for entering email id
	@FindBy(how = How.XPATH, using = "//input[@id='searchTicketEmail']")
	public WebElement EmailId;

	
	//locator for clicking on Submit 
	@FindBy(how = How.XPATH, using = "//input[@id='ticketSearch']")
	public WebElement Submitsearch;
		
	//method for clicking on manage bookings
	public void ManageBookingiconClick() {
		iconManageBookings.click();
	}

	//method for clicking on Show My ticket
	public void ShowTicket() {
		ShowTicket.click();
	}

	//method for entering ticket number
	public void EnterTicketNo(String ticket) {
		TicketNumber.sendKeys(ticket);
	}
	
	//method for entering email id
	public void EnterEmailId(String email) {
		EmailId.sendKeys(email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//method for clicking on Submit
	public void ClickSubmit() {
		Submitsearch.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
