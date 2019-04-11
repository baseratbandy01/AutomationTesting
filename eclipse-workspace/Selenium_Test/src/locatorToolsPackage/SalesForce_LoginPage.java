package locatorToolsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForce_LoginPage {
	WebDriver driver;
public SalesForce_LoginPage (WebDriver driver) {
	this.driver=driver;
		}//end constructor

By email=By.id("username");
By pwd=By.name("pw");
By submit=By.id("Login");

public WebElement UserName() {
	return driver.findElement(email);
}

public WebElement Password() {
	return driver.findElement(pwd);
}

public WebElement LogIn() {
	return driver.findElement(submit);
}

}//end class
