
package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dp02 {
	
	@DataProvider(name = "fetchdata")
public static String[][] getdata()  {
	
	String[][] testdata= null; 
	
	try {
		FileInputStream ip = new FileInputStream("./testdata/TC02.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet = wb.getSheetAt(0); // sheet index
		int rowcount = sheet.getLastRowNum(); //lastrow
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colcount);
		testdata = new String[rowcount][colcount];
		for(int i =1; i<=rowcount;i++) {
		XSSFRow row = sheet.getRow(i);
		
		for(int j =0; j<colcount;j++) {
		String celldata	=row.getCell(j).getStringCellValue();
		System.out.println("The Value of  row "+(i-1)+"  and column "+j+" is : "+celldata );
		testdata[i-1][j]= celldata;
			
		}
		}	
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return testdata;
}
}
