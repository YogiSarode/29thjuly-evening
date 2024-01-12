package coverFoxTest;

import java.io.IOException;
//import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHealthPlanResultsPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxUtility.Utility;

public class CF_TC555_Validate_Search_results_for_healthCare_policies extends Base
{
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxAddressDetailPage addressDetails;
	CoverFoxHealthPlanResultsPage result;
	
  @BeforeClass
  public void launchBrowser() throws InterruptedException 
  {
	  launchCoverFox();
	  home= new CoverFoxHomePage(driver);
	  healthPlan= new CoverFoxHealthPlanPage(driver);
	  addressDetails= new CoverFoxAddressDetailPage(driver);
	  memberDetails=new CoverFoxMemberDetailsPage(driver);
	  result= new CoverFoxHealthPlanResultsPage(driver);
	  
  }
  
  @BeforeMethod
  public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  Reporter.log("Clicking on gender button",true);
	  home.clickOnFemaleButton();
	  Thread.sleep(2000);
	  
	  Reporter.log("Clicking on next button",true);
	  healthPlan.clickOnNextButton();
	  Thread.sleep(3000);
	  
	  Reporter.log("Handling age drop down",true);
	  memberDetails.handledAgeDropDown(Utility.readDataFromExcel(1, 0));
	  Reporter.log("Clicking On next button",true);
	  memberDetails.clickOnnextButtonOnDetailPage();
	  Thread.sleep(2000);
	  
	  Reporter.log("Entering Pin Code",true);
	  addressDetails.enterPinCode(Utility.readDataFromExcel(1, 1));
	  Reporter.log("Entering Mobile Number",true);
	  addressDetails.enterMobileNumber(Utility.readDataFromExcel(1, 2));
	  Reporter.log("Clicking on continue button",true);
	  addressDetails.clickonContinueButton();
	  Thread.sleep(2000);
	    
  }
  @Test
  public void validateTestPlansFromTextAndBanners() throws InterruptedException, IOException
  {
	  Thread.sleep(3000);
	  Reporter.log("Fetching number of results from text",true);
	  int textResult=result.availablePlanNumberFromText();
	  
	  Thread.sleep(3000);
	  Reporter.log("Fetching number of results from Banners",true);
	  int bannerResult=result.availablePlanNumberFromBanners();
	  
	  Thread.sleep(1000);
	  Assert.assertEquals(textResult, bannerResult,"Text Results are not matching with Banner results,TC is failed");
	  
	  Reporter.log("TC is Passed",true);
	  Utility.takeScreenShot(driver, "CF_TC555");
	  
  }
   
  @AfterMethod
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(5000);
	  closeCoverFox();
  }
  
 
}
