package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class LoginPage2 {
public WebDriver driver;

By EmailAddress=By.xpath("//*[@type='email']");
By Password=By.id("pass");
By Submit=By.xpath("//*[@value='Log In']");

public LoginPage2(WebDriver driver) {
	this.driver=driver;
 }
	public WebElement getEmail() {
		return driver.findElement(EmailAddress);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement submitButton() {
		return driver.findElement(Submit);
	}
	@DataProvider
	//if i say size of array is 5{01,2,3,4}not 5 as well
	public static Object[][] LoginDetails() {
		Object [][] pageDetails=new Object[1][2];
		//Object[][] pageDetails1=new Object[2][];

		/*pageDetails[0][0]="irfan_sheikh@hotmail.com";
		pageDetails[0][1]="Aamina10!";*/
		//pageDetails[0][2]="passowrdincorrect";
		
		pageDetails[0][0]="aaminah@hotmail.com";
		pageDetails[0][1]="123410!";
		//pageDetails[1][2]="againincorrectt";*/
		return pageDetails;
		
	}

}
