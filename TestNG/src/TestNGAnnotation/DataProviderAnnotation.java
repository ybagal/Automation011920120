package TestNGAnnotation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation
{
	
	@Test(dataProvider="getdata")
	public void test1(String username,String password)
	{
	
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		
		
		dr.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(username);	
		dr.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(password);		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();		
		
	}
 
	@DataProvider
	public String[][]getdata() throws IOException
	
	{
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

			return data;	
				
		
		
		
	}
	
	
}
