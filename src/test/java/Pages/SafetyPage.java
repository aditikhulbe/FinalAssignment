package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SafetyPage {

	// initializing the web driver
	WebDriver driver;

	public SafetyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// locator for clicking on know more button
	@FindBy(how = How.XPATH, using = "//div[@id='safetyplusClick']")
	public WebElement KnowMoreButton;

	

	// method for clicking on know more button
	public void ClickOnKnowMore() {
		KnowMoreButton.click();
	}

	
}
