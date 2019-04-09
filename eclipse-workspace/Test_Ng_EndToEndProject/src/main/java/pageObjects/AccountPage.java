package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
		WebDriver driver;
		 public AccountPage(WebDriver driver) {
			 this.driver=driver;
		 }
		
		By Email=By.cssSelector("#EmailOrAccountNumber");
		By Password=By.className("password");
		By Submit=By.xpath("//*[@type='submit']");
		By ShopNext=By.className("lastPageVisited");

		public WebElement getEmail() {
			return driver.findElement(Email);
			}
		public WebElement getPassword() {
			return driver.findElement(Password);
			}
		public WebElement getSignin() {
			return driver.findElement(Submit);
			}
		public WebElement clickShopNext() {
			return driver.findElement(ShopNext);
			}
}