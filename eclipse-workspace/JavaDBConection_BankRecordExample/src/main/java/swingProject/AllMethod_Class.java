package swingProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllMethod_Class {
FileInputStream file;
Sheet sheet;
Customer objCust;

public List<Customer> getEmployeFromFile(String sheetName,String filePath){
	List<Customer> customerList=new ArrayList<Customer>();
	try {
		file=new FileInputStream(filePath);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		sheet=workbook.getSheet(sheetName);
		int totalRow=sheet.getLastRowNum();
		System.out.println(totalRow);
		Row firstRow=sheet.getRow(0);
		int totalCell=firstRow.getLastCellNum();
		System.out.println(totalCell);
		
		for(int row=1;row<totalRow;row++) {
			for(int i=0;i<totalCell;i++) {
				String name=sheet.getRow(row).getCell(i).getStringCellValue();
				String password=sheet.getRow(row).getCell(i+1).getStringCellValue();
							
				int balance=(int)Math.round(sheet.getRow(row).getCell(i+2).getNumericCellValue());
				objCust=new Customer(name,password,balance);
				customerList.add(objCust);
			}//end inside for loop
			
		}//end for loop
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException IE) {
		System.out.println(IE.getMessage());
	}
	return customerList;
	
	}//end method



public static boolean authanticateEmploye(List<Employe>EmployeList,String empName) {
	boolean authorised=false;
	for(Employe name:EmployeList) {
		String nameOfEmp=name.getEmpName();
		if(nameOfEmp.equalsIgnoreCase(empName)) {
			authorised=true;
			System.out.println("This Employe Work In This Company : "+authorised);
		}//end of if loop
	}//end of for loop
	return authorised;
	}//end AuthenticateMethod
}//end class