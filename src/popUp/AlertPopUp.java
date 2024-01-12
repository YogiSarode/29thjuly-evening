package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        
        //handling alert popup
        
        Alert alt=driver.switchTo().alert();
        
        //if we want to click on "Cancel" Button on alert
         Thread.sleep(1000);
          alt.dismiss();
        
        //if we want to click on "OK" Button on alert
       // Thread.sleep(1000);
        //alt.accept();
        
        driver.findElement(By.name("cusid")).sendKeys("12345");
	}

}
