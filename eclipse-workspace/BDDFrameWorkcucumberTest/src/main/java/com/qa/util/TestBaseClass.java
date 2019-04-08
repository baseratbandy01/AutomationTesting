package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBaseClass() {
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("C://Users//82009//eclipse-workspace//BDDFrameWorkcucumberTest/src/main/java/com/qa/config/config.properties");
			prop.load(file);
		}catch(IOException e) {
			e.getMessage();
			
		}
	}
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chorme")) {
			System.setProperty("WebDriver.chrome.driver","E://Library/chromedriver.exe");
	        driver=new ChromeDriver();
		}
//	        driver.manage().window().maximize();
//	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(TestUtilClass.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(TestUtilClass.IMPLICITY_WAIT, TimeUnit.SECONDS);
	        driver.get(prop.getProperty("url"));
		}
	}
	

