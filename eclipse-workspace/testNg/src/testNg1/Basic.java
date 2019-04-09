package testNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic  {
	//public static WebDriver driver= new ChromeDriver();
	//@Parameters({"URL"})
	//@BeforeSuite(groups={"smoke"})
	@Test(groups= {"testing"})
	public void Test() {
		System.out.println("basic test");
		/*System.setProperty("Webdriver.chome.driver", "E:\\Library\\chromedriver.exe");
		driver.get(urlname);*/
	}
	
	
	/*@Test
	public void Mobiledetail() {
		WebElement number = driver.findElement(By.name("reg_email__"));
		number.click();
		number.sendKeys("078965345678");
	}*/
	
}
