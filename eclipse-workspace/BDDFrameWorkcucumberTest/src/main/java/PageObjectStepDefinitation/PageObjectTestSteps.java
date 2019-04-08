/*package PageObjectStepDefinitation;

import org.junit.runner.RunWith;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class PageObjectTestSteps extends TestBaseClass {
	LoginPage lp ;
	HomePage homepage;
	@Given("^user open browser$")
    public void user_open_browser() throws Throwable {
		TestBaseClass.initialization();
    }

    @Then("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
    LoginPage lp = new LoginPage();
       String title = lp.ValidateLoginTitle();
        Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
    }

    @Then("^user logs into app$")
    public void user_enters_username_and_password() throws Throwable {
    	LoginPage lp = new LoginPage();
    	
     homepage= lp.login(prop.getProperty("username"), prop.getProperty("password"));
    }

   
    @Then("^validate logged username$")
    public void validate_logged_username() throws Throwable {
    	HomePage homepage= new HomePage();
    	boolean valideUser=homepage.verifyCorrectUserName();
    	System.out.println(valideUser);
    	homepage.clickOnContactPage();
    }
}
*/