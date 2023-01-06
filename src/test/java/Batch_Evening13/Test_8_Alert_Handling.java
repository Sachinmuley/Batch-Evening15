
package Batch_Evening13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_8_Alert_Handling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Alertwithop=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		 Alertwithop.click();
		 Thread.sleep(2000);
		WebElement  click_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		 click_button.click();
		 Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
//		 alert.dismiss();
//		 System.out.print("Alert Dismiss");
		alert.accept();
		System.out.println("Alert Accept");
		 Thread.sleep(3000);
		 driver.close();
		 
		 

	}

}
