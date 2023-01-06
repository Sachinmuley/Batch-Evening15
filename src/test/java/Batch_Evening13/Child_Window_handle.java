package Batch_Evening13;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Window_handle {

	public static void main(String[] args) {
	
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent :"+parent);
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Set<String> Allid=driver.getWindowHandles();
		System.out.println(Allid);
		
		// Set ----->List
		
		List<String> list=new ArrayList(Allid);
		    
		String parentid=list.get(0);
		System.out.println(parentid);
		
		String childid=list.get(1);
		System.out.println(childid);
		
		//child window switch
		driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sachin");
		
		//Specifices window close in browser
//		 for (int i = 0; i <list.size(); i++) 
//		 {
//		    driver.
//		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
