package groupingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_Grouping {
	WebDriver driver;

	@BeforeSuite(alwaysRun = true)
	public void inzilastingBrowser() {
		driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Before class");
	}

	@Test(groups = { "cars", "Audii" })
	public void autoTrade() {
		driver.get("https://www.autotrader.co.uk");
		System.out.println("just testing");
	}

	@Test(groups = { "social-meadia" })
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test(groups = { "market" })
	public void ebay() {
		driver.get("https://www.ebay.co.uk");
	}

	@Test(groups = { "cars", "market" })
	public void allCars() {
		System.out.println("This is to choose car from market");
	}

	@Test(groups = { "social-meadia", "internet" })
	public void TV() {
		System.out.println("Internet is main social -meadia thses days");
	}

	@AfterClass(alwaysRun = true)
		public void afterClass() {
		System.out.println("After class");
		driver.quit();
	}

}
