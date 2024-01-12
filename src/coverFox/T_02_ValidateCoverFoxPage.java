package coverFox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_02_ValidateCoverFoxPage {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//create object of POM class
		
		CoverFoxHomePage homepage= new CoverFoxHomePage (driver);
				homepage.clickOnFemaleButton();

		CoverFoxHealthPlanPage healthPage= new CoverFoxHealthPlanPage (driver);
		healthPage.clickOnNextButton();
		
		CoverFoxMemberDetailsPage detailPage= new CoverFoxMemberDetailsPage(driver);
		detailPage.handledAgeDropDown();
		detailPage.clickOnnextButtonOnDetailPage();
		
		CoverFoxAddressDetailPage address=new CoverFoxAddressDetailPage(driver);
		        address.enterPinCode();
		        address.enterMobileNumber();
		        address.clickonContinueButton();
		        
	}

}
