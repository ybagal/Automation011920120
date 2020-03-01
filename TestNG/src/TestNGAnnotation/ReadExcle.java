package TestNGAnnotation;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadExcle {

	@Test
	public void rederExcle() throws IOException {

		Xls_ReaderForXLSX xl = new Xls_ReaderForXLSX(
				"D:\\Automation011920120\\TestNG\\src\\TestNGAnnotation\\Test_data.xlsx");

		int rows = xl.getRowCount("Sheet1");
		int cols = xl.getColumnCount("Sheet1");
		
		String[][]data = new String[rows][cols];
		
		for(int r=0;r<rows ; r++)
		{
			
			for (int c=0; c<cols; c++)
			{
				data[r][c]=xl.getCellData("Sheet1",r,c);
			}

			
		}
		
		for(int r=0;r<rows ; r++)
		{
			
			for (int c=0; c<cols; c++)
			{
				System.out.println(data[r][c]);
			}
		}

		
		
		
	}

}
