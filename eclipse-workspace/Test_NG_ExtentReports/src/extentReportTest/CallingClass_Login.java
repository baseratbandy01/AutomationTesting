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

public class CallingClass_Login {
	WebDriver driver;
	String baseUrl = "https://www.facebook.com";
ExtentReports report;
ExtentTest test;
Home_PageClass homepage=new Home_PageClass(driver,test);
@BeforeClass
public void browserSetUp() {
	report = ExtentFactoryClass.getInstance();
	test = report.startTest("Verify Welcome Test");
	driver = new ChromeDriver();
	test.log(LogStatus.INFO, "Browser Started...");
	driver.get(baseUrl);
	test.log(LogStatus.INFO, "Web application opened...");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	test.log(LogStatus.INFO, "Browser Will Wait for 5 Seconds...");
	
			}

	@Test
	public void validLoginTest() throws Exception {
		homepage=new Home_PageClass(driver,test);
			homepage.login("irfan_sheikh@hotmail.com","Aamina10!");
			
			Thread.sleep(3000);
			
			boolean result=homepage.isWelcomeTextPrsent();
			Assert.assertTrue(result);
			test.log(LogStatus.PASS, "Verified Welcome Text");
		
	}

	@AfterClass
	public void cleanUp() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}
