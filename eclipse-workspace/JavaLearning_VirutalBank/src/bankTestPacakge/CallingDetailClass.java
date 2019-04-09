package bankTestPacakge;

import java.util.List;

public class CallingDetailClass {

	public static void main(String[] args) {
		Bank bank =new Bank();
		Customer cust=new Customer("bablu",34,3000);
		 Customer cust1=new Customer("silver",35,2000);
		 Customer cust2=new Customer("gold",25,2300);
		 Customer cust3=new Customer("tom",29,1500);
		 
		bank.AddCustomer(cust);
		bank.AddCustomer(cust1);
		bank.AddCustomer(cust2);
		bank.AddCustomer(cust3);
		bank.AddCustomer(new Customer("Aamina",33,5550));
		bank.AddCustomer(new Customer("Aafiya",24,4550));
		bank.AddCustomer(new Customer("Sam",19,7550));
		bank.AddCustomer(new Customer("Kim",64,2500));
		bank.AddCustomer(new Customer("Lola",34,1500));
		
		//cust.getCustomeBalance();
		
	/*double balance=	bank.checkCustomerBalance("tom");
	System.out.println(balance);*/
	
	/*Double totalBalance=bank.TotalBalanceCheck();
	System.out.println(" Total Balance in bank is : "+totalBalance);*/
	
	/*double depositTotal=bank.depositMoney("gold",3000);
	System.out.println("you have deposited 3000 :" + ":" + " total balance is : " +depositTotal);*/
	
	/*double remainingMoney=bank.withdrawMoney("Aamina",400);
	System.out.println("You have withdrawn 400 :" +" : "  +"Your remaining Balnce is : " +remainingMoney);
	
	String  custNewName=bank.changeCustomerName("tom");
	System.out.println("Your Current name was tom  "+ " your new name is" +custNewName);
	
	//bank.removeCustomer("Aamina");
	
System.out.println("These are all customers who have less then 3000 balance in their account :-> ");

	List<Customer> newList=	bank.accounts(2500);
	double temList=newList.size();
	for(Customer details:newList) {
		
		System.out.println(details.getCustomeName()+" ,"+details.getCustomeAge()+","+details.getCustomeBalance());
	 }
	
	
	
	*/
	/*int newCust=	bank.addNewCustomer("kam", 34, 3000);
	System.out.println("This is new customer  :"+newCust);
		
	}*/
	bank.findCustomer("Kim");
	
	}
}
