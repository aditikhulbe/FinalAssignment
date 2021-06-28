package Tests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import Pages.AgentRegistrationPage;

public class AgentRegistrationTest extends BaseTest {

	
	// test scenario for checking Agent Registration Page functionality
			@Test
			public void RegAgentFunctionality() {

				// extent reporting
				extentTest = extent.startTest("Checking Agent Page Registartion page functionality");

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
				agent.changeWindow();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				agent.ClickOnLogin();
				agent.EnterUsername("aditi");
				agent.EnterPassword("abcde13");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				agent.ClickLoginButton();
				
				agent.closeWindow();

			}

		}
