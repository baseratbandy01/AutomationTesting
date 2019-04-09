package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavegationBar {
	public WebDriver driver;
	By navBarTab=By.linkText("Courses");
	By interViewTab=By.linkText("Interview Guide");
	By BlogTab=By.linkText("Blog");
	
	public NavegationBar(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement navCourseTab() {
		return driver.findElement(navBarTab);
	}
	public WebElement interviewTab() {
		return driver.findElement(interViewTab);
	}
	public WebElement blogTab() {
		return driver.findElement(BlogTab);
	}
}
