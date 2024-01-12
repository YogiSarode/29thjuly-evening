package selennium1stpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class VerifyPageTitle {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedResult= "Veleocity | Best Software Training Center";
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		
		String actualResult=driver.getTitle();
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Title is Matching and Title Comaparision is passed");
		}
		else 
		{
			System.out.println("Title is not Matching and Title Comaparision is Failed");
		}

	}

}
