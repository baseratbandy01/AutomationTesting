package callingPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class CallingClass {
static String filepath="E://Library//BankTest//CustomerDetails.xlsx";
static String sheetName="CustomerInfo";
XSSFSheet sheet;
static Customer objCustomer;
static String customerName;
static double depositeAmount;
	public static void main(String[] args) {
	List<Customer> listOfCustomer=getEmployeFromFile(sheetName,filepath);
	Scanner custName=new Scanner(System.in);
	System.out.println("Enter Name");
	customerName=custName.nextLine();
	Scanner depositeMoney=new Scanner(System.in);
	System.out.println("Enter Amount");
	depositeAmount=depositeMoney.nextDouble();
		boolean bankCustomer=authentication(listOfCustomer,customerName);
		if(bankCustomer) {
			
			for(Customer name:listOfCustomer) {
				String givenName=name.getCustomerName();
				if(givenName.equalsIgnoreCase(customerName)) {
				System.out.println(" You Current balance is: "+name.getCustomerBalance());
			}//end inside loop
			}//end for loop
			System.out.println("Welcome to your online banking: ");
		}//end outside if loop
		else {
			System.out.println("Sorry try again :");
		}//end else loop
		double money=depoisteMoney(listOfCustomer,customerName,depositeAmount);
		
		Scanner Name=new Scanner(System.in);
		System.out.println("Enter Name");
		customerName=Name.nextLine();
		Scanner withdrawAmount=new Scanner(System.in);
		System.out.println("Enter Amount:");
		double	withDrawMoney=withdrawAmount.nextDouble();
		double currentbalance=withDrawMoney(listOfCustomer,customerName,withDrawMoney);
	}//end main method
	public static List<Customer> getEmployeFromFile(String sheetName,String Path){
		List<Customer> customerList=new ArrayList<Customer>();
		try {
			FileInputStream file=new FileInputStream(Path);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			int totalRow=sheet.getLastRowNum();
			System.out.println(totalRow);
			Row firstRow=sheet.getRow(0);
			int totalCell=firstRow.getLastCellNum();
			for(int j=1;j<totalRow;j++) {
				
					String name=sheet.getRow(j).getCell(0).getStringCellValue();
					String password=sheet.getRow(j).getCell(1).getStringCellValue();
					int balance=(int)Math.round(sheet.getRow(j).getCell(2).getNumericCellValue());
					objCustomer=new Customer (name,password,balance);
					customerList.add(objCustomer);
						
				
			}//end outside for loop
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
			
		} catch (IOException IO) {
			System.out.println(IO.getMessage());
		}
		
		return customerList;
		
	}//end method

	
	public static boolean authentication(List<Customer> listOfCustomer,String customerName) {
		boolean authorised=false;
		for(Customer name:listOfCustomer) {
			String custName=name.getCustomerName();
			if(custName.equalsIgnoreCase(customerName)) {
				authorised=true;
			}//end if loop
			
		}//end for loop
		return authorised;
		
	}//end method


	public static double depoisteMoney(List<Customer> listOfCustomer,String nameOfCustomer,double depositeMoney) {
	double newBalance=0;
	for(Customer name:listOfCustomer) {
		String custName=name.getCustomerName();
		if(custName.equalsIgnoreCase(nameOfCustomer)) {
			name.setBalance(depositeMoney);
			System.out.println("Succesfully ! ");
			
			double currentBalance=name.getCustomerBalance();
		
			System.out.println("This is your new balance: " +currentBalance);
			
					}//end if loop
				}//end for loop
	return depositeMoney;
			}//end method
	public static double withDrawMoney(List<Customer> listOfCustomer,String customerName,double withdrawMoney) {
	double newBalance;
	for(Customer name:listOfCustomer) {
		String custName=name.getCustomerName();
		if(custName.equalsIgnoreCase(customerName)) {
			name.withdrawaMoney(withdrawMoney);
			System.out.println("The amount has been Succesfully withdrwan from your accounts:");
			 newBalance=name.getCustomerBalance();
			 System.out.println("This is your new balance after Money was withdrawn: " +newBalance);
		}//end if loop
	}//end for loop
	return depositeAmount;
	
}
}//end class
