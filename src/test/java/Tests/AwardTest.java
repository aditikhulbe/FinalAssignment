package Tests;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.AwardsPage;


public class AwardTest extends BaseTest{

	// test scenario for checking Awards page functionality 1
	@Test
	public void AwardPageTest() {
		
        
        //extent reporting
		extentTest = extent.startTest("Checking Awards page functionality");

		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// creating an object to call methods from AwardsPage
		AwardsPage award = new AwardsPage(driver);
		
		//calling methods from AwardsPage
		
		award.ClickOnAward1();
		award.changeWindow();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("Clicked on Business Standard successfully");

		
		// scrolling down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,700)", "");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	    award.closeWindow(); //closing the new window	
		logger.info("Test Case- checking the funtionality of Awards page Passed");
	
}
	
	
	
	// test scenario for checking Awards page functionality 2
		@Test
		public void AwardPageTest2() {
			
	        
	        //extent reporting
			extentTest = extent.startTest("Checking Awards page functionality 2");

			// scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// creating an object to call methods from AwardsPage
			AwardsPage award = new AwardsPage(driver);
			
			//calling methods from AwardsPage
			
			award.ClickOnAward2();
			award.changeWindow();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logger.info("Clicked on Most trusted brand successfully");

			
			// scrolling down
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,700)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		    award.closeWindow(); //closing the new window	
			logger.info("Test Case- checking the funtionality of Awards page 2 Passed");
		
	}
		
		
		// test scenario for checking Awards page functionality 3
				@Test
				public void AwardPageTest3() {
					
			        
			        //extent reporting
					extentTest = extent.startTest("Checking Awards page functionality 3");

					// scrolling down
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,2500)", "");

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// creating an object to call methods from AwardsPage
					AwardsPage award = new AwardsPage(driver);
					
					//calling methods from AwardsPage
					
					award.ClickOnAward3();
					award.changeWindow();
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					logger.info("Clicked on Eye for travel button successfully");

					
					// scrolling down
					JavascriptExecutor js1 = (JavascriptExecutor) driver;
					js1.executeScript("window.scrollBy(0,700)", "");

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							
				    award.closeWindow(); //closing the new window	
					logger.info("Test Case- checking the funtionality of Awards page 3 Passed");
				
			}		
}

