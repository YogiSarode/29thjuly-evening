package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		boolean Result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		
		System.out.println("Button status is "+Result);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8888888888");
		
        Thread.sleep(500);
        boolean Result1 = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
         System.out.println("Button Status is "+Result1);
         
         Thread.sleep(500);
         
         driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	

    }
}
