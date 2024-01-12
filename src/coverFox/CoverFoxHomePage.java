package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage 
{
	// 1. Variable
	
		@FindBy(xpath="//div[@class='w--radio__option ']") private WebElement femaleButton;
		
		
	//2.constructor
		public CoverFoxHomePage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
   //3. method
		public void clickOnFemaleButton()
		{
			femaleButton.click();
		}
}
