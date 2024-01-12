package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Gender:']"));
		Actions act=new Actions(driver);
		//act.moveToElement(gender).perform();
		act.scrollToElement(gender).perform();
		Thread.sleep(1000);
		
		WebElement male = driver.findElement(By.id("male"));
		act.click(male).perform();

	}

}
