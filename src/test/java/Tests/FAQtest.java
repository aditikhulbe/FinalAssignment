package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.FAQpage;

public class FAQtest extends BaseTest {

	// test scenario for checking FAQ Page functionality
		@Test
		public void FAQpageFunctionality() {
			
			logger.info("Checking functionality of FAQ page"); 
			// extent reporting
			extentTest = extent.startTest("Checking FAQ page functionality");

			// scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4500)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		//creating an object for the methods of FAQ page
			FAQpage faq = new FAQpage(driver);
			
			// calling methods from FAQpage
			faq.ClickOnFAQ();
			logger.info("Clicked successfully on FAQ Button"); 
			faq.changeWindow();
			
			//validating the title of the page
			assertTrue(driver.getTitle().contains("FAQ"));
			
			//to see the content inside the General tab
			faq.ClickOnGeneral();
			logger.info("Clicked successfully on General Button"); 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//to close the General tab
			faq.ClickOnGeneral();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// scrolling down
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0,100)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
						
						
			//to read the content inside Ticket related tab
			faq.ClickOnTicketRelated();
			logger.info("Clicked successfully on Ticket Related Button"); 

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//to close the content inside Ticket related tab
			faq.ClickOnTicketRelated();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			// scrolling down
			JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
			scroll1.executeScript("window.scrollBy(0,200)", "");
						
			
			//to read content inside payment related tab
			faq.ClickOnPaymentRelated();
			logger.info("Clicked successfully on Payment Related Button"); 
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//to close content inside payment related tab
			faq.ClickOnPaymentRelated();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			// scrolling down
			JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
			scroll2.executeScript("window.scrollBy(0,300)", "");
			
			//to read content inside cancellation related tab
			faq.ClickOncancelRelated();
			logger.info("Clicked successfully on Cancel Related Button"); 
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//to close content inside cancellation related tab
			faq.ClickOncancelRelated();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// scrolling down
			JavascriptExecutor scroll4 = (JavascriptExecutor) driver;
			scroll4.executeScript("window.scrollBy(0,300)", "");
						
			
			//to read content inside refund related tab
			faq.ClickOnRefundRelated();
			logger.info("Clicked successfully on Refund Related Button"); 
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//to close content inside refund related tab
			faq.ClickOnRefundRelated();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			// scrolling down
			JavascriptExecutor scroll5 = (JavascriptExecutor) driver;
			scroll5.executeScript("window.scrollBy(0,00)", "");
						
			//to read content inside insurance related tab
			faq.ClickOnInsuranceRelated();
			logger.info("Clicked successfully on Insurance related Button"); 
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//to close content inside insurance related tab
			faq.ClickOnInsuranceRelated();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//to close the new window
			faq.closeWindow();
		
			logger.info("Test Case- Checking functionality of FAQ page Passed"); 
			
		}
		
}
