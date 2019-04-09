package javaW3Resourse;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the String :   ");
		String InputValue= in.next();
		
		int count=0;
		for(int i=0;i<InputValue.length();i++) {
			if (InputValue.charAt(i)=='a' || InputValue.charAt(i)=='i')
			                                            
			{
				count++;
			}
		}
		
		System.out.println("Total Vowels are :   " + count);
	//	boolean count =vowels.contentEquals("a,e,o,i,u");
		//System.out.println(count);
	
	}

}
