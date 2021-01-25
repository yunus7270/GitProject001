package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

		
		
		public WebDriver driver;
		
	
		
		public LogInPage(WebDriver driver) {
			this.driver = driver;
		}



		By userName = By.cssSelector("input[id*='UserName']");
		By password = By.cssSelector("input[type='password']");
		By logIn = By.cssSelector("input[type='submit']");
		
		
		
		public WebElement userNameID () {
			return driver.findElement(userName);
		}
		
		public WebElement passwordID () {
			return driver.findElement(password);
	}
		
		public WebElement logInID () {
			return driver.findElement(logIn);
		}
		

	
	
	

}
