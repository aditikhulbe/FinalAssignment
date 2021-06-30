package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.HelpPage;


public class HelpTest extends BaseTest {

	
	//test scenario for checking Help page functionality
		@Test
		public void HelpPageFunctionality() {
			
			// extent reporting
			extentTest = extent.startTest("Checking Help Page functionality");

			// calling methods from HelpPage
			HelpPage help = new HelpPage(driver);
			help.ClickOnHelp();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logger.info("Clicked successfully on Help Button"); 
			help.changeWindow();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// validating the title of the page
			assertTrue(driver.getTitle().contains("red:Care"));
			logger.info("Successfully validated the title of the page"); 
			
			help.ClickCross();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			help.closeWindow();

			// scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			
			logger.info("Test Case- Checking functionality of Help Page Passed"); 

		}
	}

