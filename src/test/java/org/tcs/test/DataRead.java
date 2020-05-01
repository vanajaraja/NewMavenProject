package org.tcs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DataRead {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\FirstSamMavenProject\\Drivers\\chromedriver.exe");
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		*/
		File f = new File("C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\FirstSamMavenProject\\Data\\InputDataSheet1.xlsx");
		
	/*	Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Data");
		Row row1 = sheet.createRow(0);
		Cell c11 = row1.createCell(0);
		c11.setCellValue("StudentName");
		Cell c12 = row1.createCell(1);
		c12.setCellValue("ClassName");
		Cell c13 = row1.createCell(2);
		c13.setCellValue("StudentId");
		Cell c14 = row1.createCell(3);
		c14.setCellValue("CStartDate");
		Cell c15 = row1.createCell(4);
		c15.setCellValue("PhoneNumber");
		
		Row row2 = sheet.createRow(1);
		Cell c21 = row2.createCell(0);
		c21.setCellValue("Vanaja");
		Cell c22 = row2.createCell(1);
		c22.setCellValue("Selenium");
		Cell c23 = row2.createCell(2);
		c23.setCellValue("510219");
		Cell c24 = row2.createCell(3);
		c24.setCellValue("2020-01-01");
		Cell c25 = row2.createCell(4);
		c25.setCellValue("7639665323");
				
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Data sheet created Sucessfully");*/
		
		
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Data");
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows in the data sheet" + numberOfRows);
		
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheet.getRow(i);
			
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cc = row.getCell(j);
				//System.out.println(cc);
				
				CellType cellType = cc.getCellType();
				//System.out.println(cellType);
				
					
				if (cellType.equals("STRING"))
				{
					String cellValue = cc.getStringCellValue();
					System.out.println(cellValue);
				}
				
				else if (cellType.equals("DATE"))
				{
					Date dateCellValue = cc.getDateCellValue();
					
					SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
					String dateafterFormatted = sd.format(dateCellValue);
					System.out.println(dateafterFormatted);
				}
				/*else
				{
					double numericCellValue = cc.getNumericCellValue();
					long phonenum = (long)numericCellValue;
					
					System.out.println("Phone Number is " +phonenum);
					
				}*/
				
				
			}
			
		}
		
		
		
		
		
	}
	

	
}
