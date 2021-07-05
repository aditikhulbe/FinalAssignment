package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AwardsPage {


	// initializing the web driver
			WebDriver driver;

			public AwardsPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;

			}

			//locator for clicking on Business standard button
			@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/div[1]/div[7]/section[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[1]")
			public WebElement Award1;
			
					
			//method for clicking on Business standard button
			public void ClickOnAward1() {
				Award1.click();
			}
			
			//locator for clicking on most trusted brand button
			@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/div[1]/div[7]/section[1]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]/img[1]")
			public WebElement Award2;
			
					
			//method for clicking on Business standard button
			public void ClickOnAward2() {
				Award2.click();
			}		

			//locator for clicking on Eye for travel button
			@FindBy(how = How.XPATH, using = "//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/div[1]/div[7]/section[1]/div[1]/div[2]/div[3]/a[1]/div[1]/div[1]/img[1]")
			public WebElement Award3;
			
					
			//method for clicking on Business standard button
			public void ClickOnAward3() {
				Award3.click();
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
