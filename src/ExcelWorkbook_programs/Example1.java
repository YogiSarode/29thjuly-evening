package ExcelWorkbook_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1
  {

public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
    FileInputStream MyFile= new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Excel\\Book1.xlsx");
    String Value = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(Value);
}
}
