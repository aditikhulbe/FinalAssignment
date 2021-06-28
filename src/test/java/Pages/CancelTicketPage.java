package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CancelTicketPage {

	
	// initializing the web driver
		WebDriver driver;

		public CancelTicketPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}

		// locators

		//locator for drop down menu of manage bookings
		@FindBy(how = How.XPATH, using = "//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")
		public WebElement iconManageBookings;

		//locator for cancel ticket
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
		public WebElement CancelTicket;

		//locator for entering ticket number
		@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/div[@id='mBWrapper']/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	    public WebElement TicketNumber;
		
		//locator for entering email id
		@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/div[@id='mBWrapper']/div[@id='root']/div[1]/div[2]/div[1]/div[2]/input[1]")
		public WebElement EmailId;

		
		//locator for clicking on Select Passengers
		@FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Passengers')]")
		public WebElement Selectpassengers;
			
		//method for clicking on manage bookings
		public void ManageBookingiconClick() {
			iconManageBookings.click();
		}

		//method for clicking on Cancel ticket
		public void CancelTicket() {
			CancelTicket.click();
		}

		//method for entering ticket number
		public void EnterTicketNo() {
			TicketNumber.sendKeys("123456");
		}
		
		//method for entering email id
		public void EnterEmailId() {
			EmailId.sendKeys("aditikh@gmail.com");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//method for selecting passengers
		public void SelectPassengers() {
			Selectpassengers.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


