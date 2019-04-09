package testNg_ReportsAndLogs_HtmlReport;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_ReportsAndLogs {
	WebDriver driver;
	
  @Test
  public void logIN(){
	  driver.findElement(By.linkText("Common")).click();
  }
 

 
  @BeforeClass
  public void BrowserSetUp() {
	  driver=new ChromeDriver();
	  driver.get("https://www.java-examples.com");
  }

  @AfterClass
  public void browserClose() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.close();
  }

}
