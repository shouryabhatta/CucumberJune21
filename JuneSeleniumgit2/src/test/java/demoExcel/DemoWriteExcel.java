package demoExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DemoWriteExcel {
  @Test
  public void f() throws IOException {
	  File src=new File("src\\test\\java\\MyFile\\Login.xlsx");
		FileInputStream fls=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fls);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total No.Of Rows is :"+rowCount);

		for(int i=0;i<=rowCount;i++) {
			String Data1=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Column1 Value is :"+Data1);
			String Data2=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Column2 value is :"+Data2);
		}
		sheet1.getRow(0).createCell(2).setCellValue("Result");
		sheet1.getRow(1).createCell(2).setCellValue("Pass");
		sheet1.getRow(2).createCell(2).setCellValue("Pass");
	   sheet1.getRow(3).createCell(2).setCellValue("Pass");
	   
	   FileOutputStream fout=new FileOutputStream("src\\test\\java\\MyFile\\Login.xlsx");
	   wb.write(fout);
	   fout.close();
		
		
  }
}
