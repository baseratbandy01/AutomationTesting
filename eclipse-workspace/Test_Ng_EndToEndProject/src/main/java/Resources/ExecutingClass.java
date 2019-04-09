package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutingClass {
	
	public WebDriver driver;
	public Properties prop;
	@Test
	public WebDriver initializeBrowser() throws IOException {
		prop=new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\82009\\eclipse-workspace\\EndToEndProject\\src\\main\\java\\Resources\\DataFile.properties");
		prop.load(file);
	String browserName=	prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
			driver=new ChromeDriver();
			
			}
	/*else if(browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			driver=new InternetExplorerDriver();
		}*/
	return driver;
		
		
		
	}
	public void getScreenShots( String result) {
		driver=new ChromeDriver();
		try {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("E:\\Library\\TestScreenShot"+result+"screenShot.png"));
		}
		catch(Exception e) {
			System.out.println("Error capturing screenshot..../n"+ e.getMessage());
		}
				}
}