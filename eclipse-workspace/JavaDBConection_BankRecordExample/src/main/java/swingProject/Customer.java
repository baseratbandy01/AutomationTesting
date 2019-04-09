package swingProject;

public class Customer {
String customerName;
String customerPassword;
double balance;
public Customer(String name,String pwd,double balance) {
	this.customerName=name;
	this.customerPassword=pwd;
	this.balance=balance;
	}//end constructor
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
public double getBalance() {
	return balance;
}
/**
 * @param balance the balance to set
 */
public void setBalance(double balance) {
	this.balance = balance;
}

}//end class
