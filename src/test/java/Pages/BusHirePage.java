package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.HelperClass;

public class BusHirePage {
	
	public WebDriver driver;

	public BusHirePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	 
        //locators
	
	//locator for Bus Hire button
	    @FindBy(how = How.ID, using = "redBus Bus Hire")
	    private WebElement busHireLink;

	 

	    @FindBy(how = How.XPATH, using = "//object")
	    private WebElement frameWindow;

	 
     //locator for Outstation button
	    @FindBy(how = How.XPATH, using = "//*[text() = 'Outstation']")
	    private WebElement outStationMenu;

	 
   
	    @FindBy(how = How.XPATH, using = "//*[@class='slider round']")
	    private WebElement sliderRound;

	 
      //locator for pick up Input textbox
	    @FindBy(how = How.ID, using = "locationTextFieldLocal")
	    private WebElement pickUpInput;

	 
      //locator for Destination Input textbox
	    @FindBy(how = How.ID, using = "local_dest_name")
	    private WebElement destinationInput;

	 
       //locator for adding From date and time
	    @FindBy(how = How.XPATH, using = "//*[@id='from_datepicker']/div/div/input")
	    private WebElement fromDateAndTimeForOutstation;

	 

	    @FindBy(how = How.XPATH, using = "//*[@id='to_datepicker']/div/div/input")
	    private WebElement toDateAndTimeForOutstation;

	 

	    @FindBy(how = How.XPATH, using = "//*[text() = 'OK']")
	    private WebElement dateAndTimeOkButton;

	 

	    @FindBy(how = How.ID, using = "numberOfPax")
	    private WebElement numberOfPassengerField;

	 

	    @FindBy(how = How.XPATH, using = "//button[@id='proceedButtonOutstation']")
	    private WebElement proceedButtonOnOutstation;

	 

	    @FindBy(how = How.XPATH, using = "//*[text() = 'Local']")
	    private WebElement localMenu;

	 

	    @FindBy(how = How.XPATH, using = "//*[@id='locationTextFieldLocal']")
	    private WebElement pickUpLocationOnLocalMenu;

	 

	    @FindBy(how = How.XPATH, using = "//input[@type = 'radio' and @value = '4']")
	    private WebElement selectPackage;

	 

	    @FindBy(how = How.XPATH, using = "//*[@class = 'MuiInputBase-input MuiInput-input']")
	    private WebElement dateAndTimeOnLocalMenu;

	 

	    @FindBy(how = How.ID, using = "numberOfPax")
	    private WebElement numberOfPassengersOnLocalMenu;

	 

	    @FindBy(how = How.ID, using = "proceedButtonLocal")
	    private WebElement proceedButtonLocal;

	 

	    @FindBy(how = How.XPATH, using = "//*[text() = 'Airport']")
	    private WebElement airPortMenu;

	 

	    @FindBy(how = How.XPATH, using = "//*[@class='select-selected']")
	    private WebElement citySelect;

	 

	    @FindBy(how = How.ID, using = "locationTextFieldLocal")
	    private WebElement destLocationFieldOnAirportMenu;

	 

	    @FindBy(how = How.XPATH, using = "//*[@id = 'ui-id-1']/li")
	    private WebElement searchLocationResult;

	 

	    @FindBy(how = How.XPATH, using = "//*[@id='from_datepicker']/div/div/input")
	    private WebElement fromDateAndTimeOnAirportMenu;

	 

	    @FindBy(how = How.ID, using = "numberOfPax")
	    private WebElement numberOfPassengersOnAirportMenu;

	 

	    @FindBy(how = How.ID, using = "proceedButtonAirport")
	    private WebElement proceedButtonOnAirportMenu;

	 

	    public void clickonBusHire() {
	    	busHireLink.click();	
	    	
	    }
	    public void clickOnOutstationMenu() {

	 

	        driver.switchTo().frame(frameWindow);
	        outStationMenu.click();
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

	 

	    public void clickOnSliderButton() {

	 

	        sliderRound.click();
	    }

	 

	    public void enterPickUpLocation(String pickUpLocation) {

	 

	        pickUpInput.sendKeys(pickUpLocation);
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        pickUpInput.sendKeys(Keys.DOWN);
	        pickUpInput.sendKeys(Keys.UP);
	        pickUpInput.sendKeys(Keys.RETURN);
	    }

	 

	    public void enterDropLocation(String dropLocation) {

	 

	        destinationInput.sendKeys(dropLocation);
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        destinationInput.sendKeys(Keys.DOWN);
	        destinationInput.sendKeys(Keys.UP);
	        destinationInput.sendKeys(Keys.ENTER);
	    }

	 

	    public void enterDateAndTimeForOutstation(String fromDateAndTimeVal , String tillDateAndTimeVal) throws InterruptedException {

	 

	        try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("window.scrollBy(0,1000)");
	         
	         JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("arguments[0].click()", fromDateAndTimeForOutstation);

	 


	        // selecting date and time
	        Thread.sleep(500);
	        try {
	            HelperClass.selectDateAndTimeAtBusHirePage(driver, fromDateAndTimeVal);
	        } catch (Exception e) {

	 

	            e.printStackTrace();
	        }
	        
	        toDateAndTimeForOutstation.click();
	        // selecting date and time
	        try {
	            HelperClass.selectDateAndTimeAtBusHirePage(driver, tillDateAndTimeVal);
	        } catch (Exception e) {

	 

	            e.printStackTrace();
	        }

	 

	    }

	 

	    public void enterNumberOfPassengers(String numberOfPassenger) throws InterruptedException {
	        
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("window.scrollBy(0,1000)");
	    
	            Thread.sleep(100);
	        
	        numberOfPassengerField.clear();
	        numberOfPassengerField.sendKeys(numberOfPassenger);
	    }

	 

	    public void clickOnProceedButtonOnOutstationMenu() throws InterruptedException {

	 

//	        Actions actionHH =  new Actions(driver);
//	        actionHH.moveToElement(proceedButtonOnOutstation).click().perform();
//	        proceedButtonOnOutstation.click();
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].scrollIntoView(true);", proceedButtonOnOutstation);    
	        proceedButtonOnOutstation.click();
	    
	            Thread.sleep(1000);
	        
	    }
}
