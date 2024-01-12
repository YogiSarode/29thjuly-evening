package WebElementPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(1000);
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		   String actual_Result = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		   String Expected_result="Login";
		   
		   if(Expected_result.equals(actual_Result))
		   {
			   System.out.println("Webtext is Maching");
		   }
		   else
		   {
			   System.out.println("Webtext is not Matching");
		   }
		     
            System.out.println("Text is  "+actual_Result);
	}

}
