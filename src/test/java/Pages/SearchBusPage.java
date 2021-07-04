package Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBusPage {

	// initializing the web driver
	WebDriver driver;

	public SearchBusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// locators for searching
	
	//clicking on the Book Tickets button 
	@FindBy(how = How.XPATH, using = "//a[@id='redBus']")
	public WebElement bookTickets;
	
	// source location
	@FindBy(how = How.XPATH, using = "//input[@id='txtSource']")
	public WebElement source_location;
    
	//destination location
	@FindBy(how = How.XPATH, using = "//input[@id='txtDestination']")
	public WebElement destination_location;
	
	//search busses button
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Search_busses;
	
	//method for clicking on Book Tickets
	public void BookTicketsBus() {
		bookTickets.click();
	}
	
	//method for entering the source location
    public void EnterSourceLocation(String from) {
	
    source_location.sendKeys(Keys.DOWN);
    source_location.sendKeys(Keys.DOWN);
    source_location.sendKeys(Keys.ENTER);
  }
 
    //method for entering the destination location
	public void EnterDestLocation(String To) {

		destination_location.sendKeys(Keys.DOWN);
		destination_location.sendKeys(Keys.ENTER);

	}
	
	//method for clicking on Search
	public void ClickSearch() {
		Search_busses.click();
	}
		
	
		
	}
	




