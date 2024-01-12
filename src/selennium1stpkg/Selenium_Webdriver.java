package selennium1stpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webdriver {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 Thread.sleep(500);
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.flipkart.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		// driver.quit();
	     driver.close();

	}

}
