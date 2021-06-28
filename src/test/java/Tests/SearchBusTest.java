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
		
		//calling the method for source location
		search.EnterSourceLocation("");
		
		//calling method for destination location
		search.EnterDestLocation("");
		
		//creating object to access the calender
		Actions mouse = new Actions(driver);	
		
		mouse.click(driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']"))).build().perform();	  
		mouse.click(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[2]/li[31]/span[1]") )).build().perform();	
		
		
		search.ClickSearch();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
