package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBaseClass;

public class HomePage extends TestBaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(xpath= "//td[contains(text(),'User: Naveen K')]")
	@CacheLookup
	WebElement userNameLabel;*/
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewContactLink;
	
	
	/*public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}*/
	public void clickOnContactPage() {
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(ContactLink).build().perform();
		NewContactLink.click();
	}
	
	

}