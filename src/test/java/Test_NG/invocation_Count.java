package Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocation_Count {
	
  //one test case is Execute in Multiple time then used in 
  //invocationCount keyword.
	@BeforeMethod
	public void BrowserOpen() 
	{
	  System.out.println("Browser Open");	
	}
	@Test(priority=0,invocationCount=2)
	public void testz() 
	{
	 System.out.println("Test_z");	
	}
	@Test(priority=1,invocationCount=3)
	public void testb() 
	{
	 System.out.println("Test_B");	
	}
	@Test(priority=2)
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
