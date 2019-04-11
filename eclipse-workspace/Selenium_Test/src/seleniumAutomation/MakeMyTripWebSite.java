package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeMyTripWebSite {
	static WebDriver driver;

	public MakeMyTripWebSite(WebDriver driver) {

	this.driver=driver;
	}
	
	By multicity=By.xpath("//*[@id='multicity']");
	By departFrom=By.xpath("//*[@id='hp-widget__sfrom']");
	By WhereTo= By.xpath("//*[@id='hp-widget__sTo']");
	By departDate=By.xpath("//*[@id='hp-widget__depart']");
	
	public WebElement MultiCity() {
		return driver.findElement(multicity);
	}

	public WebElement PlaceFrom() {
		return driver.findElement(departFrom);
	}

	public WebElement PlaceTo() {
		return driver.findElement(WhereTo);
	}
	
	
	
	
	
	
	
	
	
	
}
