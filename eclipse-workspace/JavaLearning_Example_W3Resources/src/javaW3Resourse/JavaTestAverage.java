package javaW3Resourse;

import java.util.Scanner;

public class JavaTestAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the num1:  ");
		int x=in.nextInt();
		System.out.println("Input the num2:  ");
		int y=in.nextInt();
		System.out.println("Input the num3:  ");
			int z=in.nextInt();
			int result=Average(x,y,z);
			System.out.println("Avarage vale is :  " + result);
	}
		public static int Average(int x,int y,int z) {
			
			return (x+y+z)/3;
		}
}

	
