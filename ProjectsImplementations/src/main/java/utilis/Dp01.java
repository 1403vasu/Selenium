package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dp01 {
@DataProvider(name = "php")
public static  String[][] php() {
	String data[][]=null;
	try {
		FileInputStream fis = new FileInputStream("./testdata/TC01.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colcount);
		data = new String[rowcount][colcount];
		for(int i = 1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j =0; j<colcount;j++) {
				String celvalue =row.getCell(j).getStringCellValue();
				System.out.println("The Value of  row "+(i-1)+"  and column "+j+" is : "+celvalue );
				data[i-1][j]= celvalue;
			}
		}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return data;
	
	
}
}
