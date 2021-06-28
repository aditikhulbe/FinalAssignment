 package Tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.MobilePage;


public class MobileTest extends BaseTest {
	// test scenario for checking Mobile Page functionality
	@Test
	public void MobilePageFunctionality() {

		// extent reporting
		extentTest = extent.startTest("Checking Mobile page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// creating an object for the methods of Mobile Page
		MobilePage mobile = new MobilePage(driver);

		// calling methods from offers Page
		mobile.ClickOnMobile();
		mobile.changeWindow();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mobile.enterMobileNo("8383944719");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mobile.SendSMS();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		// closing the new Window
		mobile.closeWindow();

	}

}
