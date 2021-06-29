package Tests;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import Pages.SMSlinkPage;
import utils.CommonUtils;

public class SMSlinkTest extends BaseTest {
	// defining the Excel sheet name
		private String sheetName = "SMSlinkPage";
		
	// test scenario for checking SMS page functionality
	@Test
	public void SMSfunctionalityValid() {
		
		//fetching the data from Excel Sheet
		String validNumber = "SendSMS";
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, validNumber);
     
        
        String executionRequired = testData.get("Execution").toLowerCase();
        
        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        
        //extent reporting
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
		send.EnterValidNumber(testData.get("validNumber"));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("Entered a mobile number successfully");

		send.ClickonSend();

		logger.info("Clicked successfully on Click on send Button");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("Test Case- checking the funtionality of Sms link page Passed");

	}
	
	// test scenario for checking SMS page functionality
		@Test
		public void SMSfunctionalityInvalid() {
			
			//fetching the data from Excel Sheet
			String invalidNumber = "SendSMS";
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, invalidNumber);
	     
	        
	        String executionRequired = testData.get("Execution").toLowerCase();
	        
	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
	        
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
			send.EnterInvalidNumber(testData.get("invalidNumber"));

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logger.info("Entered an invalid mobile number");

			send.ClickonSend();
			
			logger.info("Clicked successfully on Send Link Button");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("test Case- Checking functionality of SMS link page- invalid case Passed");

		}
}
