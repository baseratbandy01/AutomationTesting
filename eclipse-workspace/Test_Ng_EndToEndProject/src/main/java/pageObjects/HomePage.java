package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By goAnotherTab=By.xpath("//*[@id='MainNavigation']/div/ul/li[13]");
	By goHomeWear=By.xpath("//*[@id='smallItemsContainer']/div[3]");
	
	public WebElement goClearance() {
		return driver.findElement(goAnotherTab);
	}
	public WebElement goHomeShopping() {
		return driver.findElement(goHomeWear);
	}
}