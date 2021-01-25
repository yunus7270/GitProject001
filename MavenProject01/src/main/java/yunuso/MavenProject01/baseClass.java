package yunuso.MavenProject01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseClass {
	
	public WebDriver driver;



	public WebDriver initializedDriver () throws IOException {
	Properties prop = new Properties ();
	FileInputStream fis = new FileInputStream ("C:\\Users\\ogurlu\\eclipse-workspace\\MavenProject01\\src\\main\\java\\BrowserTestCase");
	
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	
	if (browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ogurlu\\javafx-sdk-11.0.2/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	} else if (browserName.equals("fireFox")) {
		
		// execute here
	}
	return driver;
	}

}
