package Tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.CareerPage;


public class CareerTest extends BaseTest{
	// test scenario for checking Careers Page functionality
	@Test
	public void CareersPageFunctionality() {

		// extent reporting
		extentTest = extent.startTest("Checking Careers page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// creating an object for the methods of Careers Page
		CareerPage career = new CareerPage(driver);
		
		//calling methods from career Page
	   career.ClickOncareer();
	   logger.info("Clicked successfully on Career Button"); 
	   career.changeWindow();
	   
	   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		career.ClickOnHirist();
		logger.info("Clicked successfully on Hirist Button"); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		career.closeWindow();
	
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
		career.changeWindow();
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		// closing the new Window
		career.closeWindow();
		logger.info("Test Case- checking functionality og Career page passed"); 

	}

}
