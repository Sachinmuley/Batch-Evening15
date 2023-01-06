package Batch_Evening13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) {
		//Browser Executiable setup
		  
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();    // maximax the window command
		 
//		 Thread.sleep(3000);  //3 sec wait
//		 driver.navigate().to("https://mvnrepository.com/");
	//	
//		 Thread.sleep(2000);
//		 driver.navigate().back();
//		 
//		 Thread.sleep(2000);
//		 driver.navigate().forward();
	//	
//		 Thread.sleep(2000);
//		 driver.navigate().refresh();
		 
		 
		 //email  id locatores
		WebElement text_email=driver.findElement(By.id("email"));
		 text_email.sendKeys("test@123");
		 
		 
		//pass  name locatores
		 WebElement test_pass=driver.findElement(By.name("pass"));
		         test_pass.sendKeys("123456789");
		         
		         
		//login buttons
		         
		   WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id='u_0_9')]"));      
		         btn_login.click();

	}

}
