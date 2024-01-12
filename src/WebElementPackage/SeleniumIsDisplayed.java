package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='btn-style class2'][1])")).click();
		Thread.sleep(1000);
	    driver.findElement(By.id("show-textbox")).click();
	    Thread.sleep(1000);
	    boolean result = driver.findElement(By.id("show-textbox")).isDisplayed();
	    System.out.println("Status of Show button is "+result);
	    //driver.findElement(By.className("inputs displayed-class")).sendKeys("Hi");
	     driver.findElement(By.id("displayed-text")).sendKeys("Hi");

	}

}