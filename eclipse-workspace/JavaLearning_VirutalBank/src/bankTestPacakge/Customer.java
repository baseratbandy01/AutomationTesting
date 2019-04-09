package bankTestPacakge;

public class Customer {
	String customerName;
	int customerAge;
	double customerBalance;
 public Customer(String customerName,int customerAge,double customerBalance) {
	 this.customerName = customerName;
	 this.customerAge=customerAge;
	 this.customerBalance=customerBalance;
 }
/**
 * @return the customeName
 */
public String getCustomeName() {
	
	return customerName;
}
/**
 * @param customeName the customeName to set
 */
public void setCustomeName(String customeName) {
	this.customerName = customerName;
}
/**
 * @return the customeAge
 */
public int getCustomeAge() {
	return customerAge;
}
/**
 * @param customeAge the customeAge to set
 */
public void setCustomeAge(int customeAge) {
	this.customerAge = customerAge;
}
/**
 * @return the customeBalance
 */
public double getCustomeBalance() {
	return customerBalance;
}
/**
 * @param customeBalance the customeBalance to set
 */
public void setCustomeBalance(double depositAmount) {
	this.customerBalance=depositAmount;
	//this.customerBalance = this.customerBalance+depositAmount;
	
}
public void withDrawMoney(double withdrawAmount) {
	
	this.customerBalance = this.customerBalance-withdrawAmount;
	
}
}
