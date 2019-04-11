package endToEnd_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpiceJetEndToEndTest {
	WebDriver driver;
	String url="https://www.spicejet.com";
	public SpiceJetEndToEndTest(WebDriver driver) {
		this .driver=driver;
		driver.get(url);
				}//end constructor
	
	By trip=By.xpath("//*[@value='RoundTrip']");
	By fromWhere=By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
	By value=By.xpath("//*[@value='DEL']");
	By destination=By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
	By GoingOn= By.xpath("//span[@id='view_fulldate_id_1']");
	By comingBackOn=By.xpath("//span[@id='view_fulldate_id_2']");
	By Adult=By.xpath("//div[@id='divpaxinfo'] //div[@id='divpaxinfo']");
	 By checkBox=By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']");
	 By search=By.xpath("//*[@type='submit']");
	 
	public WebElement roundTrip() {
		return driver.findElement(trip);
	}
	
	public WebElement DepartureCity() {
		return driver.findElement(fromWhere);
	}
	public WebElement ArrivaCity() {
		return driver.findElement(destination);
	}
	public WebElement DepartDate() {
		return driver.findElement(GoingOn);
	}
	public WebElement ReturnDate() {
		return driver.findElement(comingBackOn);
	}
	public WebElement Passengers() {
		return driver.findElement(Adult);
	}
	public WebElement SeniorCitizen() {
		return driver.findElement(checkBox);
	}
	public WebElement Submit() {
		return driver.findElement(search);
	}
	
	public WebElement Value() {
		return driver.findElement(value);
	}
}//end class
