import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Logs {
	@Test
    public void testReport(){
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
        
        Reporter.log("Browser Opened");
        
        driver.manage().window().maximize();
        
        Reporter.log("Browser Maximized");
        
        driver.get("http://www.google.com");
        
        Reporter.log("Application started");
        
        driver.quit();
        
        Reporter.log("Application closed");
        
    }
}
