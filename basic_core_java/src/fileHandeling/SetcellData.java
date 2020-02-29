package fileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetcellData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("D:\\Automation011920120\\basic_core_java\\src\\fileHandeling\\Test_data.xlsx"); 

		XSSFWorkbook wb = new XSSFWorkbook(file);
		
	XSSFSheet Sheet =wb.getSheet("Sheet1");
		
		XSSFRow row =Sheet.getRow(10);
		
		if(row==null)
			row=Sheet.createRow(10);
		
		
		
		XSSFCell cell = row.getCell(5);
		
		if(cell==null)
			cell=row.createCell(5);
		
		
		
		cell.setCellValue("Anand");
		
		
		FileOutputStream file2 =new FileOutputStream("D:\\Automation011920120\\basic_core_java\\src\\fileHandeling\\Test_data.xlsx"); 
		
        wb.write(file2);
	

	}

}
