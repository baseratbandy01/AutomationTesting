package locatorToolsPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class QAcademy_Test {
	static WebDriver driver;
	static boolean checkSelection;
public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/practice.php");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//Dyanimic Drop Down In this one their i gave two xpath one is for checkboxexample second is options one
	List<WebElement> checkbox=driver.findElements(By.xpath("//div[@id='checkbox-example'] //*[@type='checkbox']"));
	int count=checkbox.size();
		for(int i=0;i<count;i++) {
				checkbox.get(i).click();
				checkSelection=	checkbox.get(i).isSelected();
				Assert.assertTrue(checkSelection);
				checkbox.get(i).click();
				Assert.assertFalse(checkbox.get(i).isSelected());
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
				/*String text=driver.findElements(By.xpath("//div[@id='checkbox-example'] //*[@type='checkbox']")).get(i).getAttribute("value");
					if(text.equalsIgnoreCase("option3")) {
						checkbox.get(i).click();
						break;
						}//end if loop
*/				}//end for loop
	}//end main method
		 
}//end class
