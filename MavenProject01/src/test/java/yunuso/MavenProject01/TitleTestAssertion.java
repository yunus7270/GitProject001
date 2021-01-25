package yunuso.MavenProject01;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogInPage;

public class TitleTestAssertion extends baseClass{
	
	
	@Test ()
	public void testCase () throws IOException {
		
	driver = initializedDriver ();
	driver.get("https://www.fafsaweb.state.mn.us/Reports/Summary?year=2022");
	
	String url = driver.getCurrentUrl();
	System.out.println("URL " + url);
	
	LandingPage lp = new LandingPage (driver);
	String text = lp.titleID().getText();	
	
	Assert.assertEquals (text, "FAFSA Completion");

	
	Assert.assertTrue(true);
		
	}
		
}
