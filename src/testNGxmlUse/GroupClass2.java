package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupClass2 
{
	  @Test(groups = "Regression")
	  public void TC5() 
	  {
		  Reporter.log("TC5 is Running", true);
	  }
	  @Test(groups ="Sanity" )
	  public void TC6() 
	  {
		  Reporter.log("TC6 is Running", true);
	  }
	  @Test(groups = "Regression")
	  public void TC7() 
	  {
		  Reporter.log("TC7 is Running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC8() 
	  {
		  Reporter.log("TC8 is Running", true);
	  }

}
