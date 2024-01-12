package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel\\Book1.xlsx");
		Workbook myWorkBook= WorkbookFactory.create(myFile);
		Sheet mySheet=myWorkBook.getSheet("Sheet1");
		
		int lastRowNum=mySheet.getLastRowNum();
		int totalNumberOfRows=lastRowNum;
		
		short lastCellNum=mySheet.getRow(0).getLastCellNum();
		int totalNumOfCells=lastCellNum-1;
		
		 for(int i=0;i<=totalNumberOfRows;i++)//OuterLoop for rows
		 {
			 for(int j=0;j<=totalNumOfCells;j++)//InnerLoop For cell
			 {
				 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+" ");
			 }
			 System.out.println();
		 }
	}

}
