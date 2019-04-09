package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
		WebDriver driver;
		 public LandingPage(WebDriver driver) {
			 this.driver=driver;
		 }
		
By searchBox= By.xpath("//*[@id='twotabsearchtextbox']");
		By chooseItem=By.xpath("//*[@id='result_2']");
		By Submit=By.className("nav-input");
		By AddBasket=By.id("add-to-cart-button");
		By checkBasket=By.id("nav-cart");
		public WebElement getSearch() {
			return driver.findElement(searchBox);
			}
		public WebElement chooseItem() {
			return driver.findElement(chooseItem);
			}
		public WebElement submitButton() {
			return driver.findElement(Submit);
			}
		public WebElement addToCart() {
			return driver.findElement(AddBasket);
			}
		public WebElement checkCart() {
			return driver.findElement(checkBasket);
			}
		
}