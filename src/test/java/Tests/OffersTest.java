package Tests;

import static org.testng.Assert.assertTrue;

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
			offer.changeWindow();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// validating the title of the page
			assertTrue(driver.getTitle().contains("Offers"));

			// closing the new Window
			offer.closeWindow();

		}
	
}
