package setSizeAndsetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(1000);
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize );
		Dimension D= new Dimension(100, 1000);
		Thread.sleep(1000);
		driver.manage().window().setSize(D);
		
	}

}
