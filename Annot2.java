package testngfiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
@Test

public class Annot2 {

	@BeforeSuite
	
		public void installsoftware()
		{
		System.out.println("I am the FIRST");
		}
	
	@AfterSuite
	
	public void deinstallsoftware()
	{
	System.out.println("I am the Last");
	}
	
	
	
}
