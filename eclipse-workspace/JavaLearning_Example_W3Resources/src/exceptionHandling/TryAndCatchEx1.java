package exceptionHandling;

public class TryAndCatchEx1 {

	public static void main(String[] args) {
		/*int num1=60;
		int num2=0;
		int result;
		try {
			System.out.println("I am in of try catch block");
			result=num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("I am out of try catch block");*/
		
		//numberFormatExceptio();
		//stringIndexOutOfBoundExc();
		//MultiplyCatches();
		//finallyBlockExample();
		//System.out.println(TryAndCatchEx1.myMethod());
		//finallyBlockSystemEXit();
		finallyBlockRunBeforeCacth();
			}
	public static void numberFormatExceptio()
	{
		try {
			int num=Integer.parseInt("abc");
			System.out.println(num);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe.getMessage());
		}	
		System.out.println("error is found string cannot be parased to int");
	}
	public static void stringIndexOutOfBoundExc() {
		String str="abcdefgh";
		try {
			System.out.println("Length of the String is : " +str.length());
			System.out.println(str.charAt(3));
			System.out.println(str.charAt(20));
		}
		catch(StringIndexOutOfBoundsException Io) {
			System.out.println(Io.getMessage());
		}
		System.out.println("Error is IndexBound Exception");
	}
	public static void MultiplyCatches() {
		try {
			int arry[]=new int[8];
			System.out.println("i am in try block");
			arry[4]=40/0;

		}
		catch(ArrayStoreException Ae) {
			System.out.println("It is ArrayIndexOfBOundException: " +Ae.getMessage());
		}
		catch(ArithmeticException arth) {
			System.out.println("It is an ArithmeticException: " +arth.getMessage());
		}
		catch(Exception e) {
			System.out.println("It is an Exception: " +e.getMessage());

		}
		System.out.println("I am out of try catch block");
	}
	public static void finallyBlockExample() {
		int num1=80;
		int num2=0;
		int num3=4;
		try {
			System.out.println("this is try block example for fanillay");
			System.out.println(num1/num2);
		}
		catch(ArithmeticException Ae) {
			System.out.println("this is error message: " +Ae.getMessage());
		}
		finally {
			System.out.println("Do this calculation : " +num1/num3);
			
		}
		System.out.println("Out of try-catch-finally"); 
	}
	public static int myMethod() {

		try {
			return 555;
		}
		finally {
			System.out.println("Finally block ran even after return statement");
		}
	}
	public static void finallyBlockSystemEXit() {
		try {
			System.out.println("I am in of try catch block");
			System.exit(0);
		}
		//system.exit()get called without exception then finally block wont excute 
		//However if any exception occurs while calling System.exit(0) then finally block will be executed.
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
		finally {
			System.out.println("System gots lots of its own methodes");
		}
		
	}
	public static void finallyBlockRunBeforeCacth() {
	//In this example because exception was arthimetic so it run first finally then throw exception
	try{
        System.out.println("First statement of try block");
        int num=45/0;
        System.out.println(num);
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException");
     }
     finally{
        System.out.println("finally block");
     }
     System.out.println("Out of try-catch-finally block");
}
   }
