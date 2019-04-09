package grouping;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GroupingExe1 {
	WebDriver driver;
	String email="irfan_sheikh@hotmail.com";
	String password="Aamina10!";
	
	@Test(groups= {"cheking","website"})
	public void openBrowser() {
		driver=new ChromeDriver();
		}
	@Test(priority=5) 
	public void currentUrl() {
		driver.get("https://www.amazon.co.uk/");
	}
	@Test(priority=6)               
	public void siginButton() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).click().build().perform();
	}
	@Test(groups="website")
	public void emailInfo() {
		WebElement Id=driver.findElement(By.xpath("//*[@type='email']"));
		WebElement pass=driver.findElement(By.name("password"));
		Id.click();
		Id.sendKeys(email);
		pass.click();
		pass.sendKeys(password);
	}
	@Test(priority=7)
	public void submit() {
		driver.findElement(By.id("signInSubmit")).click();
	}
	@AfterClass
	public void quit() {
		driver.close();
	}
	
}
