package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		   Thread.sleep(3000);
		  // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Yogeshwari@gmail.com");
		   //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sarode");	
		  // driver.findElement(By.id("email")).clear();
		  // driver.findElement(By.name("email")).sendKeys("Archna123@gmail.com");
		   driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("12345");
		   
	}

}
