package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaPage {
	// initializing the web driver
	WebDriver driver;

	public SocialMediaPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}

	// locator for facebook button
	@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/footer[@id='rh_footer']/div[3]/div[1]/div[1]/div[2]/div[3]/a[1]/span[1]")
	public WebElement FacebookIcon;

	// method for clicking on facebook button
	public void ClickOnFacebook() {
	 FacebookIcon.click();
	}

	// locator for Twitter button
	@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/footer[@id='rh_footer']/div[3]/div[1]/div[1]/div[2]/div[3]/a[2]/span[1]")
	public WebElement TwitterIcon;

	// method for clicking on Twitter button
	public void ClickOnTwitter() {
		TwitterIcon.click();
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
