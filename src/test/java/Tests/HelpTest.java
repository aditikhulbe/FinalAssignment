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
			help.changeWindow();
			
			// validating the title of the page
			assertTrue(driver.getTitle().contains("red:Care"));
						
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

		}
	}

