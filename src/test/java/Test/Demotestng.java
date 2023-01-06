package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Demotestng {
	
	
   WebDriver driver;
   
   @BeforeClass
   public void launchBrowser() throws Exception
   {
	   
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
   }
   @Test
   public void test1() throws IOException 
   {
		 String rm=RandomString.make(5); // random string take screen shot
	     TakesScreenshot ts=(TakesScreenshot) driver;
	       File src=ts.getScreenshotAs(OutputType.FILE);
	       
	       File destn=new File("C:\\Users\\sai\\eclipse-Automation testing\\BE_13\\Capture\\"+rm+".jpg");
	       
	       FileUtils.copyFile(src, destn);
   }
   @AfterClass
   public void closeBrowser()
   {
	  driver.close();
   }
   

}
