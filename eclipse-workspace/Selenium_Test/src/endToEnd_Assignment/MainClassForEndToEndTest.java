package endToEnd_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainClassForEndToEndTest {
	static WebDriver driver;
	static SpiceJetEndToEndTest spiceJet;
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		spiceJet=new SpiceJetEndToEndTest(driver);
		//spiceJet.roundTrip().click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//*[@value='DEL']")).click();
		/*spiceJet.DepartureCity().click();;
		spiceJet.Value().click();*/
		/*spiceJet.ArrivaCity().click();;
		spiceJet.ArrivaCity().sendKeys("MAA",Keys.ENTER);;
		spiceJet.DepartDate().click();
		spiceJet.ReturnDate().click();
		spiceJet.Passengers().click();
		spiceJet.SeniorCitizen().click();
		spiceJet.Submit().click();*/

	}

}
