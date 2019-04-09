package extentReportTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Home_PageClass {
	WebDriver driver;
	ExtentTest test;

	public Home_PageClass(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this .test=test;
		}
	
	/*public void signUp() {
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.click();
		test.log(LogStatus.INFO, "Clicked on signUp link .....");
	}
		public void clickLoginLink() {
		WebElement logInLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		logInLink.click();
		test.log(LogStatus.INFO, "Clicked on signUp link .....");
		}*/
	public void enterEmail(String email) {
		WebElement emailId=driver.findElement(By.xpath("//*[@id='email']"));
		emailId.click();
		emailId.sendKeys(email);
		test.log(LogStatus.INFO, "Enter email...");
		}
	public void enterPassWord(String password) {
		WebElement passwordField=driver.findElement(By.xpath("//*[@id='pass']"));
		passwordField.click();
		passwordField.sendKeys(password);
		test.log(LogStatus.INFO, "Enter password...");
		}
	
	public void submitButton() throws Exception {
		WebElement logIn=driver.findElement(By.xpath("//*[@type='submit']"));
		logIn.click();
		test.log(LogStatus.INFO, "Clicked on signIn button .....");
		
	}
	public void login(String email,String password) throws Exception {
		enterEmail(email);
		enterPassWord( password);
		submitButton();
		
	}
		
		public boolean isWelcomeTextPrsent() {
	
		WebElement welcomeText = null;

		try {

			welcomeText = driver.findElement(By.xpath("//*[text()='Irfan Mumtaz']"));
			if(welcomeText !=null) {
				return true;
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		return false;
		
				}

	}

