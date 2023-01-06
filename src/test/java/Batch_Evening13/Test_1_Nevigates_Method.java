package Batch_Evening13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1_Nevigates_Method {

	public static void main(String[] args) throws Exception {
		//Browser Executiable setup
		  
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();  // maximax the window command
		 
		 Thread.sleep(3000);  //3 sec wait
    	 driver.navigate().to("https://www.naukri.com/");
		 String naukri_Title=driver.getTitle();   
		 System.out.println("Title : "+naukri_Title);
		 String naukri_Url=driver.getCurrentUrl();
		 System.out.println("Current Url : "+naukri_Url);
		 Thread.sleep(2000);
		 driver.navigate().back(); // Nevigates to back Page
		 System.out.println("nevigate back");
		 Thread.sleep(2000);
		 driver.navigate().forward(); //Nevigates to forward Page
		 System.out.println("nevigate forword");
		
		 Thread.sleep(2000);
		 driver.navigate().refresh(); // Page refresh
		 
		 System.out.println("nevigate refresh");
		 
		 
		 
		 
//		 //email  id locatores
//		WebElement text_email=driver.findElement(By.id("email"));
//		 text_email.sendKeys("test@123");
//		 
//		 
//		//pass  name locatores
//		 WebElement test_pass=driver.findElement(By.name("pass"));
//		         test_pass.sendKeys("123456789");
//		         
//		         
//		//login buttons
//		         
//		   WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id='u_0_9')]"));      
//		         btn_login.click();

	}

}
