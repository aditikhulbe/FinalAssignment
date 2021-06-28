package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import Pages.SMSlinkPage;

public class SMSlinkTest extends BaseTest {

	// test scenario for checking SMS page functionality
	@Test
	public void SMSfunctionalityValid() {

		extentTest = extent.startTest("Checking SMS page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// calling methods from SMSlinkPage
		SMSlinkPage send = new SMSlinkPage(driver);
		send.EnterValidNumber();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		send.ClickonSend();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// test scenario for checking SMS page functionality
		@Test
		public void SMSfunctionalityInvalid() {

			extentTest = extent.startTest("Checking SMS Page functionality with invalid input");

			// scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1300)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// calling methods from SMSlinkPage
			SMSlinkPage send = new SMSlinkPage(driver);
			send.EnterInvalidNumber();

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			send.ClickonSend();

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
}
