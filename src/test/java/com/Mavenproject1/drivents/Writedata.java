package com.Mavenproject1.drivents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Writedata {
	static File file;

private  static void sheetCreatewrite() throws IOException
{
		 file=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mavenproject1\\xlsheet\\Drivenread.xlsx");
		 FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.createSheet("write1");
        XSSFRow row=sheet.createRow(0);
        XSSFCell  cell=row.createCell(0);
       cell.setCellValue("Name");
       System.out.println(cell);
	XSSFSheet sheet2=wb.getSheet("write1");
	XSSFRow row2=sheet2.getRow(0);
	XSSFCell cell2=row2.createCell(1);
	cell2.setCellValue("Location");
//	wb.getSheet("writesheet").createRow(1).createCell(1).setCellValue("Vasantha");
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	wb.close();
		
}

       public static void main(String[] args) throws Throwable {
       
    	   sheetCreatewrite();
    	   
       }

}
