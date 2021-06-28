package Tests;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void logininclick() throws Throwable {

		//extent reporting
		extentTest = extent.startTest("Valid scenario for Sign up");

     //creating object for methods of LoginPage
		LoginPage login = new LoginPage(driver);
		
		//calling the methods for LoginPage
		login.iconClick();
		login.signInClick();
		login.GoogleSignInClick(); 
        login.EnterEmail();
        
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void invalidLogin() {

		//extent reporting
		extentTest = extent.startTest("Invalid scenario for Sign up");
		
		LoginPage login = new LoginPage(driver);
		
		//calling methods from LoginPage
		login.iconClick();
		login.signInClick();
		login.enterMobileNumber();
		//login.captcha();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
		
	}

}
