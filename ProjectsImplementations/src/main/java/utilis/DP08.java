package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP08 {
	@DataProvider(name="validation")
public static String[][] op(){
		String datavars[][]=null;
		try {
			FileInputStream ip = new FileInputStream("./testdata/TC08.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(ip);
			XSSFSheet sh =wb.getSheetAt(0);
			int row =sh.getLastRowNum();
			int col =sh.getRow(0).getLastCellNum();
			System.out.println(row);
			System.out.println(col);
			datavars = new String[row][col];
			for(int i=1;i<=row;i++) {
				XSSFRow ro = sh.getRow(i);
				for(int j =0; j<col;j++) {
				  String celldata =ro.getCell(j).getStringCellValue();
				  System.out.println("The Value of  row "+(i-1)+"  and column "+j+" is : "+celldata);
				  datavars[i-1][j]=celldata;
				}
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return datavars;
	
}
}
