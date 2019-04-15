package resoursesPackage;

public class Manger_Class {
String customerName;
double balance;
public Manger_Class(String name,double totalCash) {
	this.customerName=name;
	this.balance=totalCash;
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
