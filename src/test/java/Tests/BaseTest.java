package Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utils.ExcelFileIO;
import ScreenshotJar.Screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseTest {

	// initializing the driver
	static WebDriver driver;

	public static Logger logger = Logger.getLogger(BaseTest.class); // defining logger
	public static String LOG_FILE = ".\\Resources\\log4j.properties"; // location of the log file
	static FileInputStream logfile = null;
	public static RemoteWebDriver remotedriver;

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
		} catch (Exception e) {

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

	@AfterMethod //method to attach screenshot in case of failure
	public void attachScreenshot(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshotPath = Screenshots.takeScreenshot(driver, result.getName());
			System.out.println(screenshotPath);
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test case passed successfully");
		}
		extent.endTest(extentTest);
	}


	@BeforeMethod //method for initializing the browsers
	public static void intializeWebdriver() throws MalformedURLException {
		
		String type = prop.getProperty("BrowserType");
		switch (type) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			ChromeOptions chromeoption = new ChromeOptions();
			chromeoption.setHeadless(false); // headless mode option..change to true for headless
            chromeoption.addArguments("--disable-gpu");
            chromeoption.addArguments("--disable-dev-shm-usage");
            chromeoption.addArguments("--no-sandbox");
            chromeoption.addArguments("--allow-insecure-localhost");
            chromeoption.addArguments("user-agent=Chrome/91.0.4472.124");
            chromeoption.addArguments("window-size=1920,1080");
            driver = new ChromeDriver(chromeoption); // driver to open Chrome
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			FirefoxOptions foxoption = new FirefoxOptions();
			foxoption.setHeadless(false);// headless mode option..change to true for headless
			driver = new FirefoxDriver(foxoption); // driver to open firefox
			break;
		case "internetexplorer":
			 //driver to open Internet Explorer
			 System.setProperty("webdriver.ie.driver",".\\Drivers\\IEDriverServer.exe");
			 InternetExplorerOptions ie = new InternetExplorerOptions();  
			 ie.ignoreZoomSettings(); 
			 driver = new InternetExplorerDriver();
			 driver.manage().window().maximize();
			 
		case "docker":
			driver = runInDocker(); //calling the method to run in Docker
			driver.get(prop.getProperty("url"));
				
		}
	
	

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // IMPLICIT WAIT
	}

//method for implementing docker
	private static WebDriver runInDocker() throws MalformedURLException {
		 final ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-gpu");
		    options.addArguments("--disable-dev-shm-usage");
		    options.addArguments("--no-sandbox");
		    options.addArguments("--allow-insecure-localhost");
		    options.addArguments("window-size=1920,1080");
		    options.addArguments("user-agent=Chrome/91.0.4472.124");
		    URL url = new URL("http://localhost:4449/wd/hub");
		    remotedriver = new RemoteWebDriver(url,options);
		    remotedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return remotedriver;
		
	}
		{
			
		try {
			driver = runInDocker();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));
		
		//return null;
	}

	@BeforeMethod // method to open the url
	public static void openBrowser() {
		driver.get(prop.getProperty("url"));
		
	
	}

	@AfterMethod // method to close the browser
	public static void closeBrowser() {
		extent.endTest(extentTest);
		driver.close();
	}

}
