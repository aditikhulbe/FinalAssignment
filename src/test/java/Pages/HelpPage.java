package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {

	
	// initializing the web driver
	WebDriver driver;

	public HelpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// locator for Help button
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Help')]")
	public WebElement HelpButton;

	//locator for Cross button
	@FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	public WebElement Cross;
	
	// method for clicking on Help Button
	public void ClickOnHelp() {
		HelpButton.click();
	}
	
	//method for changing the new browser window
	static String winHandleBefore;

	public void changeWindow() {
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}
		
		
	//method for clicking on cross
	public void ClickCross() {
		//driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
		Cross.click();
		
	}
	
	//method for closing the new browser window
	 public void closeWindow() {
	        driver.close();
	        driver.switchTo().window(winHandleBefore);
	    }
}
