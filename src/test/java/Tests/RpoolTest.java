package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.RpoolPage;

public class RpoolTest extends BaseTest {

	//test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality() {
		
		logger.info("Checking the functionality of Rpool Page"); 
		extentTest = extent.startTest("Checking Rpool Page functionality");


		//calling methods from RpoolPage
		RpoolPage function = new RpoolPage(driver);
		function.ClickOnRpool();
		logger.info("Clicked successfully on Rpool Button"); 
		
		//scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//calling the method for clicking on What is R Pool
		function.whatIsRpoolclick();
		logger.info("Clicked successfully on What is Rpool Button"); 
		
		//validating the title of the page
				assertTrue(driver.getTitle().contains("rPool"));
				logger.info("Validation of title successful");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("test case- Checking functionality of Rpool page 1 passed "); 
}
	
	
	//test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality2() {

		extentTest = extent.startTest("Checking Rpool Page functionality");
		
		// calling methods from RpoolPage
		RpoolPage function = new RpoolPage(driver);
		function.ClickOnRpool();

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//calling the method for clicking on How it Works button
		function.HowItWorksClick();
		logger.info("Clicked successfully on How it works Button");
		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		logger.info("Validation of title successful");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//calling the method for clicking on Offer Rides
		function.OfferRidesClick();
		logger.info("Clicked successfully on Offer Rides Button");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("test case- Checking functionality of Rpool page 2 passed "); 	
	}
	
	// test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality3() {

		extentTest = extent.startTest("Checking Rpool Page - Corporate button functionality");
		
		// calling methods from RpoolPage
		RpoolPage function = new RpoolPage(driver);
		function.ClickOnRpool();
		logger.info("Clicked successfully on Rpool Button");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//calling the method for clicking on Corporate Button
		function.CorporateClick();
		logger.info("Clicked successfully on Corporate Button");
		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		logger.info("Validaton of title of page successful");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("test case- Checking functionality of Rpool page 3 passed "); 
	}

	// test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality4() {

		extentTest = extent.startTest("Checking Rpool Page RWAs button functionality");

		// calling methods from RpoolPage
		RpoolPage function = new RpoolPage(driver);
		function.ClickOnRpool();
		logger.info("Clicked successfully on Rpool Button");
		
		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//calling the method for clicking on rpool for RWAs
		function.RWAsClick();
		logger.info("Clicked successfully on RWAs Button");
		
		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		logger.info("Validation of the page title successful");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("test case- Checking functionality of Rpool page 4 passed "); 

	}


	// test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality5() {

		extentTest = extent.startTest("Checking Rpool Page - FAQ button functionality");

		// calling methods from RpoolPage
		RpoolPage function = new RpoolPage(driver);
		function.ClickOnRpool();
		logger.info("Clicked successfully on Rpool Button");
		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// calling the method for clicking on FAQ button
		function.FAQbuttonClick();
		logger.info("Clicked successfully on FAQ Button");
		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		logger.info("Validation of Page title successful");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("test case- Checking functionality of Rpool page 5 passed "); 

	}

	
}
