package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions
{

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(1000);
		 
		WebElement day = driver.findElement(By.id("day"));
		Actions act=new Actions(driver);
		//act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.click(day).sendKeys(Keys.ARROW_UP).build().perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
		 
		 WebElement firstNameField = driver.findElement(By.name("firstname"));
		// act.sendKeys(firstNameField, "Yogi").perform();
		 act.keyDown(firstNameField, Keys.SHIFT).sendKeys("Y").keyUp(Keys.SHIFT).sendKeys("ogi").build().perform();
		 
		 //Keydown means press the key
		 // keyup means unpress the key
	}

}
