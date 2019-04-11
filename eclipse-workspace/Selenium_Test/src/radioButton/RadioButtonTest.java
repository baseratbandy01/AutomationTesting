package radioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count=	driver.findElements(By.name("group1")).size();
		WebElement value=driver.findElement(By.xpath("//*[@value='Search']"));
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@name='group1']"));
			for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.name("group1")).get(i).getAttribute("value");
		if(text.equalsIgnoreCase("Butter")) {
			radiobutton.get(i).click();
			break;
		}//end if loop
		}//end for loop
	}//end main method

}//end class
