package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile= new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel\\Book1.xlsx");
		Workbook myWorkBook=WorkbookFactory.create(myFile);
		Sheet mySheet=myWorkBook.getSheet("Sheet1");
		
		//How to read Whole Row
		for(int i=0;i<=3;i++)
		{
			String Value = mySheet.getRow(0).getCell(i).getStringCellValue();   //0,1,2,3  (0 to 3)
			System.out.print(Value+" ");
			
		}
		System.out.println();
		System.out.println("================================================================");
		
		//How to Read Whole column cell
		for(int i=0;i<=3;i++)
		{
			String Value = mySheet.getRow(i).getCell(3).getStringCellValue();   
			System.out.println(Value);
			
		}
		

	}

}
