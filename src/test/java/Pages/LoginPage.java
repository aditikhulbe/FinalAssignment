package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	//initializing the web driver
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
		
	}
	
	//locators for sign in
	
	@FindBy(how = How.XPATH, using = "//i[@id='i-icon-profile']")
    public WebElement icon;
    
    @FindBy(how = How.XPATH, using = "//li[@id='signInLink']")
    public WebElement signIn;
   
    //entering an invalid mobile number
    @FindBy(how = How.XPATH, using = "//input[@id='mobileNoInp']")
    public WebElement invalidMobile;

    //methods
    public void iconClick() {
        icon.click();
    }

    public void signInClick() {
        signIn.click();
    }


    
 
    
    public void enterMobileNumber(String mobile) {
    	  driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
    	invalidMobile.sendKeys(mobile); 
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
}	
	
