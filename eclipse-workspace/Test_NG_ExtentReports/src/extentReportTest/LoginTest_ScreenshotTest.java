package extentReportTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import screenShotPackage.ScreenShots_Test;

public class LoginTest_ScreenshotTest {
	WebDriver driver;
	String baseUrl = "https://www.amazon.co.uk";
	ExtentReports reports;
	ExtentTest test;

	@BeforeClass
	public void initializeingBrowser() {
	reports = new ExtentReports("E://Library//TestNg_ExtentReports_screenShotFile//Amazonreport1.html");
		driver = new ChromeDriver();
		test = reports.startTest("Verifying Amazon Web Page....");
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Amazon Web Application Started..");
			}
	/*@Test
	public void searchBox() {
		WebElement searchIteam=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchIteam.click();
		searchIteam.sendKeys("Women's coats");
		test.log(LogStatus.INFO, "Searching for item ....");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		test.log(LogStatus.INFO, "Search is being submit...");
			driver.navigate().back();
			}
*/
	@Test
	public void signIn() throws InterruptedException {
		driver.findElement(By.id("nav-link-yourAccount")).click();
		WebElement emailField=driver.findElement(By.xpath("//*[@id='ap_email']"));
		emailField.click();
		emailField.sendKeys("aafiya@homail.com");
		test.log(LogStatus.INFO, "Enter email..");
		
		WebElement passwordField=driver.findElement(By.xpath("//*[@id='ap_password']"));
		passwordField.click();
		passwordField.sendKeys("Aafiya07!");
		test.log(LogStatus.INFO, "Enter password..");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("signInSubmit")).click();
		test.log(LogStatus.INFO, "Clicked signIn Button...");
		
		
	}
		@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(result.getStatus()==ITestResult.FAILURE) {
				
				String path=ScreenShots_Test.takeScreenShot(driver,result.getName());
					String imagePath=test.addScreenCapture(path);
					test.log(LogStatus.FAIL, "Inavlid Email ID..", imagePath);
					driver.close();
					reports.endTest(test);
					reports.flush();
											
				}
		
					}
	
	
}
