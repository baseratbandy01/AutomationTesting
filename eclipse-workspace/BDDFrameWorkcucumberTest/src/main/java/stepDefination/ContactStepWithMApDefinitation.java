package stepDefination;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
@RunWith(Cucumber.class)
//data table with maps  
public class ContactStepWithMApDefinitation {
	WebDriver driver;
	String title;
	 @Given("^User is already on login page$")
	    public void user_is_already_on_login_page() throws Throwable {
		 System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
	        
	        	    }
	 
	    @When("^title of login page is Free CRM$")
	    public void title_of_login_page_is_free_crm() throws Throwable {
	    	driver.get("https://www.freecrm.com");
	    	title=(driver.getTitle());
	    	Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	    }

	    @Then("^user enters username and password$")
	    public void user_enters_username_and_password(DataTable credentials) throws Throwable {
	    
	    	for(Map<String,String> data=credentials.asMap(String.class, String.class);;) {
	    
	       driver.findElement(By.name("username")).sendKeys(data.get("username"));
	        driver.findElement(By.xpath("//*[@type='password']")).sendKeys(data.get("password"));
	        
	       	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	}
	    }

	    @Then("^user click on login button$")
	    public void user_click_on_login_button() throws Throwable {
	    	WebElement submit=driver.findElement(By.xpath("//*[@type='submit']"));
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", submit);
	    }


	    @Then("^user move on contact tab$")
	    public void user_move_on_contact_tab() throws Throwable {
	    	driver.switchTo().frame("mainpanel");
	    	Actions action=new Actions(driver);
	    	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	    	driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	        
	    }

	    @Then("^user enters contact deatils firstname and lastname and position$")
	    public void user_enters_contact_deatils(DataTable details) throws Throwable {
	    	
	    	for(Map<String,String> personDetails=details.asMap(String.class, String.class);;) {
	    		
	       driver.findElement(By.id("first_name")).sendKeys(personDetails.get("firstname"));
	       driver.findElement(By.id("surname")).sendKeys(personDetails.get("lastname"));
	       driver.findElement(By.id("company_position")).sendKeys(personDetails.get("positon"));
	       driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	       //move to new deal 
	       Actions action=new Actions(driver);
	    	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	    	driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	        	       
	       driver.close();
	    	}
	    }
	      
	    
	   /* @Given("^user will click on feature tab$")
	    public void user_will_click_on_feature_tab() throws Throwable {
	    	System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.freecrm.com");
	        
	        
	      WebElement navBar= driver.findElement(By.linkText("Features"));
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", navBar);
	    }

	    @When("^user will land on feature tab user will click on home button$")
	    public void user_will_land_on_feature_tab_user_will_click_on_home_button() throws Throwable {
	    	WebElement home=driver.findElement(By.linkText("Home"));
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", home);
	    }

	    @Then("^close browser$")
	    public void driver_web_page_should_get_close() throws Throwable {
	        driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.close();
	    }*/


}
