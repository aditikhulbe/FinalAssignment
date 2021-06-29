package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import Pages.UserAgreementPage;

public class userAgreementTest extends BaseTest {

	// test scenario for checking User Agreement Page functionality
			@Test
			public void OffersPageFunctionality() {

				// extent reporting
				extentTest = extent.startTest("Checking user Agreement page functionality");

				// scrolling down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,4500)", "");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// creating an object for the methods of user Agreement Page
				UserAgreementPage agree = new UserAgreementPage(driver);

				// calling methods from offers Page
				agree.ClickOnUserAgreement();
				  logger.info("Successfully clicked on User Agreement Button");
				agree.changeWindow();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// validating the title of the page
				assertTrue(driver.getTitle().contains("User Agreement"));
				  logger.info("Validated the page title successfully");
				// closing the new Window
				agree.closeWindow();
				  logger.info("Test Case- checking functionality of User Agreement Page Passed");

			}

}
