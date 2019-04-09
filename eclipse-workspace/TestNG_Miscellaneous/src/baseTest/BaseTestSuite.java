package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
@BeforeTest
public void beforeTest() {
	driver.get("https://www.guru99.com");
}
@BeforeTest
public void afterTest() {
	System.out.println("This is after test print");
}
  @BeforeSuite
  public void beforeSuite() {
	  driver=new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
  }

 /* @AfterSuite
  public void afterSuite() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
	  System.out.println("this will close later");
  }*/

}
