package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pages.SearchBusPage;

public class SearchBusTest extends BaseTest {

	
	@Test
	public void searchBus() {
		
		//extent reporting
		extentTest = extent.startTest("Checking Search Bus Page functionality");
		
		//creating an object for the methods of SearchBusPage
		SearchBusPage search = new SearchBusPage (driver);
		
		//calling the methods from SearchBusPage
		search.BookTicketsBus();
		
		logger.info("Clicked successfully on Search Bus Button");
		
		//calling the method for source location
		search.EnterSourceLocation("");
		
		logger.info("Successfully entered the source location");
		
		//calling method for destination location
		search.EnterDestLocation("");
		logger.info("Successfully entered the destination location");
		
		//creating object to access the calender
		Actions mouse = new Actions(driver);	
		
		mouse.click(driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']"))).build().perform();	  
		mouse.click(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[2]/li[31]/span[1]") )).build().perform();	
		logger.info("Successfully entered the date in the calender");
		
		search.ClickSearch();
		logger.info("Clicked successfully on Search Button");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		logger.info("Test Case- checking functionality of Search Bus Page Passed");

	}
}
