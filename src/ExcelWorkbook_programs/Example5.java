package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel\\Book1.xlsx");
		Workbook myWorkBook= WorkbookFactory.create(myFile);
		Sheet mySheet=myWorkBook.getSheet("Sheet1");
		int totalNumberOfRows= mySheet.getLastRowNum();
		System.out.println(totalNumberOfRows);
		System.out.println("=================================================");
		
		int firstRow= mySheet.getFirstRowNum();
		System.out.println(firstRow);
	
		System.out.println("==================================================");
		short totalNumberOfCells= mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumberOfCells);
		
		

	}

}
