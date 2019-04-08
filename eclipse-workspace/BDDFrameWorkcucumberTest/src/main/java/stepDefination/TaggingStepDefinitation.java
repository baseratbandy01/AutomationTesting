/*package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class TaggingStepDefinitation {
WebDriver driver;

    @Given("^This is a valid login test$")
    public void this_is_a_valid_login_test()  {
    	 System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.freecrm.com");
	        driver.findElement(By.name("username")).sendKeys("naveenk");
	        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("test@123");
    }

    @Given("^This is a invalid login test$")
    public void this_is_a_invalid_login_test()  {
     
    }

    @Given("^This is a contact test$")
    public void this_is_a_contact_test()  {
        
    }

    @Given("^This is a deal test case$")
    public void this_is_a_deal_test_case()  {
       
    }

    @Given("^This is a tasks test case$")
    public void this_is_a_tasks_test_case()  {
        
    }

    @Given("^clicking on left panel link$")
    public void clicking_on_left_panel_link()  {
      
    }

}
*/


