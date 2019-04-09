package loopingJavaTets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerCalling {
	
	private static Customer[] arrayOfEmps= {
		    new Customer(1, "Jeff Bezos"), 
		    new Customer(2, "Bill Gates"), 
		    new Customer(3, "Mark Zuckerberg")
		};
	
	public static void main(String[] args) {
			
		
		Customer cust = new Customer(1, "bas");
		Customer cust1 = new Customer(2, "irfan");
		Customer cust2 = new Customer(3, "Amy");
		Customer cust3 = new Customer(4, "AAf");
		
		List<Customer> customers=new ArrayList<Customer>();
		
		customers.add(new Customer(1, "bas"));
		
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		
		Customer result=findName("irfan",customers);
		System.out.println(result.getId());
		Customer Foundresult=FindId("AAf",customers);
		System.out.println(Foundresult.getId());
			}
	
	public static Customer findName(String name, List<Customer>customers) {
		Iterator<Customer> It=customers.iterator();
			while(It.hasNext()) {
				Customer customer=It.next();
				if( customer.getName().equals(name)){
					return customer;
				}
			}
			return null;
			
		}
	
	
	public static Customer FindId(String name, List<Customer>customers) {
		
		for(Customer customer: customers) {
			if(customer.getName().equals(name)) {
				return customer;
			}
		}
		return null;	
	}

}
