package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomMakerShots {



	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println(source);
		//RandomString rs=new RandomString(); 
		//System.out.println(RandomString.make(4));
		String s1=RandomString.make(4);
		Date d=new Date();
		System.out.println(d);
		
	    File destination=new File("C:\\Users\\HP\\OneDrive\\Desktop\\MyScreenshots\\Shot"+s1+".png");
		
		FileHandler.copy(source, destination);
		

	}

}
