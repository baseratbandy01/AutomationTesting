package parallelExcuteMultipleTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		driver=new ChromeDriver();
		
	}
	
	@Test(priority=2)
	public void landingOnWebsite() {
		driver.get("https://www.ebay.co.uk");
	}
	@Test(priority=3)
	public void clickOnMyebay() throws InterruptedException {
		driver.findElement(By.linkText("My eBay")).click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=4)
	public void userName() {
		WebElement Id= driver.findElement(By.xpath("//*[@id='userid']"));
		WebElement pwd= driver.findElement(By.name("pass"));
		Id.click();
		Id.sendKeys("warayha");
		pwd.click();
		pwd.sendKeys("Amina10!");
		
	}
	@Test(priority=5)
	public void signin() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@AfterClass
	public void quit() {
		driver.close();
	}
	
	
}
