package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBaseClass;

public class LoginPage extends TestBaseClass {
	//Initializing the page object
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	//page factory
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	//Actions:
	
	public String ValidateLoginTitle() {
		String Title = driver.getTitle();
		return Title;
	}
	public HomePage login(String user,String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbutton);
		
		return new HomePage();//homepage class object will be reture here
	}

}