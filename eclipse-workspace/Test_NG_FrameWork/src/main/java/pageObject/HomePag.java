package pageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;



public class HomePag extends CallingFrameWork{
	CallingFrameWork call=new CallingFrameWork();
	
	/*@Test
	public void navigateingBrowserPage() throws IOException {
		driver=	initializedriver();
		driver.get("https://www.facebook.com");
	List<WebElement> elements=driver.findElements(By.xpath("//*"));
	int size=elements.size();
	for(WebElement el:elements) {
	System.out.println(el.getTagName() + ":" + el.getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}*/
	//BuildingFrameWork/src/test/java/TestingFrameWork/BuildingFrameWork/HomePage.java
	@Test(dataProvider="LoginDetails",dataProviderClass=LoginPage2.class)
	
	public void loginPage(String emaild,String password) throws IOException {
		try {
			
		driver.get("https://www.facebook.com");
		call.initializedriver();
		LoginPage2 log=new LoginPage2(driver);
			//log=new LoginPage2(driver);
			log.getEmail().click();
			log.getEmail().sendKeys(emaild);
			log.getPassword().click();
			log.getPassword().sendKeys(password);
			log.submitButton().click();
	System.out.println(driver.getTitle());
		//System.out.println(text);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.navigate().back();
		
		}
		catch(Exception e) {
			
		}
		
			
		}
	
	
}