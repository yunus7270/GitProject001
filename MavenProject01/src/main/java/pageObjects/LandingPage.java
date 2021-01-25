package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='Login']");
	By title = By.cssSelector("a[href='Summary']");
	
	
	
	
	public LandingPage(WebDriver driver) {
	this.driver = driver;
	
	}


	public WebElement signInID () {
	return driver.findElement(signIn);
	}
	
	public WebElement titleID () {
		return driver.findElement(title);
	}
	
	
	

}
