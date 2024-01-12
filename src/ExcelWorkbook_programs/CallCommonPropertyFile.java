package ExcelWorkbook_programs;

import java.io.IOException;

public class CallCommonPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		String value1=CommonPropertyFile.readDataFromProertyFile("age");
		System.out.println(value1);
		
		String value2=CommonPropertyFile.readDataFromProertyFile("pincode");
		System.out.println(value2);
		
		String value3=CommonPropertyFile.readDataFromProertyFile("MobNum");
		System.out.println(value3);
		


	}

}
