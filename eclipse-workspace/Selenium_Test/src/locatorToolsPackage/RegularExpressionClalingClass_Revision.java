package locatorToolsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressionClalingClass_Revision {
	static WebDriver driver;
//	static String url="https://login.salesforce.com";
//	static String url="https://www.rediff.com";
  static String url="http://www.qaclickacademy.com";
	static SalesForce_LoginPage logpage;
	static RegularExpressionTest regularExp;
	static QAcademy_Test QA;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		regularExp=new RegularExpressionTest(driver);
		
		/*logpage=new SalesForce_LoginPage(driver);
		logpage.UserName().click();
		logpage.UserName().sendKeys("hello");
		logpage.Password().click();
		logpage.Password().sendKeys("1234");
		logpage.LogIn().click();
		System.out.println(driver.findElement(By.id("error")).getText());
		driver.close();*/
		/*regularExp.SignIn().click();
		regularExp.Username().sendKeys("test123");
		regularExp.Password().sendKeys("rtyug");
		//regularExp.CheckBox().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//xpath example for regular expression
		//WebElement securedText=driver.findElement(By.xpath("//*[ text()='Secured Login' ]"));
		
		//this is xpath example for parents child
		WebElement securedText=driver.findElement(By.xpath("//*[@class='margTop10']/div[2]"));
		if(securedText.isEnabled()) {
		regularExp.GoButton().click();
		
		driver.navigate().back();
		}*/
		
	}//end main method
	
}// end class
