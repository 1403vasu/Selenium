package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP04 {
	@DataProvider(name = "fetch")
public static String [][] irctregpage() {
		
	String value[][]=null;
	 try {
		FileInputStream ip = new FileInputStream("./testdata/TC04.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh = wb.getSheetAt(0);
		int rowcount =sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colcount);
		value = new String [rowcount][colcount];
		for(int i =1; i<=rowcount;i++) {
			XSSFRow row = sh.getRow(i);
			for(int j =0; j<colcount;j++) {
				String cellvalue	=row.getCell(j).getStringCellValue();
				System.out.println("The Value of  row "+(i-1)+"  and column "+j+" is : "+cellvalue );
				value[i-1][j] = cellvalue;
				
		}
		}
	 }
		
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return value;
}
}

