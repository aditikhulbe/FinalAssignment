package Tests;

import static org.testng.Assert.assertTrue;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import Pages.ValuesPage;

public class ValuesTest extends BaseTest{

	// test scenario for checking Values Page functionality
	@Test
	public void ValuesPageFunctionality() {

		// extent reporting
		extentTest = extent.startTest("Checking Values page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// creating an object for the methods of Values Page
		ValuesPage value = new ValuesPage(driver);
		
		//calling methods from Values Page
		value.ClickOnValues();
		logger.info("Clicked successfully on Values Button"); 
		value.changeWindow();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

		// validating the title of the page
		assertTrue(driver.getTitle().contains("redBus value"));
		logger.info("Successfully validated the title of the Page"); 

		// scrolling down
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

		// closing the new Window
		value.closeWindow();
		logger.info("test Case- Checking functionality of Values Page Passed"); 

	}

}
