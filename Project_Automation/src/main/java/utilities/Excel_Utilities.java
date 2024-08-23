package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class Excel_Utilities 
{
		static FileInputStream f;
		static XSSFWorkbook w;
		static XSSFSheet sh;
		
		public static String readStringdata(int row, int col,String sheet) throws IOException
		{
			String filePath=Constants.TESTDATAFILE;
			f = new FileInputStream(filePath);
			w = new XSSFWorkbook(f);
			sh = w.getSheet(sheet);
			XSSFRow r = sh.getRow(row);
			XSSFCell c = r.getCell(col);
			return c.getStringCellValue();
			
		}
		public static String readIntigerData(int row, int col,String sheet) throws IOException
		{
			String filePath=Constants.TESTDATAFILE;
			f = new FileInputStream(filePath);
			w = new XSSFWorkbook(f);
			sh = w.getSheet(sheet);
			XSSFRow r = sh.getRow(row);
			XSSFCell c = r.getCell(col);
			int val = (int)c.getNumericCellValue();
			return String.valueOf(val);
			
		}

}
