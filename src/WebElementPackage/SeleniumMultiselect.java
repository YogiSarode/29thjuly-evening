package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMultiselect {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement MultipleDropDown = driver.findElement(By.id("cars"));
		Select s=new Select(MultipleDropDown);
		
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(500);
		s.selectByValue("saab");
		Thread.sleep(500);
		s.selectByVisibleText("Opel");
		Thread.sleep(500);
		s.deselectByValue("saab");
		
		Thread.sleep(500);
		s.deselectAll();

	}


}
