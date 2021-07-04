package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	//method for taking screenshot in case of failure
	public static String takeScreenShot(WebDriver driver, String testCaseName) {
		
		//format of the screenshot file
		String screenshotFileName = System.getProperty("user.dir") + "/FailedScreenshots/" + testCaseName + ".jpg";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(screenshotFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenshotFileName;
	}

}