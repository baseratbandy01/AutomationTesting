package bankTestPacakge;


import java.util.ArrayList;
import java.util.List;



public class Bank  {

	 	List <Customer> listCustomers=new ArrayList<Customer>();
	 	
	 	public void AddCustomer(Customer cus) {
	 		
	 		listCustomers.add(cus);
	 		
	 			
	 		}
	 		
	 	
	 		
	 	
	 	
	 	public double checkCustomerBalance(String customerName) {
	 		double balance=0;
	 		for(Customer cust:listCustomers) {
	 			String name=cust.getCustomeName();
	 			if(name.equalsIgnoreCase(customerName)) {
	 				 balance= cust.getCustomeBalance();
	 			}
	 			break;
	 		}
	 		return balance;
			
			
		}
	 	public double TotalBalanceCheck( ) {
	 		double cutomerBalance;
	 		double TotalBalance=0;
	 		for(Customer cust:listCustomers) {
	 			cutomerBalance=cust.getCustomeBalance();
	 			TotalBalance=TotalBalance+cutomerBalance;
	 			
	 		}
	 		
			return TotalBalance;
	 		
	 	}
		public double depositMoney(String Name,double depositAmount) {
				double TotalBalannce=0;
			for(Customer cust:listCustomers) {
				String customerName = cust.getCustomeName();
				if(customerName.equalsIgnoreCase(Name)) {
					cust.setCustomeBalance(depositAmount);
					TotalBalannce=cust.getCustomeBalance();
					break;
						}
				
							}
			return TotalBalannce;
				}
			
			
			
		
		public double withdrawMoney(String custName,double withdrawAmount) {
			double totalBalance = 0;
			for(Customer cust:listCustomers) {
				String customerName = cust.getCustomeName();
				if(customerName.equalsIgnoreCase(custName)) {
					
					cust.withDrawMoney(withdrawAmount);
					totalBalance=	cust.getCustomeBalance();
					break;
					}
						}
			return totalBalance;
		}
		
		public String changeCustomerName(String custnameToBeChanged) {
			String CustomerNewName = null;
			for(Customer cust:listCustomers) {
				String customerName = cust.getCustomeName();
				if(customerName.equalsIgnoreCase(custnameToBeChanged)) {
				CustomerNewName=	customerName.replace(custnameToBeChanged, "David");
				break;
						}
				}
			return CustomerNewName;
					}
		
		public void removeCustomer(String customerToBeRemoved) {
			int newCount = 0;
			
			int totalCurrenCust=	listCustomers.size();
			
			
			for(int i=0;i<listCustomers.size();i++) {
				Customer detail=listCustomers.get(i);
			String name=	detail.getCustomeName();
				if(name.equalsIgnoreCase(customerToBeRemoved)) {
					listCustomers.remove(i);
					System.out.println("Customer is removed: " );
					newCount=listCustomers.size();
					break;
				}
				
			}
			System.out.println("Total Current customers are :" +totalCurrenCust + ": " + "New Count After removing customer is:"  + newCount);		;
			
				
				}
		public List <Customer> accounts(double inputAmount) {
			 List<Customer> temList=new ArrayList<Customer>();
			for(Customer cust:listCustomers) {
			double custBalance=	cust.getCustomeBalance();
			if(custBalance<=inputAmount) {
				//String custName=cust.getCustomeName();
				temList.add(cust);
				//System.out.println(custName); 
				
			}
				
			}
			return temList;
		}
		
	 		
		public void findCustomer(String Name) {
			 for(Customer cust:listCustomers) {
				String custName=cust.getCustomeName();
				 if(custName.equalsIgnoreCase(Name)){
					 System.out.println(cust.getCustomeAge());
				 }
			 }
		}
}



