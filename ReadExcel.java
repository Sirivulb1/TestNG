import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;

public class ReadExcel {
  @Test

	public static void main(String[] args) throws Exception {
		
		File src= new File("/Users/bobbysirivuluri/Desktop/selenium");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		System.out.println("Total number of Rows are"+rowcount);
		
		for(int i=0; i<rowcount; i++)
		{
		String	data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Value from row" + i+ "is"+ data0);
		}
		wb.close();
	}

}
