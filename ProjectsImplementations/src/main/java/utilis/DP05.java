package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP05 {
@DataProvider(name="coach")
public static String[][] bookyourcoach() {
	String data[][]=null;
	try {
		FileInputStream fis = new FileInputStream("./testdata/TC05.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh =wb.getSheetAt(0);
		int row = sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		 data= new String [row][col];
		 for(int i =1; i<=row;i++) {
				XSSFRow rows = sh.getRow(i);
				
				for(int j =0; j<col;j++) {
				String celldata	=rows.getCell(j).getStringCellValue();
				System.out.println("The Value of  row "+(i-1)+"  and column "+j+" is : "+celldata );
				data[i-1][j]= celldata;
			 }
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;

}
}
