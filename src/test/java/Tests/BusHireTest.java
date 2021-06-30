package Tests;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BusHirePage;
import utils.CommonUtils;

public class BusHireTest extends BaseTest {

	
	private String sheetName = "BusHirePage";

	 

    @Test()
    public void whenUserEntersValidInformationForOutstation() throws InterruptedException {

 

        String testName = "whenUserEntersValidInformationForOutstation";
        HashMap<String, String> testData = new HashMap<String, String>();
        testData = reader.getRowTestData(sheetName, testName);

 

        String pickUpLocation = testData.get("Pickup Location");
        String destinationLocation = testData.get("Destination Location");
        String numberOfPassengers = testData.get("Number of Passengers");
        String fromDateAndTimeVal = testData.get("From Date and Time");
        String tillDateAndTimeVal = testData.get("Till Date and Time");
        String expectedResult = testData.get("Expected Result");
        String executionRequired = testData.get("Execution").toLowerCase();
        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired);
        BusHirePage busHirePage = new BusHirePage(driver);

 
     // extent reporting
     	extentTest = extent.startTest("Checking Bus Hire Page functionality");

      

 

        busHirePage.clickonBusHire();
        logger.info("Bus Hire link was clicked");

 

        busHirePage.clickOnOutstationMenu();
        logger.info("OutStation Menu was selected");

 

        busHirePage.enterPickUpLocation(pickUpLocation);
        logger.info(pickUpLocation+" location was entered");

 

        busHirePage.enterDropLocation(destinationLocation);
        logger.info(destinationLocation+" location was entered");

 

        busHirePage.enterDateAndTimeForOutstation(fromDateAndTimeVal, tillDateAndTimeVal);;
        logger.info(fromDateAndTimeVal+" and "+tillDateAndTimeVal+" was entered");

 

        busHirePage.enterNumberOfPassengers(numberOfPassengers);
        logger.info(numberOfPassengers+" was entered");

 

        busHirePage.clickOnProceedButtonOnOutstationMenu();
        logger.info("Proceed Button was clicked");

 

        String actualResult = driver.findElement(By.xpath("//*[@class = 'headerlabelsummary']")).getText().toLowerCase();
        logger.info("Actual Result : "+actualResult);

 

        Assert.assertTrue(actualResult.contains(expectedResult.toLowerCase()), "Assertion on actual and expected result of header summary label");
    }
}
