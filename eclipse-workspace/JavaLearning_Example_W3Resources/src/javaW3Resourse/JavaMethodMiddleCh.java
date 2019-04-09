package javaW3Resourse;

import java.util.Scanner;

public class JavaMethodMiddleCh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input string :  ");
		String str=in.next();
		int length=str.length();
		int half=length/2;
	char ch=	str.charAt(half);
		System.out.println("the middle Number is : " + ch );
	}

}
