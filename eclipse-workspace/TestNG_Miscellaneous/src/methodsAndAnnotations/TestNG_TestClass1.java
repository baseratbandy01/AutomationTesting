package methodsAndAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.BaseTestSuite;

public class TestNG_TestClass1 extends BaseTestSuite  {
	WebDriver driver;
	@Test
	public void openingWebsite() {
		
		System.out.println("this is title :" );
	}


	/*@BeforeMethod
	public void beforeMethod() {
		driver.navigate().back();
	}*/

	
	/*@AfterMethod
	public void afterMethod() {
		System.out.println("Website will be close");
	}*/

	
	/*@BeforeClass
	public void browserSetUp(){
	//	driver.findElement(By.cssSelector("#maximenuck243 > div.maxiroundedcenter > ul > li.maximenuck.item118.parent.level1")).click();
	}*/

	
	/*@AfterClass
	public void cleanUp() {
		System.out.println("chorme should be close now");
	}
*/
}
