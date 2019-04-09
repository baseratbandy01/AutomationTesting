package parallelTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ParallelTest2 {
	WebDriver driver;
  @BeforeClass
  @Parameters({"baseURL1"})
  public void beforeClass(String baseUrl) {
	  //we can use any browser 
	  System.setProperty("webdriver.gecko.driver", "E://Library/geckodriver.exe");
	  driver = new FirefoxDriver();
		driver.get(baseUrl);
  }
  @Test(priority=0)
  @Parameters({"email","Key"})
  public void faceBook(String email,String key) {
	  WebElement emailId=driver.findElement(By.xpath(email));
	  emailId.click();
	  emailId.sendKeys(key);
  }
  @Test(priority=1)
  @Parameters({"password","sendKey","Submit"})
  public void pwd(String password,String value,String login) {
	  WebElement passwd=driver.findElement(By.xpath(password));
	  passwd.click();
	  passwd.sendKeys(value);
	  driver.findElement(By.xpath(login)).click();
  }
  
  @AfterClass
  public void afterClass() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.close();
  }

}
