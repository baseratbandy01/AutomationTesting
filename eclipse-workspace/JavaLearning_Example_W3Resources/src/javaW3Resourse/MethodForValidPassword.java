package javaW3Resourse;

import java.util.Scanner;

public class MethodForValidPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("InputPassword  ");
		String Password=in.nextLine();
		System.out.println(Password(Password));

	}
	public static String Password(String pwd) {
		String result = new String();
		if(pwd.length() <=10 ) {
			result = "Password is valid";
			System.out.println("Password is valid");
			
		}else
		{
			result="password is invalid";
		}
		return result;
	}

}
