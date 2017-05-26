package testngfiles;

import org.testng.annotations.Test;

public class DependencyAnnot {

	@Test(dependsOnMethods = { "method2" },alwaysRun=true)
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test
	public void method2() {
		System.out.println("This is method 2");
	}
	@Test(timeOut=45000)
	public void Timerelated() {
		System.out.println("New Testcase");
	}
	@Test(enabled =false)
	public void Payment()
	{
		System.out.println("new test case");
	}


}