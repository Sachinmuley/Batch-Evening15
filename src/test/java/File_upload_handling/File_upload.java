package File_upload_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement uploadbtn=driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"));
		       uploadbtn.click();
		       
		//sendkeys method
		       WebElement file=driver.findElement(By.xpath("//input[@type='file']"));
		           file.sendKeys("D:\\Resume\\Sachin Ashok Muley.pdf"); //then ony type attribute send 
                 System.out.println("File is Successfully Uploaded ");
        
       
                 
	}

}
