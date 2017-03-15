import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

public class CrossBrowser {

  WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyTitle (String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
			 driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Safari"))
		{
			System.setProperty("webdriver.safari.driver", "/Users/bobbysirivuluri/Desktop/selenium/SafariDriver.safariextz");
			driver = new SafariDriver();
			
		}
		
		/*else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "");
		 driver=new InternetExplorerDriver();
		}*/
		
	driver.manage().window().maximize();
  driver.get("https://www.tutorialspoint.com/sql/sql-create-table.htm");
		System.out.println(driver.getTitle());
  driver.quit();
	}
}
