package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserAgreementPage {
	// initializing the web driver
	WebDriver driver;

	public UserAgreementPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;

			}

	// locator for User Agreement button
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'User Agreement')]")
	public WebElement UserAgreement;

	// method for clicking on User agreement button
	public void ClickOnUserAgreement() {
		UserAgreement.click();
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
