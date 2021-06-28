package Tests;



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
	   career.changeWindow();
	   
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		career.ClickOnHirist();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		career.closeWindow();
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		career.changeWindow();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// closing the new Window
		career.closeWindow();
		

	}

}
