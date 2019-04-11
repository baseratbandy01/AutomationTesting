	package javaAlert;
	
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Java_AlertTest {
		static WebDriver driver;
	
		public static void main(String[] args) {
			System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
				//java popup will appear after click above path which is java popup and can be handle with below command
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//this will give you text of alert box
			System.out.println(driver.switchTo().alert().getText());
			//if you will have edit box in alert then u can give it like that
			//driver.switchTo().alert().sendKeys("hello");
			//this is for postive response like=accept, done ,ok,accept
			driver.switchTo().alert().accept();
			//this is for negative responese = cancel ,no
			//driver.switchTo().alert().dismiss(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.close();
		}//end main method
	
	}//end class
