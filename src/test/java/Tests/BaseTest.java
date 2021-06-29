package Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import utils.ExcelFileIO;
import utils.Screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

	//initializing the driver
	static WebDriver driver;

	public static Logger logger = Logger.getLogger(BaseTest.class); // defining logger
	public static String LOG_FILE = ".\\Resources\\log4j.properties"; // location of the log file
	static FileInputStream logfile = null;

	public static ExtentReports extent;
	public static ExtentTest extentTest;

	static File file = new File(".\\Resources\\config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();

	public static ExcelFileIO reader = null;
	 
	static {
		try {
			fis = new FileInputStream(file);
			logfile = new FileInputStream(LOG_FILE);
			PropertyConfigurator.configure(logfile);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
			prop.load(logfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {

			 

            reader = new ExcelFileIO(".\\Resources\\Data.xlsx");
        }
        catch(Exception e) {

 

            logger.error(e.getMessage());
        }
    }
	
	

	@BeforeSuite
	public void setExtent() {
		extent = new ExtentReports(".\\Reports\\ExtentReport.html");
		extent.addSystemInfo("UserNameAutomation", "Aditi");
	}


	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}
	@AfterMethod
	public void attachScreenshot(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshotPath = Screenshots.takeScreenShot(driver, result.getName());
			System.out.println(screenshotPath);
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test case passed successfully");
		}
		extent.endTest(extentTest);
	}

	@BeforeMethod
	public static void intializeWebdriver() {
		String type = prop.getProperty("BrowserType");
		type = type.toLowerCase();
		switch(type) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			ChromeOptions chromeoption= new ChromeOptions();
			chromeoption.setHeadless(false); //headless mode option
			driver = new ChromeDriver(chromeoption); // driver to open Chrome
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
			FirefoxOptions foxoption= new FirefoxOptions();
			foxoption.setHeadless(true);//headless mode option
			driver = new FirefoxDriver(foxoption); //driver to open firefox
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver",".\\Drivers\\msedgedriver.exe");       
			driver = new EdgeDriver();//driver to open edge
			break;

		}



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     //IMPLICIT WAIT
	}

	@BeforeMethod //method to open the url 
	public static void openBrowser() {
		driver.get(prop.getProperty("url"));
	}


	@AfterMethod //method to close the browser
	public static void closeBrowser() {
		extent.endTest(extentTest);
		driver.close();
	}

}


