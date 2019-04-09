package ScratchRealTime.EndToEndProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.ExecutingClass;
import pageObjects.LandingPage;


public class HomePage extends ExecutingClass {
	LandingPage LP=new LandingPage(driver);
	
	
	@Test(priority=1)
	public void ExecutingClassNavigation() throws IOException {
		driver= initializeBrowser();
		driver.get("https://www.amazon.co.uk");
	//driver.get(prop.getProperty("url"));
	LandingPage LP=new LandingPage(driver);
	LP.getSearch().click();
	LP.getSearch().sendKeys("kids headphones");
	LP.submitButton().click();
	//LP.chooseItem().click();
	//LP.addToCart().click();
	//LP.checkCart().click();
		//System.out.println((LP.checkCart().isDisplayed()));
		
	}
	@AfterTest
	
	public void teardown(){
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.close();

		}

	
		
	}

