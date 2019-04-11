package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_MethodClass {
static WebDriver driver;
	public static void main(String[] args) {
		findUrl();
	}//end main method
	public static void findUrl() {
		System.setProperty("WebDriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.uk");
		System.out.println(driver.getTitle());//validate if your page title is correct
		//driver.findElement(By.linkText("Java Date Formatting")).click();
		System.out.println(driver.getCurrentUrl());//validate if you landed on correct url
		/*driver.get("https://www.java-examples.com");
		System.out.println(driver.getCurrentUrl());
		//if you want to navigate back or forward  then:-
		driver.navigate().back();*/
		//driver.navigate().forward();
	WebElement search=	driver.findElement(By.xpath("//*[@type='text']"));
	search.click();
	search.sendKeys("youtube",Keys.ENTER); 
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3")).click();
	
	System.out.println(driver.getCurrentUrl());
		//driver.close();//this will close the current or single  browser
		
		//	driver.quit(); //this will close all the browser opened by selenium scirpt this used when u are dealing with child window 
					}//end method
	}//end class
