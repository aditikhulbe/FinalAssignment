package Tests;

import org.testng.annotations.Test;

import Pages.BusHirePage;

public class BusHireTest extends BaseTest {

	//private String sheetName = "BusHirePageTestData";

	 

    @Test()
    public void whenUserEntersValidInformationForOutstation() throws InterruptedException {

 

       // String testName = "whenUserEntersValidInformationForOutstation";
       // HashMap<String, String> testData = new HashMap<String, String>();
       // testData = reader.getRowTestData(sheetName, testName);

 

      /*  String pickUpLocation = testData.get("Pickup Location");
        String destinationLocation = testData.get("Destination Location");
        String numberOfPassengers = testData.get("Number of Passengers");
        String fromDateAndTimeVal = testData.get("From Date and Time");
        String tillDateAndTimeVal = testData.get("Till Date and Time");
        String expectedResult = testData.get("Expected Result");
        String executionRequired = testData.get("Execution Required").toLowerCase();
        // if execution required field is no
        CommonUtils.toCheckExecutionRequired(executionRequired); */
    	
    	
    	//extent reporting
		extentTest = extent.startTest("Checking Bus Hire Page functionality");
    			
    			
    	
        BusHirePage hire = new BusHirePage(driver);

 

     hire.ClickOnBusHire();
     hire.clickOnOutstationMenu();
     hire.enterPickUpLocation("New Delhi metro station");
     hire.enterDropLocation("Punjab");
     hire.enterDateAndTimeForOutstation("27-06-2021-10:30 PM", "28-06-2021-10:30 PM");
     hire.enterNumberOfPassengers("20");
     hire.clickOnProceedButtonOnOutstationMenu();
     
    
      

 

       // String actualResult = driver.findElement(By.xpath("//*[@class = 'headerlabelsummary']")).getText().toLowerCase();
    

 

      //  Assert.assertTrue(actualResult.contains(expectedResult.toLowerCase()), "Assertion on actual and expected result of header summary label");
    }
}


