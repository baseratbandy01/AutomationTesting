package seleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAutomationCallingClass {
	static WebDriver driver;
	static SpiceJet_HandlingStaticDropDown dropDown;
	//static String url="https://www.spicejet.com";
	static String url="https://www.makemytrip.com";
	static MakeMyTripWebSite myTrip;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		myTrip=new MakeMyTripWebSite(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myTrip.MultiCity().click();
		myTrip.PlaceFrom().sendKeys("DEL",Keys.ENTER);
		myTrip.PlaceTo().sendKeys("GOI",Keys.ENTER);
		myTrip.PlaceFrom().sendKeys("HYD",Keys.ARROW_DOWN.ENTER);
		myTrip.PlaceTo().sendKeys("DEL",Keys.ENTER);
		dropDown=new SpiceJet_HandlingStaticDropDown(driver);
		dropDown.roundTrip().click();
	//	this is the way if you got select tagname the below method can be applied 
				Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
				//selectByValue this is for drop down where we need to give value 
				s.selectByValue("AMD");
				Select arrival=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1")));
				arrival.selectByValue("ATQ");
				
			dropDown.DepartureDate();
			
			/*Actions a= new Actions(driver);
				a.moveToElement(driver.findElement(By.xpath("//*[@class='ui-state-default']"))).click().build().perform();*/
				
				/*dropDown.selectPassenger().click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//div[@class='adult-popup']//div[1]//div[2]//span[3]")).click();
				//dropDown.AdultPassenger().click();
				//dropDown.ChildPassenger().click();
				dropDown.Done();*/
				
	}//end main method

}//end class
