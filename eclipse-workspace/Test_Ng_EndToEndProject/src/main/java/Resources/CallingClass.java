package Resources;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.HomePage;

public class CallingClass   {
	
	WebDriver driver = new ChromeDriver();
	AccountPage login=new AccountPage(driver);
	HomePage  homePage=new HomePage (driver);
	
	@Test(dataProvider="getData")
	public void Sigin(String Url,String email,String pwd) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver.get(Url);
		login.getEmail().click();
		login.getEmail().sendKeys(email);
		//login.getPassword().click();
		login.getPassword().sendKeys(pwd);
//		login.getSignin().click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.clickShopNext().click();
		}
	@Test(priority=2)
	public void navgatingHomePage() {
		homePage.goClearance().click();
		System.out.println(homePage.goClearance().getText());
		homePage.goHomeShopping().click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	public void getScreenShots( String result) {
		//driver=new ChromeDriver();
		try {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("E:\\Library\\TestScreenShot"+result+"screenShot.png"));
		}
		catch(Exception e) {
			System.out.println("Error capturing screenshot..../n"+ e.getMessage());
		}
				}
	
	
	@DataProvider
	public Object[][] getData(){
	 Object[][]data=new Object[1][3];
	data[0][0]= "https://www.next.co.uk/secure/account/Login";
	data[0][1]= "basirat_bashir@hotmail.com";
	data[0][2]= "Aafiya";
	
	return data;
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
}
