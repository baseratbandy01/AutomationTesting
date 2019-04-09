package constructorsRole21Nov;

public class ConstructorTest {
//constructor excute block of code where every object is created and will not return any value name of constructor is always class name
	int a;
	int b;
	public ConstructorTest() {
		System.out.println(" I am in the constructor");
	}
	
	
	public ConstructorTest(int a,int b) {
		//this key words bring value from class level
		this.a=a;
		this.b=b;
	}
	public void getdata() {
		System.out.println(" I am the method");
		int sum;
		sum=a+b;
		System.out.println("Sum of two numbers are : " +sum);
	}
	public static void main(String[] args) {
		ConstructorTest ct=new ConstructorTest(4,6);
			ct.getdata();

	}

}
