package callingPackage;

public class Customer {
	String customerName;
	String customerPassword;
	double customerBalance;
public Customer(String name,String password,double balance) {
		this.customerName=name;
		this.customerPassword=password;
		this.customerBalance=balance;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerPassword
	 */
	public String getCustomerPassword() {
		return customerPassword;
	}
	/**
	 * @param customerPassword the customerPassword to set
	 */
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	/**
	 * @return the balance
	 */
	
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		
		//this.customerBalance = balance;
		customerBalance=customerBalance+balance;
	}
	public double getCustomerBalance() {
		
	
		return customerBalance;
	}
	public void withdrawaMoney(double withdrawaAmount) {
		this.customerBalance=this.customerBalance-withdrawaAmount;
	}
	
}
