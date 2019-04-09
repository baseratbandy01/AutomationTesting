package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
public WebDriver driver;
Actions a=new Actions(driver);

By searchBox = By.xpath("//*[@id='lst-ib']");
By clickSearch=By.xpath("//*[@id='mKlEF']/span/svg");
By Loginfacebook=By.linkText("Facebook – log in or sign up");

public LandingPage(WebDriver driver) {
	this.driver=driver;
 }
	public WebElement getsearchButton() {
		return driver.findElement(searchBox);
	}
	public WebElement getsearchClick() {
		return driver.findElement(clickSearch);
	}
	
	public Actions getLogin() {
		return a.moveToElement((WebElement) By.className("LC20lb"));
	}
	


}
