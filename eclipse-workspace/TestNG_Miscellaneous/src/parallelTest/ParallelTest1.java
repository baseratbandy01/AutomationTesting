package parallelTest;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParallelTest1 {
	 WebDriver driver;
  @BeforeClass
  @Parameters({"baseUrl"})
  public void setUp(String baseurl) {
	driver = new ChromeDriver();
	driver.get(baseurl);
	  
  }
  @Test(priority=0)
  @Parameters({"Search","sendKey"})//if we are reading 2 parameters values  then we need to pass 2 keys in method like in this example
  public void ebay(String Search,String sendkey) {
	WebElement searchBox= driver.findElement(By.xpath(Search));
	searchBox.click();
	searchBox.sendKeys(sendkey);
	
  }
  @Test(priority=1)
  @Parameters({"Submit"})
  public void search(String searchButton) {
	  driver.findElement(By.xpath(searchButton)).click();
  }
  @Test(priority=2)
  @Parameters({"test"})
  public void stringToInteger(String num) {
	 /* String number=num;
	  int num1=Integer.parseInt(number);*/
	  String [] stringArray=num.split(",");
	 // System.out.println(num1);
	  System.out.println(stringArray[0]);
	  System.out.println(stringArray[1]);
  }
  @AfterClass
  public void close() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.close();
  }

}
