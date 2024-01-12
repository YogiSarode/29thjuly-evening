package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLink_PartialLink {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		  driver.findElement(By.partialLinkText("Free Access")).click();
	}

}
