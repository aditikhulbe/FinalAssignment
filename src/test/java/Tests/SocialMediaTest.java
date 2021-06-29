package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.SocialMediaPage;

public class SocialMediaTest extends BaseTest {

	// test scenario for checking Facebook Page functionality
	@Test
	public void SocialMediaPageFunctionality() {

		// extent reporting
		extentTest = extent.startTest("Checking Social Media page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// creating an object for the methods of offers Page
		SocialMediaPage media = new SocialMediaPage (driver);
		
		//calling methods from offers Page
		media.ClickOnFacebook();
		
		logger.info("Clicked successfully on Facebook Button");
		
		media.changeWindow();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// validating the title of the page
		assertTrue(driver.getTitle().contains("redBus"));
		logger.info("Vaidated the page title successfully");
		// closing the new Window
	  media.closeWindow();
	  logger.info("Test Case- checking functionality of Social Media 1 Passed");
	}

	// test scenario for checking Twitter Page functionality
	@Test
	public void SocialMediaPageFunctionality2() {

		// extent reporting
		extentTest = extent.startTest("Checking Social Media page functionality 2");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// creating an object for the methods of offers Page
		SocialMediaPage media = new SocialMediaPage (driver);
		
		//calling methods from offers Page
		media.ClickOnTwitter();
		  logger.info("Successfully clicked on Twitter button");
		media.changeWindow();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// validating the title of the page
		assertTrue(driver.getTitle().contains("redBus"));
		  logger.info("Validated the page title successfully");
		// closing the new Window
	  media.closeWindow();

	  
	  logger.info("Test Case- checking functionality of Social Media 2 Passed");
	}
	
	
}
