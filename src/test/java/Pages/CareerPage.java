package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

	// initializing the web driver
		WebDriver driver;

		public CareerPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;

			}

		// locator for Careers button
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Careers')]")
		public WebElement Career;

		// method for clicking on Careers button
		public void ClickOncareer() {
			Career.click();
		}
		
		// locator for Get Onboard Now button
		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Get Onboard Now')]")
		public WebElement Onboard;

		// method for clicking on Careers button
		public void ClickOnOnboard() {
			Onboard.click();
		}
		
		// locator for Hirist button
		@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[1]/div[9]/ul[1]/a[2]/img[1]")
		public WebElement Hirist;

		// method for clicking on Careers button
		public void ClickOnHirist() {
			Hirist.click();
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
