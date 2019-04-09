package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTestExe1 {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		
		driver = new ChromeDriver();
		}
	
	@Test(priority=2)
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=3)
	public void serachClick() {
		 WebElement search =driver.findElement(By.xpath("//*[@title='Search']"));
		 search.click();
		 search.sendKeys("facebook");
		search.sendKeys(Keys.ENTER);
	}
	@Test(priority=4)
	public void verify() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='gsr']")).click();
	System.out.println(driver.getTitle());
		
	}
}
