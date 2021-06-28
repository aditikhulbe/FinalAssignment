package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AgentRegistrationPage {

	
	// initializing the web driver
	WebDriver driver;

	public AgentRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

			}

			// locator for Agent Registration button
			@FindBy(how = How.XPATH, using = "//a[contains(text(),'Agent Registration')]")
			public WebElement Reg;

			// method for clicking on Agent Registration button
			public void ClickOnReg() {
				Reg.click();
			}

			// method for changing the new browser window
			static String winHandleBefore;

			public void changeWindow() {
				winHandleBefore = driver.getWindowHandle();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
			}
		
		
			//locator for login for agents
			@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
			public WebElement Login;
			
			// method for clicking on Login Agent button
			  public void ClickOnLogin() {
				Login.click();
					}

			// locator for username button
				@FindBy(how = How.XPATH, using = "	//input[@id='emailbox']")
			public WebElement username;

		     // method for entering username
		      public void EnterUsername(String name) {
		    	username.sendKeys(name);
				       }	

			// locator for password button
			@FindBy(how = How.XPATH, using = "//input[@id='password']")
			public WebElement password;

			// method for entering password
			public void EnterPassword(String pass) {
			password.sendKeys(pass);
						}

			//locator for LOGIN button
			@FindBy(how = How.XPATH, using = "//button[@id='signin_button']")
			public WebElement login;
			
			//method for clicking on Login button
			public void ClickLoginButton() {
				login.click();
			}
			// method for closing the new browser window

			public void closeWindow() {
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}

}
