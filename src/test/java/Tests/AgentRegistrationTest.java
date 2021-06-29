package Tests;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import Pages.AgentRegistrationPage;
import utils.CommonUtils;

public class AgentRegistrationTest extends BaseTest {
	// defining the Excel sheet name
		private String sheetName = "AgentLogin";
	
	// test scenario for checking Agent Registration Page functionality
			@Test
			public void RegAgentFunctionality() {
				
				//fetching the data from Excel Sheet
				String username = "AgentWantstoLogin";
		        HashMap<String, String> testData = new HashMap<String, String>();
		        testData = reader.getRowTestData(sheetName, username);
		        String password = "AgentWantstoLogin";
		        testData = reader.getRowTestData(sheetName, password);
		 
		        
		        String executionRequired = testData.get("Execution").toLowerCase();
		        
		        // if execution required field is no
		        CommonUtils.toCheckExecutionRequired(executionRequired);
		        
				// extent reporting
				extentTest = extent.startTest("Checking Agent Page Registration page functionality");

				// scrolling down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,4500)", "");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
								

				// creating an object for the methods of Agent Reg Page
				AgentRegistrationPage agent = new AgentRegistrationPage (driver);

				// calling methods from Agent Reg Page
				agent.ClickOnReg();
				
				logger.info("Clicked successfully on Agent Registration Button"); 
				
				agent.changeWindow();
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				agent.ClickOnLogin();
				agent.EnterUsername(testData.get("username"));
				agent.EnterPassword(testData.get("password"));
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				agent.ClickLoginButton();
				
				logger.info("Clicked successfully on Login Agent Button"); 
				
				agent.closeWindow();
				
				logger.info("Test Case- Checking Agent Login functionality Passed"); 

			}

		}
