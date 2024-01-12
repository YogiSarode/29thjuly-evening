package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(500);
		 driver.manage().window().maximize();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(1000);
		 
		  WebElement Gender = driver.findElement(By.xpath("//input[@value='-1']"));
		 
		 Thread.sleep(1000);
		 boolean Result = Gender.isSelected();
		 Thread.sleep(1000);
		 System.out.println("Result is "+Result);
		 Gender.click();
		 Thread.sleep(500);
		 boolean Result1 = Gender.isSelected();
		 System.out.println("Result is "+Result1);
		 
		 

	}

}
