package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import Tests.BaseTest;

public class BrowserUtils extends BaseTest {

	public static RemoteWebDriver openBrowserInHeadlessInDocker(String browser) throws MalformedURLException {
		
		InternetExplorerOptions ieOptions = null;
		if(browser.equals("chrome")) {
			final ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--no-sandbox");
			options.addArguments("--allow-insecure-localhost");
			options.addArguments("window-size=1920,1080");
			options.addArguments("user-agent=Chrome/91.0.4472.124");
			URL url = new URL("http://localhost:4444/wd/hub");
			remotedriver = new RemoteWebDriver(url,options);
			remotedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equals("firefox")) {
					
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			FirefoxOptions foxoption = new FirefoxOptions();
			foxoption.setHeadless(true);// headless mode option..change to true for headless
			driver = new FirefoxDriver(foxoption); // driver to open firefox
		}
		else if(browser.equals("ie")) {
			//no headless mode in ie
		}
		return remotedriver;

	}
	public static RemoteWebDriver openBrowserInNonHeadlessInDocker(String browser) throws MalformedURLException {
		if(browser.equals("chrome"))
		{
		final ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--allow-insecure-localhost");
		options.addArguments("window-size=1920,1080");
		options.addArguments("user-agent=Chrome/91.0.4472.124");
		URL url = new URL("http://localhost:4444/wd/hub");
		remotedriver = new RemoteWebDriver(url,options);
		remotedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equals("firefox")) {
			final FirefoxOptions options = new FirefoxOptions();		
			options.addArguments("window-size=1920,1080");
			URL url = new URL("http://localhost:4450/wd/hub");
			remotedriver = new RemoteWebDriver(url,options);
			remotedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return remotedriver;
	}
	public static WebDriver openBrowserInHeadlessInLocal(String browser) {
		InternetExplorerOptions ieOptions = null;
		ChromeOptions chromeOptions = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",prop.getProperty("path_chrome"));
			chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("headless");
			chromeOptions.addArguments("window-size=1920,1080");
			chromeOptions.addArguments("user-agent=Chrome/91.0.4472.124");
			driver = new ChromeDriver(chromeOptions);
		}
		else if(browser.equals("firefox")) {
			System.setProperty(prop.getProperty("firefox_driver"), prop.getProperty("firefox_path"));
			FirefoxBinary firefoxBinary = new FirefoxBinary();
			firefoxBinary.addCommandLineOptions("-headless");
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary(firefoxBinary);
			driver = new FirefoxDriver(options);
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", prop.getProperty("ie_path"));
			ieOptions = new InternetExplorerOptions();
			
			logger.info("IE doesn't support headless mode .... starting normal");
			driver = new InternetExplorerDriver(ieOptions);
		}
		return driver;
	}
	public static WebDriver openBrowserInNonHeadlessInLocal(String browserName) {
		if(browserName.equals("chrome")) {

		System.setProperty("webdriver.chrome.driver",prop.getProperty("path_chrome"));
		driver = new ChromeDriver();
		logger.info("Chrome driver initiated in head mode");
	}
	
	else if(browserName.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver",prop.getProperty("firefox_path"));
		driver = new FirefoxDriver();
		logger.info("Firefox driver initiated in head mode");
		
	}
	
	else if(browserName.equals("ie")) {
		
		System.setProperty("webdriver.ie.driver",prop.getProperty("ie_path"));
		driver = new InternetExplorerDriver();
		logger.info("IE driver initiated in head mode");
	}
	
	
	return driver;
	}
}
