package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataPropertyFromProperty 
{
	public static void main(String args[]) throws IOException 
	{
        //create Object of properties
		Properties prop=new Properties();
		
		//create object of FileInputStream
		FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\credentials.properties");
		prop.load(myFile);
		String value=prop.getProperty("pincode");
		System.out.println(value);
	}
	
	

}
