package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile= new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel\\Book1.xlsx");
		Workbook myWorkBook= WorkbookFactory.create(myFile);
		Sheet mySheet=myWorkBook.getSheet("Sheet1");
		
		//Read Whole Excel Sheet
		
		for(int i=0;i<=3;i++)  //Outer for loop for row (0 to 1)
		{
			for(int j=0;j<=3;j++) //Inner For loop for cell(0 to 2)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}