package Iframe_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_iframe_handle {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 //element identify ---xpath
		 
		 WebElement Serachtab=driver.findElement(By.xpath("//input[@name='s']"));
		 Serachtab.sendKeys("Bugspotter");
		 Thread.sleep(5000);
		 WebElement frame=driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		  driver.switchTo().frame(frame);
		 
		  
	   //switching to frame using frame name
	  //driver.switchTo().frame("globalSqa");
		 
		WebElement searchtabframe=driver.findElement(By.xpath("//input[@name='s']")); 
		     searchtabframe.sendKeys("frame test Bugspotter");
		     
		     Thread.sleep(10000);
		     driver.close();
		 
		 
		 
		 
		 
		 
	

	}

}
