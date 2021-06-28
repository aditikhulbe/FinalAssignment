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
    
    @FindBy(how = How.CLASS_NAME, using = "social-acc-box-br margin-g")    
    public WebElement googleIcon;
    
    //locator for entering email id
    @FindBy(how = How.XPATH, using = "//input[@id='identifierId']")
    public WebElement EmaidId;
    
  
    
   // invalid login
    
    //entering an invalid mobile number
    @FindBy(how = How.XPATH, using = "//input[@id='mobileNoInp']")
    public WebElement invalidMobile;
  
    
    //for clicking on captcha
    @FindBy(how = How.XPATH, using =  "//div[@id='recaptchaElement']" )
    public WebElement captcha;
    
    public void iconClick() {
        icon.click();
    }

    public void signInClick() {
        signIn.click();
    }

    public void GoogleSignInClick() throws Throwable {
    	
		driver.switchTo()
				.frame(driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/iframe[1]")));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[8]/div[1]")).click();
	}
    
 
    
    public void enterMobileNumber() {
    	  driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
    	invalidMobile.sendKeys("123456e788"); 
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void captcha() {
    	captcha.click();
    	  	
    }
      
	public void EnterEmail() {
		EmaidId.sendKeys("aditi@gmail.com");
	}
}	
	
