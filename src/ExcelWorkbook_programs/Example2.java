package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2 {

	public static void main(String[] args) throws EncryptedDocumentException,IOException 
	{
		FileInputStream myFile= new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel\\Book1.xlsx");
		Workbook myWorkBook=WorkbookFactory.create(myFile);
		Sheet mySheet=myWorkBook.getSheet("Sheet2");
		Row myRow=mySheet.getRow(0);
		Cell myCell=myRow.getCell(0);
		CellType myDataType=myCell.getCellType();
		System.out.println(myDataType);
		
		

	}

}
