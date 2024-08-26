package com.obsquraupskill.mavenupkillproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelRead {

	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static String readStringData(int row, int column) throws Exception
	{
		fis = new FileInputStream("D:\\Automation Learings\\Book1.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		XSSFRow r = sheet.getRow(row);
		XSSFCell c = r.getCell(column);
		return c.getStringCellValue();
	}
	public static double readNumericData (int row, int column) throws Exception
	{
		fis = new FileInputStream("D:\\Automation Learings\\Book1.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet ("Sheet1");
		Row r = sheet.getRow(row);
		Cell c = r.getCell(column);
		return c.getNumericCellValue();
	}
}