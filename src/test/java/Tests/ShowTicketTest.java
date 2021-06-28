package Tests;

import org.testng.annotations.Test;

import Pages.ShowTicketPage;

public class ShowTicketTest extends BaseTest {

		
		@Test
		public void ShowMyTicket() {
			
			//extent reporting
			extentTest = extent.startTest("Checking Show/Print Ticket click functionality");
			
			//creating object for the methods of ShowTicketPage
			ShowTicketPage showticket = new ShowTicketPage (driver);
			
			//calling methods from ShowTicketPage
			showticket.ManageBookingiconClick();
			showticket.ShowTicket();
			showticket.EnterTicketNo();
			showticket.EnterEmailId();
			showticket.ClickSubmit();
		
}
}

