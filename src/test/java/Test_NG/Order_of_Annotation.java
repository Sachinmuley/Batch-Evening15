package Test_NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Order_of_Annotation {
	
	// Order of Execuitation TestNG Annotations
	@BeforeSuite
	public void Before_Suite ()
	{
	 System.out.println("Before Suite");	
	}
	@BeforeTest
	public void Before_Test() 
	{
	  System.out.println("Before Test");	
	}
	@BeforeClass
	public void Before_Class()
	{
	  System.out.println("Before class");	
	}
	@BeforeMethod
	public void Before_Method() 
	{
	  System.out.println("Before Method");	
	}
	@Test
	public void Test1()
	{
	 System.out.println("Test1");	
	}
	@Test
	public void Test2() 
	{
	 System.out.println("Test2");	
	}
	@Test
	public void Test3() 
	{
	 System.out.println("Test3");	
	}
	
	@AfterMethod
	public void After_Method() 
	{
	   System.out.println("After Method");	
	}
	@AfterClass
	public void After_class() 
	{
	   System.out.println("After class");	
	}
	@AfterTest
	public void After_Test() 
	{
	   System.out.println("After Test");	
	}
	@AfterSuite
	public void After_Suite() 
	{
	   System.out.println("After Suite");	
	}

}
