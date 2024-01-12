package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrame
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://chercher.tech/practice/frames");
         Thread.sleep(1000);
         String mainPageText = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
         System.out.println("Text on Main Page is:=  "+mainPageText);
         
         //switching selenium focus from main page to frame1(Outer Frame).
         driver.switchTo().frame("frame1");
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello, Yogi");
         Thread.sleep(1000);
         
         //switching Selenium focus from outer frame(frame1) to inner frame.
         
         driver.switchTo().frame("frame3");
         Thread.sleep(1000);
         driver.findElement(By.id("a")).click(); //Checking check box in frame3
         
         driver.switchTo().parentFrame();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@type='text']")).clear();
         
         driver.switchTo().defaultContent(); //switching selenium focus from outer frame(1)to main page
         driver.switchTo().frame("frame2");// switching selenium focus from main page to  another frame(frame3)
         WebElement animalsDropDown = driver.findElement(By.id("animals"));
         
         Select s=new Select(animalsDropDown);
         s.selectByIndex(2);
         
         driver.switchTo().defaultContent(); //switching selenium focus from frame(3)to main Page
         Thread.sleep(1000);
         String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
         System.out.println(text);
         
         
         
	}


}
