package Tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.SafetyPage;


public class SafetyTest extends BaseTest{

	// test scenario for checking Safety page functionality
	@Test
	public void SafetyPageTest() {
		
	     
        //extent reporting
		extentTest = extent.startTest("Checking Safety page functionality");	

		// calling methods from SafetyPage
		SafetyPage safe = new SafetyPage(driver);
		safe.ClickOnKnowMore();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("Clicked on Safety Page, know more button successfully");

	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// scrolling down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)", "");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		logger.info("Test Case- checking the funtionality of Safety page Passed");

	}
	
	
}
