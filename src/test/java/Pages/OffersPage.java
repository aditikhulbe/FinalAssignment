package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {

	// initializing the web driver
	WebDriver driver;

	public OffersPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}

	// locator for Offers button
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Offers')]")
	public WebElement Offers;

	// method for clicking on Offers button
	public void ClickOnOffers() {
		Offers.click();
	}

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
