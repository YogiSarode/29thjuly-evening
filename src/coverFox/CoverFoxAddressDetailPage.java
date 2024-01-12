package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailPage 
{
   @FindBy(xpath="(//input[@type='number'])[1]") private WebElement pinCodeText;
   @FindBy(id="want-expert") private WebElement mobileNumberText;
   @FindBy(className="next-btn") private WebElement continueButton;
   
   public CoverFoxAddressDetailPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterPinCode() 
   {
	   pinCodeText.sendKeys("441106");
   }
   
   public void enterMobileNumber()
   {
	   mobileNumberText.sendKeys("7021185338");
   }
   
   public void clickonContinueButton()
   {
	   continueButton.click();
   }
   
}
