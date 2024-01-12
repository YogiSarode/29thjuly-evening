package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage 
{

	//1. variable
	@FindBy(id="shopping_cart_container") private WebElement cartButton;
	@FindBy(name="add-to-cart-sauce-labs-backpack") private WebElement bagPackAddtocartButton;
	@FindBy(name="add-to-cart-sauce-labs-fleece-jacket") private WebElement fleeceJacketAddtocartButton;
	
	//2. Constructor
	
	public SwagLabInventoryPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addBagPackToCart()
	{
		bagPackAddtocartButton.click();
	}
	
	public void addfleeceJacketToCart()
	{
		fleeceJacketAddtocartButton.click();
	}
	
	
	public void cartButtonClick()
	{
		cartButton.click();
	}
	
}
