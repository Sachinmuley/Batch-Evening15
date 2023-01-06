package Test_NG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsonGroups {
	
	@BeforeMethod
	public void BrowserOpen() 
	{
	  System.out.println("Browser Open");	
	}
	@Test(groups="testz")
	public void testz() 
	{
	 System.out.println("Test_z");	
	 Assert.assertTrue(false);//fail
	}
	@Test(dependsOnGroups="testz")
	public void testb() 
	{
	 System.out.println("Test_B");	
	}
	@Test(groups="testa")
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
