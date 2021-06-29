package Tests;


import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.CancelTicketPage;
import utils.CommonUtils;



public class CancelTicketTest  extends BaseTest{
	// defining the Excel sheet name
	private String sheetName = "Ticket";
	
	@Test
	public void CancelTicket() {
		
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
		extentTest = extent.startTest("Checking Cancel ticket functionality");
		
			
		//creating an object for the methods of CancelTicketPage
		CancelTicketPage cancel = new CancelTicketPage (driver);
		
		//calling methods from CancelTicketPage
		cancel.ManageBookingiconClick();
		
		logger.info("Clicked successfully on Manage Booking"); 
		
		cancel.CancelTicket();
		cancel.EnterTicketNo(testData.get("TicketNo"));
		cancel.EnterEmailId(testData.get("Email"));
		
		logger.info("Ticket No and Email filled in successfully"); 
		
		cancel.SelectPassengers();
		
		logger.info("Test Case- Checking functionality of Ticket page Passed"); 
	
}
}

