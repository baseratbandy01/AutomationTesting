/*package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.junit.Cucumber;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
public class DealStepDefinitions {
	WebDriver driver;
	 @Given("^User is already on login page$")
	    public void user_is_already_on_login_page() throws Throwable {
		 System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
	    }

	    @When("^title of login page is Free CRM$")
	    public void title_of_login_page_is_free_crm() throws Throwable {
	    	driver.get("https://www.freecrm.com");
	    }

	    @Then("^user enters username and password$")
	    public void user_enters_username_and_password(DataTable crendentials) throws Throwable {
	    	List<List<String>> data=crendentials.raw();
	    	 WebElement username=driver.findElement(By.name("username"));
		        WebElement pwd=driver.findElement(By.xpath("//*[@type='password']"));
		        //username.click();
		        username.sendKeys(data.get(0).get(0));
		        //pwd.click();
		        pwd.sendKeys(data.get(0).get(1));
	        
	    }

	    @Then("^user click on login button$")
	    public void user_click_on_login_button() throws Throwable {
	    	WebElement submit=driver.findElement(By.xpath("//*[@type='submit']"));
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", submit);
	    }

	    @Then("^user moves to new deal page$")
	    public void user_moves_to_new_deal_page() throws Throwable {
	    	driver.switchTo().frame("mainpanel");
	    	Actions action=new Actions(driver);
	    	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	    	driver.findElement(By.xpath("//a[contains(text)().'New Deal']")).click();
	    	
	    }

	    @Then("^user enters deal details$")
	    public void user_enters_deal_details(DataTable dealData) throws Throwable {
	    	List<List<String>>deatils=dealData.raw();
	    	driver.findElement(By.id("title")).sendKeys(deatils.get(0).get(0));
	    	driver.findElement(By.id("amount")).sendKeys(deatils.get(0).get(1));
	    	driver.findElement(By.id("probability")).sendKeys(deatils.get(0).get(2));
	    	driver.findElement(By.id("commission")).sendKeys(deatils.get(0).get(3));
	    	
	    }

	    @Then("^close browser$")
	    public void close_browser() throws Throwable {
	        driver.close();
	        
	    }

	}



*/