package inheritanceTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass18Nov {
 public static  WebDriver driver;

	public static void main(String[] args) {
		
	}
		public static void url() {
			System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		public static void login() {
		WebElement email=	driver.findElement(By.xpath("//*[@type='email']"));
		email.click();
		email.sendKeys("irfan_sheikh@hotmail.com");
		}
		public static void password() {
		WebElement pwd=	driver.findElement(By.xpath("//*[@id='pass']"));
		WebElement submit=	driver.findElement(By.xpath("//*[@type='submit']"));
			pwd.click();
		pwd.sendKeys("Aamina10!");
		submit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		public static void logout() {
		
			WebElement dropdown=	driver.findElement(By.cssSelector("#userNavigationLabel"));
			dropdown.click();
			WebElement logout=	driver.findElement(By.xpath("//*[@id=\"js_4u\"]/div/div/ul/li[14]"));
			logout.click();
			
		}
}
