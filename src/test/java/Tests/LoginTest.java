package Tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.LoginPage;
import utils.CommonUtils;

public class LoginTest extends BaseTest {
	// defining the Excel sheet name
	private String sheetName = "LoginPage";

	@Test
	public void invalidLogin() {
		
		
		// fetching the data from Excel Sheet
		String MobileNumber = "InvalidLogin";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, MobileNumber);

		String executionRequired = testData.get("Execution").toLowerCase();

		// if execution required field is no
		CommonUtils.toCheckExecutionRequired(executionRequired);
				        				
		//extent reporting
		extentTest = extent.startTest("Invalid scenario for Sign up");
		
		LoginPage login = new LoginPage(driver);
		
		//calling methods from LoginPage
		login.iconClick();
		logger.info("Clicked on Sign In Icon"); 
		login.signInClick();
		logger.info("Clicked on Sign In Button"); 
		login.enterMobileNumber(testData.get("MobileNumber"));
		logger.info("Entered an invalid mobile number"); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		logger.info("Test Case- Checking Login Page functionality Passed"); 
		
		
	}

}
