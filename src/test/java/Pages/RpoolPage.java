package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RpoolPage {

	
	// initializing the web driver
		WebDriver driver;

		public RpoolPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}

		//locator for Rpool button
		@FindBy(how = How.XPATH, using = "//a[@id='cars']")
		public WebElement RPOOL;
	
		//locator for clicking on What is Rpool
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'What is rPool')]")
		public WebElement whatisRPOOL;
		
		//locator for clicking on How it works
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'How it works')]")
		public WebElement HowItWorks;
		
		//locator for clicking on offer Rides
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Offer Ride')]")
		public WebElement OfferRides;
		
		
		//locator for clicking on Corporate
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Corporate+')]")
		public WebElement CorporateClick;
		
		//locator for clicking on rPOOl for RWAs button
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'rPool for RWAs')]")
		public WebElement RWAsClick ;
		
		
		//locator for clicking rPOOl FAQ button
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQs')]")
		public WebElement FAQClick ;
		
		//method for clicking on Rpool
		public void ClickOnRpool() {
			RPOOL.click();
		}
		
		//method for clicking on what is Rpool
		public void whatIsRpoolclick() {
		  whatisRPOOL.click();
        }
		//method for clicking on how it works
		public void HowItWorksClick() {
			HowItWorks.click();
		}
		//method for clicking on Offer rides
		public void OfferRidesClick() {
			OfferRides.click();
		}
		
		//method for clicking on Offer rides
		public void CorporateClick() {
			CorporateClick.click();
        }
		//method for clicking on rPool for RWAs
		public void RWAsClick() {
			RWAsClick.click();

        }
		//method for clicking on rPool for RWAs
		public void FAQbuttonClick() {
		    FAQClick.click();
}
}



