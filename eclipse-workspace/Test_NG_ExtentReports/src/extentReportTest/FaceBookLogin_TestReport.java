package extentReportTest;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import screenShotPackage.ScreenShots_Test;

public class FaceBookLogin_TestReport {
	WebDriver driver;
	String baseUrl="https://www.facebook.com";
	ExtentReports report;
	ExtentTest test;
	
	
	@BeforeClass 
		public void setUpBrowser(){
		report=new ExtentReports("E://Library//TestScreenShot//facebookreport.html");
		test=report.startTest("Verify Email Id ..... ");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Started...");
		
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Facebook webapplication started...");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		}
	
	@Test
	public void sigIn() throws InterruptedException {
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.click();
		email.sendKeys("irfan_sheikh@hotmail.com");
		test.log(LogStatus.INFO, "Enter email..");
		
		WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
		password.click();
		password.sendKeys("Aamina10!");
		test.log(LogStatus.INFO, "Enter password..");
		
		WebElement logIn=driver.findElement(By.xpath("//*[@type='submit']"));
		logIn.click();
		test.log(LogStatus.INFO, "Clicked LogIn Button..");
		
		Thread.sleep(3000);
		WebElement validId=null;
		
		 try {
			validId=driver.findElement(By.xpath("//*[text()='Irfan Mumtaz']"));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		 Assert.assertTrue(validId !=null);
		 test.log(LogStatus.PASS, "Verified Valid Email Id");
		 
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(result.getStatus()==ITestResult.FAILURE) {
				
				String path=ScreenShots_Test.takeScreenShot(driver,result.getName());
					String imagePath=test.addScreenCapture(path);
					test.log(LogStatus.FAIL, "Inavlid Email ID..", imagePath);
					driver.close();
					report.endTest(test);
					report.flush();
											
				}
		
					}
	
	
}


















