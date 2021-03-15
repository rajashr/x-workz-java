package com.xworkz.excelread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public Excel(String excelPath, String sheetName) {
		try {
			
			workbook=new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Object getCellData(int rowNo,int colNum) {
		DataFormatter formatter=new DataFormatter();
		Object value=formatter.formatCellValue(sheet.getRow(rowNo).getCell(colNum));
		System.out.println(value);
		return value;
	}

}
