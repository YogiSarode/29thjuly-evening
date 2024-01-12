package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBycontains {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//button[contains(@id,'u_0_5')]
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();

	}

}
