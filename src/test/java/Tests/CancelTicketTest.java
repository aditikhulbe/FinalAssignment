package Tests;


import org.testng.annotations.Test;

import Pages.CancelTicketPage;


public class CancelTicketTest  extends BaseTest{

	
	@Test
	public void CancelTicket() {
		
		//extent reporting
		extentTest = extent.startTest("Checking Cancel ticket functionality");
		
		//creating an object for the methods of CancelTicketPage
		CancelTicketPage cancel = new CancelTicketPage (driver);
		
		//calling methods from CancelTicketPage
		cancel.ManageBookingiconClick();
		cancel.CancelTicket();
		cancel.EnterTicketNo();
		cancel.EnterEmailId();
		cancel.SelectPassengers();
	
}
}

