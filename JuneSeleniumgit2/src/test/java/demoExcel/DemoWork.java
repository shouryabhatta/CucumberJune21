package demoExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DemoWork {
  @Test
	  public void f() throws IOException {
		  XSSFWorkbook wb=new XSSFWorkbook();
	      FileOutputStream out=new  FileOutputStream(new File("DemoWB.xlsx"));
	      wb.write(out);
	      out.close();
	      System.out.println("DemoWB.xlsx is created and written successfully");
  }
}
