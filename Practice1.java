import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice1 
{
	WebDriver d; 
	@Test(dataProvider="LoginData")
	
	public void LoginToFacebbok(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable extensions");
	 d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys(username);
		d.findElement(By.id("pass")).sendKeys(password);
		d.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		Thread.sleep(5000);
	   
		System.out.println("Unable");
		
		
}
	@AfterMethod
	public void teardown()
	{
	d.quit();
	}
	@DataProvider(name="LoginData")
	public Object[][] passData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="Bobby";
		data[0][1]="sirivuluri";
		
		data[1][0]="bobby.sirivuluri@gmail.com";
		data[1][1]="9951629963";
		
		data[2][0]="bob";
		data[2][1]="Prakeet143";
		
		return data;
	}
}