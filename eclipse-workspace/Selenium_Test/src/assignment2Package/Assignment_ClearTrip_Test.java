package assignment2Package;

import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_ClearTrip_Test {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("OneWay")).click();
		WebElement departurePlace=driver.findElement(By.xpath("//*[@id='FromTag']"));
		WebElement arrival=driver.findElement(By.id("ToTag"));
		departurePlace.clear();
		departurePlace.sendKeys("SXR",Keys.ENTER);
		arrival.clear();
		arrival.sendKeys("DEL",Keys.ENTER);	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");
		Select child=new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("3");
	
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='MoreOptionsDiv']")).click();
		driver.findElement(By.xpath("//*[@id='AirlineAutocomplete']")).sendKeys("indigo");
	System.out.println(driver.findElement(By.xpath("//*[@id='homeErrorMessage']")).getText());
	}

}
