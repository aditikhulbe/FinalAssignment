package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.SitemapPage;



public class SitemapTest extends BaseTest {

	// test scenario for checking Sitemap Page functionality
	@Test
	public void SitemapPageFunctionality() {

		// extent reporting
		extentTest = extent.startTest("Checking Sitemap page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// creating an object for the methods of Sitemap Page
		SitemapPage page = new SitemapPage(driver);

		// calling methods from Sitemap Page
		page.ClickOnSitemap();
		logger.info("Successfully clicked on Sitemap Button");
		page.changeWindow();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// validating the title of the page
		assertTrue(driver.getTitle().contains("sitemap"));
		logger.info("Validated the page title successfully");
		// closing the new Window
		page.closeWindow();
		logger.info("Test Case- checking functionality of Sitemap Page Passed");

	}

}
