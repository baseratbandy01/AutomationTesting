package javaExceptions23Nov18;

	public class ExceptionClassTest {
		static int a=9;
		static int b=0;
		
		
	public static void main(String[] args) {
		
		try {
			
				int k=a/b;
				System.out.println(k);
			}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Print error message : " + e.getMessage());
		}
		catch(ArithmeticException ae){
			System.out.println("It was in this catch"+ae.getMessage());
		} 
		finally {
			int j=a+b;
			System.out.println("print add two number : " +j);
		}
	}
	
	}
