package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_ValidateSwagLab
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        //create object of POM class
        SwagLabLoginPage login=new  SwagLabLoginPage(driver);
        login.enterUserName();
        login.enterPassword();
        login.clickLoginButton();
        
        SwagLabInventoryPage inventory= new SwagLabInventoryPage(driver);
         inventory.addBagPackToCart();
         inventory.addfleeceJacketToCart();
         inventory.cartButtonClick();
        
	}

}
