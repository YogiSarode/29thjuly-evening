package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonPropertyFile 
{

	public static String readDataFromProertyFile (String key) throws IOException 
	{
		
		 //create Object of properties
		Properties prop=new Properties();
		
		//create object of FileInputStream
		FileInputStream myFile= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SeleniumPractice\\credentials.properties");
		//load file
		prop.load(myFile);
		//pass the key for data we want
		String value=prop.getProperty(key);
		return value;
	}

	}


