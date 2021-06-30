package Tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.OffersPage;

public class OffersTest extends BaseTest {

	// test scenario for checking Offers Page functionality
		@Test
		public void OffersPageFunctionality() {

			// extent reporting
			extentTest = extent.startTest("Checking Offers page functionality");

			// scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4500)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// creating an object for the methods of offers Page
			OffersPage offer = new OffersPage(driver);
			
			//calling methods from offers Page
			offer.ClickOnOffers();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logger.info("Clicked successfully on Offers Button"); 
			offer.changeWindow();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

			// validating the title of the page
			assertTrue(driver.getTitle().contains("Offers"));
			logger.info("Successfully validated the title of the Page"); 

			// closing the new Window
			offer.closeWindow();
			logger.info("test Case- Checking functionality of Offers Page Passed"); 

		}
	
}
