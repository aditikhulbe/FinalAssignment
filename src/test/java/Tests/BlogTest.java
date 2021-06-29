package Tests;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import Pages.BlogPage;
import utils.CommonUtils;

public class BlogTest extends BaseTest {
	// defining the Excel sheet name
		private String sheetName = "Blog";
	
	// test scenario for checking Blog Page functionality
		@Test
		public void BlogPageFunctionality() {
			
			//fetching the data from Excel Sheet
			String TypeInSearch = "BlogSearch";
	        HashMap<String, String> testData = new HashMap<String, String>();
	        testData = reader.getRowTestData(sheetName, TypeInSearch);
	       
	 
	        
	        String executionRequired = testData.get("Execution").toLowerCase();
	        
	        // if execution required field is no
	        CommonUtils.toCheckExecutionRequired(executionRequired);
			// extent reporting
			extentTest = extent.startTest("Checking Blog page functionality");

			// scrolling down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4500)", "");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			//creating an object for the methods of BlogPage
			BlogPage blog = new BlogPage(driver);
			
			//calling methods from BlogPage
			blog.ClickOnBlog();
			
			logger.info("Clicked successfully on Blog Button"); 
			
			blog.changeWindow();
			
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			
			//validating the title of the page
			assertTrue(driver.getTitle().contains("redBus Blog"));
			
			logger.info("Successfully validated the title of page"); 
			
			blog.ClickOnSearch(testData.get("TypeInSearch"));
			
			
			//to enter the value in Search box
			driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/aside[1]/section[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER); 
			
			
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			
			
			
			//for closing the window
			blog.closeWindow();
			
			logger.info("Test Case- Checking Blog Page functionality Passed"); 
		
		}


}
