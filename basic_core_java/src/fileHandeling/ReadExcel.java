package fileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file =new FileInputStream("D:\\Automation011920120\\basic_core_java\\src\\fileHandeling\\Test_data.xlsx"); 

		XSSFWorkbook wb = new XSSFWorkbook(file);
		
	XSSFSheet Sheet =wb.getSheet("Sheet1");
		
		/*XSSFRow row =Sheet.getRow(4);
		
		XSSFCell cell = row.getCell(0);
		
		String str=cell.getStringCellValue();*/
	
	String str=Sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		System.out.println(str);
		
		int rows =Sheet.getPhysicalNumberOfRows();
		int cols =Sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0;r<rows;r++)
{
	for(int c=0;c<cols;c++)
	{
		
String Str1=Sheet.getRow(r).getCell(c).getStringCellValue();		
		System.out.println(Str1);
	
	}
}
		
		
	}
	

}
