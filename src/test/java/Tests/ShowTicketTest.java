package Tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.ShowTicketPage;
import utils.CommonUtils;

public class ShowTicketTest extends BaseTest {
	// defining the Excel sheet name
	private String sheetName = "Ticket";
	
		
		@Test
		public void ShowMyTicket() {
			
			//fetching the data from Excel Sheet
			String TicketNo = "UserEnterTicketNo";
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, TicketNo);
	        String Email = "UserEnterTicketNo";
	        testData = reader.getRowTestData(sheetName, Email);
	 
	        
	        String executionRequired = testData.get("Execution").toLowerCase();
	        
	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
						
			//extent reporting
			extentTest = extent.startTest("Checking Show/Print Ticket click functionality");
			
			//creating object for the methods of ShowTicketPage
			ShowTicketPage showticket = new ShowTicketPage (driver);
			
			//calling methods from ShowTicketPage
			showticket.ManageBookingiconClick();
			

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			logger.info("Clicked successfully on Manage Booking Button");
			showticket.ShowTicket();
			

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			logger.info("Clicked successfully on Show Ticket Button");
			showticket.EnterTicketNo(testData.get("TicketNo"));
			

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			logger.info("Entered the Ticket number");
			showticket.EnterEmailId(testData.get("Email"));
			

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			logger.info("Entered the Email");
			showticket.ClickSubmit();
			

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			logger.info("Clicked successfully on Submit Button");
			logger.info("Test Case- Checking functionality of Show Ticket Page Passed");
		
}
}

