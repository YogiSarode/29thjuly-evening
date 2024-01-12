package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesUsingWebElement
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello,Good Morning");

	}

}

