package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCSSselector {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("Yogi@gmail.com"); //syntax 1) tag#id  [Tag and ID]
		//driver.findElement(By.cssSelector("a._97w4")).click(); // syntax 2)tag.classname   [Tag and Class]
		//driver.findElement(By.cssSelector("button[name=login]")).click(); //3) tag[attribute=attribute value]  [Tag and Attribute]
		//driver.findElement(By.cssSelector("a._97w5[rel=nofollow]")).click(); //) tag.class[attribute=attribute value]  [Tag, class and Attribute]
        //Thread.sleep(2000);
		String name = driver.findElement(By.id("loginbutton")).getAttribute("id");
		System.out.println(name);

	}

}
