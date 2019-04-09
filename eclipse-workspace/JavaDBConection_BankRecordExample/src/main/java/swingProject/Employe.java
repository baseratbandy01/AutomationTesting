package swingProject;

public class Employe {
String empName;
int empAge;
double empSalary;
	public Employe(String name,int age,double salery) {
		this.empName=name;
		this.empAge=age;
		this.empSalary=salery;
	}//end constructor
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}//end get method
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}//end set method
	/**
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}//end getage method
	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}//end setAgeMethod
	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}//end GetSaleryMethod
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}//end setSaleryMethod
	
	
}//end class
