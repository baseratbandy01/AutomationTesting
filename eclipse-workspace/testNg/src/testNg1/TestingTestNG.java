package testNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingTestNG {
	//public  WebDriver driver=new ChromeDriver();
	
	/*@Test(groups= {"checking","method"})
	public void Browser() {
		System.out.println("browser method");
		System.setProperty("Webdriver.chome.driver", "E:\\Library\\chromedriver.exe");
		driver.get(urlname);*/
	//}
	@Parameters("data")
	@Test
	public void Method1test(String dt) {
		System.out.println("testing grouping");
		System.out.println(dt);
	}
	/*
	@Test(groups= {"checking"})
	public void testbasic() {
		System.out.println("grouping test");
	}*/
	
	
		/*@Test
		public void logindetails() {
		
		WebElement first =driver.findElement(By.name("firstname"));
		first.click();
		first.sendKeys("Lyba");
	
			}
	
		@Test
		public void date() {
			WebElement ele = driver.findElement(By.name("lastname"));
			ele.click();
			ele.sendKeys("shah");	
			}
		@Test(dependsOnMethods={"logindetails","date"})
		public void Mobiledetail() {
			WebElement number = driver.findElement(By.name("reg_email__"));
			number.click();
			number.sendKeys("078965345678");
		}*/
		
}
	
	
	

