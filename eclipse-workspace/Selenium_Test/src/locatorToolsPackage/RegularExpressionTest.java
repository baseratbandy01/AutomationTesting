package locatorToolsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegularExpressionTest {
	WebDriver driver;
	public RegularExpressionTest(WebDriver driver) {
		this.driver=driver;
		}//end constructor
	
	By signIn=By.cssSelector("a[title*='Sign in']");
//	By user=By.xpath("//input[contains(@id,'login1')]");
	By user=By.xpath("//*[@id='login1']");
	By pwd=By.cssSelector("input#password");
	By logIn=By.name("proceed");
	By checkBox=By.cssSelector("input[type*='checkbox']");
	
	public WebElement SignIn() {
		return driver.findElement(signIn);
	}//end signIn method
	
	public WebElement Username() {
		return driver.findElement(user);
	}//end username method
	
	public WebElement Password() {
		return driver.findElement(pwd);
	}//end password method
	
	public WebElement GoButton() {
		return driver.findElement(logIn);
	}//end gobutton method
	public WebElement CheckBox() {
		return driver.findElement(checkBox);
	}//end checkBoxmethod
}//end class
