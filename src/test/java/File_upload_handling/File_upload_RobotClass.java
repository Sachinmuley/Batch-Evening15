package File_upload_handling;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload_RobotClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement uploadbtn=driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"));
		       uploadbtn.click();
		       
		//Robot class
		    WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();",button); //click on button
		    
		    //copy the  path
		    //control +v
		    // enter
		    Robot rb=new Robot();
		    rb.delay(2000);
		    
		    //put the file in clipborad
		    StringSelection ss=new StringSelection("D:\\Resume\\Sachin Ashok Muley.pdf");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    
		    //Control+V
		    rb.keyPress(KeyEvent.VK_CONTROL);
		    rb.keyPress(KeyEvent.VK_V);
		    
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		    
		    //Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		     System.out.println("File Uploaded Successfully");
		    
		    
		    
		    
		    
	}

}
