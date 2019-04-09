package javaW3Resourse;

import java.util.Scanner;

public class JavaMethodSmallestNo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number:  " );
		double firstNo= in.nextDouble();
		
		System.out.println("Input the second number:  " );
		double secondNo= in.nextDouble();
		
		System.out.println("Input the third number:   " );
		double thirdNo= in.nextDouble();
		System.out.print("The smallest value is " + samllest(firstNo,secondNo, thirdNo)+"\n" );
		 
	}
	public static double samllest(double firstNo,double secondNo,double thirdNo) {
		return Math.min(Math.min(firstNo, secondNo), thirdNo);
	}

}
