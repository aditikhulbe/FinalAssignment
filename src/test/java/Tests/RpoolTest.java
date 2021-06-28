package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.RpoolPage;

public class RpoolTest extends BaseTest {

	//test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality() {

		extentTest = extent.startTest("Checking Rpool Page functionality");


		//calling methods from RpoolPage
		RpoolPage function = new RpoolPage(driver);
		function.ClickOnRpool();
		
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
		
		//validating the title of the page
				assertTrue(driver.getTitle().contains("rPool"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//calling the method for clicking on Offer Rides
		function.OfferRidesClick();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	// test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality3() {

		extentTest = extent.startTest("Checking Rpool Page - Corporate button functionality");
		
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

		//calling the method for clicking on Corporate Button
		function.CorporateClick();

		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality4() {

		extentTest = extent.startTest("Checking Rpool Page RWAs button functionality");

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

		//calling the method for clicking on rpool for RWAs
		function.RWAsClick();
		
		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	// test scenario for checking Rpool page functionality
	@Test
	public void RpoolFunctionality5() {

		extentTest = extent.startTest("Checking Rpool Page - FAQ button functionality");

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

		// calling the method for clicking on FAQ button
		function.FAQbuttonClick();

		//validating the title of the page
		assertTrue(driver.getTitle().contains("rPool"));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
