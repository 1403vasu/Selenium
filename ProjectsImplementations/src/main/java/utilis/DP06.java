package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP06 {
	@DataProvider(name = "saloon")
 public static String[][] saloon(){
		String[][]test = null;
		try {
			FileInputStream fis = new FileInputStream("./testdata/TC06.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			int rows = sh.getLastRowNum();
			int col = sh.getRow(0).getLastCellNum();
			System.out.println(rows);
			System.out.println(col);
			test = new String[rows][col];
			for(int i =1; i<=rows; i++) {
				XSSFRow ro = sh.getRow(i);
				for(int j =0; j<col; j++) {
					String cellvalue=ro.getCell(j).getStringCellValue();
					System.out.println("The Value of  row "+(i-1)+"  and column "+j+" is : "+cellvalue );
					test[i-1][j]=cellvalue;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return test;
 }
}
