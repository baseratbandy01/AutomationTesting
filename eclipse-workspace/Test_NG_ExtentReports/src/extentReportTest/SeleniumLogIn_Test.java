package extentReportTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumLogIn_Test {
	WebDriver driver;
	String baseUrl = "http://www.letskodeit.com";;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void browserSetUp() {
		report = new ExtentReports("E://Library//TestNg_ExtentReports//loginTest.html");
		test = report.startTest("Verify Welcome Test");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Started...");
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened...");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Browser Will Wait for 5 Seconds...");
		driver.findElement(By.xpath("//*[@id='comp-joictyuz']")).click();
		test.log(LogStatus.INFO, "Clicked on popUp link .....");
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		WebElement signUpLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signUpLink.click();
		test.log(LogStatus.INFO, "Clicked on signUp link .....");

		WebElement logInLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		logInLink.click();
		test.log(LogStatus.INFO, "Clicked on signUp link .....");

		WebElement emailField = driver.findElement(By.xpath("//*[@id='memberLoginDialogemailInputinput']"));
		emailField.click();
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Enter email...");

		WebElement passwordField = driver.findElement(By.xpath("//*[@id='memberLoginDialogpasswordInputinput']"));
		passwordField.click();
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter password...");

		WebElement goButton = driver.findElement(By.id("memberLoginDialogokButton"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked on signIn button .....");
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("//*[@id='comp-joictyuz']")).click();

		WebElement welcomeText = null;

		try {

			welcomeText = driver.findElement(By.cssSelector("#comp-iiqg1vggmemberTitle"));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);

		test.log(LogStatus.PASS, "Verified Welcome Text");

	}

	@AfterClass
	public void cleanUp() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}
