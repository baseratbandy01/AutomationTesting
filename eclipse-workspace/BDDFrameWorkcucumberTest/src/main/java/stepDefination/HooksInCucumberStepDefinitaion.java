/*package stepDefination;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

public class HooksInCucumberStepDefinitaion {
	WebDriver driver;
	//these two r global hook which will be excuted after each and every scenario
	@Before(order=0)
	public void setUp() {
		 System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.facebook.com");
		System.out.println("user will launch browser");
	}
	//this will is tagging on global hook as well
	@After(order=0)
	public void tearDown() {
//		driver.close();
		System.out.println("now browser should close");
	}
	@Before(order=1)
	public void setUpOder() {
		 System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.facebook.com");
		System.out.println("user will launch browser this order number 1");
	}
	@After(order=1)
	public void tearDownOrder() {
//		driver.close();
		System.out.println("now browser should close this order number after 1");
	}
	
	
	//local only will execute first scenario these r called tagged hook
	@Before("@First")
	public void beforeFirst() {
		System.out.println("before only first scenario");
	}
	@After("@First")
	public void afterFirst() {
		System.out.println("this will excute after first scenario");
	}
	
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("this will excute second scenario");
	}
	@After("@Second")
	public void afterSecond() {
		System.out.println("this will excute after second scenario");
	}
	@Before("@Third")
	public void beforeThird() {
		System.out.println("this will excute third scenario");
	}
	@After("@Third")
	public void afterThird() {
		System.out.println("this will excute after third scenario");
	}
	@Given("^This is a valid login test$")
    public void this_is_a_valid_login_test() throws Throwable {
       System.out.println("This is valid test");
       
    }

    @Given("^This is a invalid login test$")
    public void this_is_a_invalid_login_test() throws Throwable {
    	 System.out.println("This is invalid test");
    }

    @Given("^This is a contact test$")
    public void this_is_a_contact_test() throws Throwable {
    	 System.out.println("User is in contact list ");
    }

    @Given("^user is on contact page$")
    public void user_is_on_contact_page() throws Throwable {
    	 System.out.println("This is valid contact  test");
    }

    @When("^user fills the contact form$")
    public void user_fills_the_contact_form() throws Throwable {
    	 System.out.println("user now needs to fill form");
    }

    @Then("^new contact is created$")
    public void new_contact_is_created() throws Throwable {
    	 System.out.println("valid details need to be entry ");
    }
    @Given("^user is on deal page$")
    public void user_is_on_deal_page() throws Throwable {
    	 System.out.println("user is on deal page need to be entry ");
        
    }

    @When("^user fills the deal form$")
    public void user_fills_the_deal_form() throws Throwable {
    	 System.out.println("valid details need to be entry ");
      
    }

    @Then("^new deal is created$")
    public void new_deal_is_created() throws Throwable {
    	 System.out.println("deals are succefully entered ");
    }

    @Given("^user is on mail page$")
    public void user_is_on_mail_page() throws Throwable {
    	 System.out.println("user will entry mail id  ");
    }

    @When("^user fills the mail form$")
    public void user_fills_the_mail_form() throws Throwable {
    	 System.out.println("valid mail id  need to be entry ");
    }

    @Then("^new mail is created$")
    public void new_mail_is_created() throws Throwable {
    	 System.out.println("mail is send");
    }


}
*/