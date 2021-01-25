package yunuso.MavenProject01;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogInPage;

public class TestExecution extends baseClass{
	
	
	@Test (dataProvider = "getData")
	public void testCase (String username, String password) throws IOException {
		
	driver = initializedDriver ();
	driver.get("https://www.fafsaweb.state.mn.us/Reports/Summary?year=2022");
	
	String url = driver.getCurrentUrl();
	System.out.println("URL " + url);
	
	LandingPage lp = new LandingPage (driver);
	lp.signInID().click();
	
	LogInPage lip = new LogInPage(driver);
	lip.userNameID().sendKeys(username);
	lip.passwordID().sendKeys(password);
	lip.logInID().click();
	
	}
	
	@DataProvider
	public Object [][] getData () {
		
	
		Object [][] data = new Object [1][2];
		
		data [0][0] = "nonrestricted@yo.com";
		data [0][1] = "123456";
		
		
//		data [1][0] = "restrictedUser";
//		data [1][1] = "NoneNeeded";
		
		return data;
		
	}
		
}
