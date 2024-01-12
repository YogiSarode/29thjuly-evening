package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("incognito");
		
		ArrayList<String> al=new ArrayList<>();
		al.add("incognito");
		al.add("-disable-notifications");
		al.add("start-maximized");
		//al.add("disable-popup-blocking");
		//al.add("version");
		//al.add("headless");
		
		opt.addArguments(al);
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());

	}

}
