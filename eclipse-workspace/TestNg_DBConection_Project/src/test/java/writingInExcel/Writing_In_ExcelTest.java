package writingInExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class Writing_In_ExcelTest {
	static String filePath="E://Library//TestNgExcelSheet//TestNgSheet.xlsx";
	static String sheetName="TestNg_ExcelSheet";
	public static Workbook workbook;
	public static Sheet sheet;
	public static FileInputStream file;
	public static FileOutputStream fileoutput;
	public static Row row;
	public static Cell cell;
	
	public static void main(String[] args) throws FileNotFoundException {
		String[][] logInDetails=new String[][] 
				{{"tom","abc","take","hello"},
			{"tom","abc","take","hello"},
			{"tom","abc","take","hello"}
};
						
						TestNg_WriteExcelFile(filePath,logInDetails);	
	}
	
	public static void TestNg_WriteExcelFile(String path,String [][] data) throws FileNotFoundException {
		int k;
		try {
			file=new FileInputStream(filePath);
			workbook=WorkbookFactory.create(file);
			sheet=workbook.getSheet(sheetName);
			int noOfRows=data.length;
			int noOfelements=data[0].length;
			int rowCount=sheet.getLastRowNum();
			System.out.println(rowCount);
		
		row=sheet.createRow(++rowCount);
		
		for(int i=0;i<noOfRows;i++) {
		row=sheet.createRow(rowCount+i+1);
		
		for( k=0;k<noOfelements;k++) {
		cell=row.createCell(k);
		sheet.getRow(rowCount+i+1).getCell(i).setCellValue(data[i][k]);
			}//end inside for loop
		}//outside for loop
					
			fileoutput = new FileOutputStream(filePath);
			workbook.write(fileoutput);
			fileoutput.flush();
			fileoutput.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
		}
}
