package Batch_Evening13;

import java.io.File;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_3_ScreenShot_capture {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Browser  setup
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize(); 
		 
		 
		 // Screenshot
		 
		 String rm=RandomString.make(5); // random string take screen shot
	     TakesScreenshot ts=(TakesScreenshot) driver;
	       File src=ts.getScreenshotAs(OutputType.FILE);
	       
	       File destn=new File("C:\\Users\\sai\\eclipse-Automation testing\\BE_13\\Capture\\"+rm+".png");
	       
	       FileUtils.copyFile(src, destn);
	
	
	}

}
