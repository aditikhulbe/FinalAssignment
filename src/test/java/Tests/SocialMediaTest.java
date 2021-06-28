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
		media.changeWindow();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// validating the title of the page
		assertTrue(driver.getTitle().contains("redBus"));

		// closing the new Window
	  media.closeWindow();

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
		media.changeWindow();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// validating the title of the page
		assertTrue(driver.getTitle().contains("redBus"));

		// closing the new Window
	  media.closeWindow();

	}
	
}
