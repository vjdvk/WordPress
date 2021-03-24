package org.wordpress.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook workbook;

	public ExcelDataConfig() {
		// TODO Auto-generated constructor stub
		

		try {
			
		File src=new File("C:\\Users\\vijay\\eclipse-workspace\\wordpress\\src\\test\\resources\\XLSL\\TestData.xlsx");

			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			
			
			package org.wp.util;

			import java.io.File;
			import java.io.FileInputStream;

			import org.apache.poi.xssf.usermodel.XSSFSheet;
			import org.apache.poi.xssf.usermodel.XSSFWorkbook;

			public class ExcelDataConfig {
			XSSFWorkbook wb;
			XSSFSheet sheet1;

			public ExcelDataConfig(String excelpath) {
			// TODO Auto-generated constructor stub

			try {
			File src = new File("excelpath");
			//F:\\sumi\\wp\\src\\test\\resources\\XLSL\\TestData1.xlsx
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			}
			public String getData(int sheetNumber, int row, int column) {
			sheet1 = wb.getSheetAt(sheetNumber);
			String data = sheet1.getRow(row).getCell(column).getStringCellValue();
			return data;
			}

			public int getRowCount(int sheetNumber) {
			int row = wb.getSheetAt(sheetNumber).getLastRowNum();
			row = row + 1;
			return row;
		
	
	}

}
