package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000)); 
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		w.until(ExpectedConditions.elementToBeClickable(getOTPButton));
		getOTPButton.click();

	}

}
