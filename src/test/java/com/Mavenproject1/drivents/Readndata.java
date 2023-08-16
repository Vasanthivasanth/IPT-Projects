package com.Mavenproject1.drivents;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readndata {

	public static void main(String[] args) throws Exception
	{
		
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenproject1\\xlsheet\\Drivenread.xlsx");
	 FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
XSSFCell cell=row.getCell(0);
		
System.out.println(cell);
	}

}
