 package Tests;


import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.MobilePage;
import utils.CommonUtils;


public class MobileTest extends BaseTest {
		// defining the Excel sheet name
	private String sheetName = "MobilePage";
	
	// test scenario for checking Mobile Page functionality
	@Test
	public void MobilePageFunctionality() {
		
		//fetching the data from Excel Sheet
		String ValidNumber = "MobileSearch";
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, ValidNumber);
      
        String executionRequired = testData.get("Execution").toLowerCase();
        
        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
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

		// calling methods from mobile Page
		mobile.ClickOnMobile();
		
		logger.info("Clicked successfully on Mobile Button"); 
		
		mobile.changeWindow();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mobile.enterMobileNo(testData.get("ValidNumber"));
		logger.info("Entered Mobile Number"); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mobile.SendSMS();
		logger.info("Clicked on Send SMS"); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		// closing the new Window
		mobile.closeWindow();
		logger.info("test Case- Checking functionality of Mobile Test Page Passed"); 

	}

}
