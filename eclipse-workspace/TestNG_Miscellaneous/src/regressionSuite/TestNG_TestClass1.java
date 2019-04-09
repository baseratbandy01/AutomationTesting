package regressionSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass1 {
	WebDriver driver;
	@Test
	public void openingWebsite() {
		driver.get("https://www.guru99.com");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Website is open now");
	}

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Website will be close");
	}

	
	@BeforeClass
	public void browserSetUp(){
	 driver=new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	}

	
	@AfterClass
	public void cleanUp() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

}
