package com.Mavenproject1.drivents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleDataread {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenproject1\\xlsheet\\Drivenread.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
	
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=row;r++)
		{
		XSSFRow row1=sheet.getRow(r);
		
		for(int c=0;c<cell;c++)
		{
			XSSFCell cell2=row1.getCell(c);
			switch(cell2.getCellType()) {
			case STRING:System.out.print(cell2.getStringCellValue());
			break;
			case NUMERIC:System.out.print(cell2.getNumericCellValue());
			break;
			}
			System.out.print(" |  ");
		}
		System.out.println();
			
		}
		
		}
				


	}


