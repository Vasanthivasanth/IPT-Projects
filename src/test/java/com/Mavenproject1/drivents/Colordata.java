package com.Mavenproject1.drivents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Colordata {

	public static void main(String[] args) throws IOException  {
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenproject1\\xlsheet\\Drivenread.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Sheet1");
//		wb.getSheet("colour").createRow(0).createCell(0).setCellValue("Name");
		XSSFRow row=sheet1.createRow(0);
		XSSFCellStyle cellstyle=wb.createCellStyle();
		//cellstyle.setFillBackgroundColor(IndexedColors.BROWN.getIndex());
		cellstyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		cellstyle.setFillPattern(FillPatternType.DIAMONDS);
		
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("flower");
		cell.setCellStyle(cellstyle);
		FileOutputStream fos=new  FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
}