package setSizeAndsetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(1000);
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		Point P=new Point(-300, 100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(P);
		
		Point P1=new Point(300, -100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(P1);
		

		

	}
 
}
