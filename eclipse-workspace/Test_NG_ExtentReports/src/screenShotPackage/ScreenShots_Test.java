package screenShotPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots_Test {
	public static String takeScreenShot(WebDriver driver,String filePath) throws IOException {
		filePath=filePath + ".png";
		String sourceDir="E://Library//TestScreenShot//screenshot1";
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile,new File(sourceDir + filePath));
		String destination=sourceDir + filePath;
		return destination;
	}

}
