package testngfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("Userid Generation");
	}
	
	
	
	@BeforeTest
	public void cookies()
	{
		System.out.println("Delete the cookies");
	}

	@Test
	public void AOpeningBrowser()
	{
		System.out.println("Opening browser");
	}

@Test
public void Flightbooking()
{
	System.out.println("FlightBooking");
}
@AfterTest
public void cookiesclose()
{
	System.out.println("delete all the cookiesafter alll the tests");
}


@AfterMethod
public void Reportingadding()
{
	System.out.println("this block executes after each method");
}

}