package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpiceJet_HandlingStaticDropDown {
static	WebDriver driver;
	public SpiceJet_HandlingStaticDropDown(WebDriver driver) {
		this.driver=driver;
	}
	
	By trip=By.xpath("//*[@value='RoundTrip']");
	By departdate=By.xpath("//*[@id='ui-datepicker-div']/div[2]/table");
	By passanger=By.id("divpaxinfo");
	By adults=By.id("hrefIncAdt");
	By child=By.id("hrefIncChd");
	//By child=By.id("divChild");
	By submit=By.id("btnclosepaxoption");
	
	
	public WebElement roundTrip() {
		return driver.findElement(trip);
	}
	
	public WebElement DepartureDate() {
		return driver.findElement(departdate);
	}
	
	public WebElement selectPassenger() {
		return driver.findElement(passanger);
	}
	public WebElement AdultPassenger() {
		return driver.findElement(adults);
	}
	
	public WebElement ChildPassenger() {
		return driver.findElement(child);
	}
	public WebElement Done() {
		return driver.findElement(submit);
	}
}
