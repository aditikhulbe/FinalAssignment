package Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import Pages.BlogPage;

public class BlogTest extends BaseTest {

	
	// test scenario for checking Blog Page functionality
		@Test
		public void BlogPageFunctionality() {

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
			blog.changeWindow();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			//validating the title of the page
			assertTrue(driver.getTitle().contains("redBus Blog"));
			
			
			
			blog.ClickOnSearch("friends");
			
			
			//to enter the value in Search box
			driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/aside[1]/section[1]/form[1]/label[1]/input[1]")).sendKeys(Keys.ENTER); 
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			//for closing the window
			blog.closeWindow();
		
		}


}
