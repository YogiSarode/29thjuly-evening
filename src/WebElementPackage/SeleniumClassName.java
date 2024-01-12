package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassName {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		boolean result = driver.findElement(By.className("img-responsive")).isEnabled();
		System.out.println("Status of image "+result);
	}

}
