package popUp;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		//getting text on mainpage
		WebElement mainPageWebElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("Main Page text is: "+mainPageWebElement.getText());
		
		//clicking on newWindowButton
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		//to switch to child window we should know ID of child window
		String mainPageID = driver.getWindowHandle();
		System.out.println("ID of main Page is"+ mainPageID);
		
		//use getWindowHandles() method to get all page ids
	      Set<String> allWindowID = driver.getWindowHandles();
	      Iterator<String> it = allWindowID.iterator();
	      String mainPageId = it.next();
	      String childWindow1 = it.next();
	      System.out.println("MainPage ID is: "+mainPageId);
	      System.out.println("ChildWindow ID is: "+childWindow1);
	      
	      //swiching focus from main page to child window
	      
	      driver.switchTo().window(childWindow1);
	      Thread.sleep(2000);
	      driver.manage().window().maximize(); //will maximize childwindow
	      
	      driver.findElement(By.id("the7-search")).sendKeys("Hello");
	      Thread.sleep(2000);
	      String Text = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
	      System.out.println(Text);
	       
	      //again work on main Page Switch to focus from child window browser to main page
	      
	      driver.switchTo().window(mainPageId);
	      Thread.sleep(500);
	      String mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),'browser window')]")).getText();
		 System.out.println("MainPage Text is :  "+mainPageText2);
	}

}