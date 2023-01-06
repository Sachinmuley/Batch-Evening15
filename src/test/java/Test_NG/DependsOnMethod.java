package Test_NG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod {

	// Test Case is depends on pervies test case 
	// Used in keyword dependsOnMethod=""; 
	
	@BeforeMethod
	public void BrowserOpen() 
	{
	  System.out.println("Browser Open");	
	}
	@Test()
	public void testz() 
	{
	 System.out.println("Test_z");	
	 Assert.assertTrue(false);//fail
	}
	@Test(dependsOnMethods="testz")
	public void testb() 
	{
	 System.out.println("Test_B");	
	}
	@Test()
	public void testa() 
	{
	 System.out.println("Test_a");	
	}
	
	@AfterMethod
	public void BrowserClose() 
	{
	   System.out.println("Browser close");	
	}

}
