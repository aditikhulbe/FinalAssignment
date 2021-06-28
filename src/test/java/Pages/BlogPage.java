package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {

	
	// initializing the web driver
	WebDriver driver;

	public BlogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

			}

	// locator for Blog button
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Blog')]")
	public WebElement Blog;

	// method for clicking on Blog button
	public void ClickOnBlog() {
		Blog.click();
	}
	
	// locator for Search button
	@FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[@id='content']/div[1]/aside[1]/section[1]/form[1]/label[1]/input[1]")
	public WebElement Search;

	// method for typing in the Search button
	public void ClickOnSearch(String string) {
		Search.sendKeys(string);
	}

	// method for changing the new browser window
	static String winHandleBefore;

	public void changeWindow() {
		winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	// method for closing the new browser window

	public void closeWindow() {
		driver.close();
		driver.switchTo().window(winHandleBefore);
	}
			

}
