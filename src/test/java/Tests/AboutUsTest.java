package Tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.AboutUsPage;


public class AboutUsTest extends BaseTest {

	// test scenario for checking About Us Page functionality
	@Test
	public void AboutUsFunctionality() {

		
		// extent reporting
		extentTest = extent.startTest("Checking About Us page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		logger.info("Clicked successfully on About Us"); 
		
		// calling methods from AboutUsPage
		AboutUsPage about = new AboutUsPage(driver);
		about.ClickOnAboutUs();
		about.changeWindow();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//validating the title of the page
		assertTrue(driver.getTitle().contains("About Us"));
		logger.info("Title of page successfully validated"); 
		about.closeWindow();
		logger.info("Test Case- Functionality of About Us page Passed"); 
	
	}
}

