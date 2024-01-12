package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx1 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//Switching Focus from main page to iframe
		
		driver.switchTo().frame("singleframe");
		 String myTest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		 System.out.println("Text is: "+myTest);
		 
		 //To work on main page -> We need to switch selenium focus from iframe to main page 
		  driver.switchTo().defaultContent();
		  
		  Thread.sleep(1000);
		  WebElement button2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		  System.out.println("Display status for button2 is:  "+button2.isDisplayed());
		
		
		

	}

}
