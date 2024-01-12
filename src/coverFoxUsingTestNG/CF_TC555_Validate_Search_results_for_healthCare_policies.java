package coverFoxUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CF_TC555_Validate_Search_results_for_healthCare_policies 
{
	WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxHealthPlanResultsPage result;
	
  @BeforeClass
  public void launchBrowser() 
  {
	  driver= new ChromeDriver();
	  home= new CoverFoxHomePage(driver);
	  healthPlan= new CoverFoxHealthPlanPage(driver);
	  addressDetails= new CoverFoxAddressDetailsPage(driver);
	  memberDetails=new CoverFoxMemberDetailsPage(driver);
	  result= new CoverFoxHealthPlanResultsPage(driver);
	  
	  Reporter.log("Opening browser",true);
	  driver.get("https://www.coverfox.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }
  
  @BeforeMethod
  public void enterMemberDetails() throws InterruptedException
  {
	  Reporter.log("Clicking on gender button",true);
	  home.clickOnFemaleButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("Clicking on next button",true);
	  healthPlan.clickOnNextButton();
	  Thread.sleep(1000);
	  
	  Reporter.log("Handling age drop down",true);
	  memberDetails.handledAgeDropDown("37");
	  Reporter.log("Clicking On next button",true);
	  memberDetails.clickOnnextButtonOnDetailPage();
	  Thread.sleep(1000);
	  
	  Reporter.log("Entering Pin Code",true);
	  addressDetails.enterPinCode("441106");
	  Reporter.log("Entering Mobile Number",true);
	  addressDetails.enterMobileNumber("8888888888");
	  Reporter.log("Clicking on continue button",true);
	  addressDetails.clickonContinueButton();
	  Thread.sleep(1000);
	    
  }
  @Test
  public void validateTestPlansFromTextAndBanners() throws InterruptedException
  {
	  Thread.sleep(5000);
	  Reporter.log("Fetching number of results from text",true);
	  int textResult=result.availablePlanNumberFromText();
	  
	  Thread.sleep(7000);
	  Reporter.log("Fetching number of results from Banners",true);
	  int bannerResult=result.availablePlanNumberFromBanners();
	  
	  Thread.sleep(1000);
	  Assert.assertEquals(textResult, bannerResult,"Text Results are not matching with Banner results,TC is failed");
	  Reporter.log("TC is Passed",true);
  }
   
  @AfterMethod
  public void closeBrowser() throws InterruptedException
  {
	  Reporter.log("Closing browser",true);
	  Thread.sleep(3000);
	  driver.close();
  }
  
  
}
