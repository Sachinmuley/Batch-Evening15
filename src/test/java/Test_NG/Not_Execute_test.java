package Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Not_Execute_test {
	
	//Particular Test Cases is Not run then used in enabled keyword is false
	
	@BeforeMethod
	public void BrowserOpen() 
	{
	  System.out.println("Browser Open");	
	}
	@Test(priority=0,enabled=false)
	public void testz() 
	{
	 System.out.println("Test_z");	
	}
	@Test(priority=1)
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
