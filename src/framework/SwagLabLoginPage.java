package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	//1. variable---> webElemnents
	
	@FindBy(name="user-name") private WebElement userNameField;
	@FindBy(id="password")private  WebElement passwordField;
	@FindBy(xpath="//input[@class='submit-button btn_action']") private WebElement loginButton;
	
	//2. constructor
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//3.Methods
	
	public void enterUserName()
	{
		userNameField.sendKeys("standard_user");
	}
	
	public void enterPassword()
	{
		passwordField.sendKeys("secret_sauce");
	}
	public void clickLoginButton()
	{
		loginButton.click();
    }
}
