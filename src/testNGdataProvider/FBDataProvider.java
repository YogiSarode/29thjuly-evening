package testNGdataProvider;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

public class FBDataProvider {
   
	// method-> data Provider
	//String firstName, String lastName, String MobNum
	
	@DataProvider(name = "FBRegression")
	public static String[][] fbDataset()
	{
		String data[][]= {{"Yogi","Sarode","8600046735"},{"Sangita","Dahare","9999999999"}};
		return data;
	}
	
	@DataProvider(name = "FBSanity")
	public static String[][] fbDataset1()
	{
		String data[][]= {{"Tushar","Sarode","8600346735"},{"Gaurav","Dahare","9999990909"}};
		return data;
	}
	
}
