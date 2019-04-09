package javaW3Resourse;

import java.util.Scanner;

public class CountWordsOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input String :    ");
		String str=in.nextLine();
		
		
		System.out.println("Number of words : " +WordCount(str));
		System.out.println("replaced space : " +ReplaceSpace(str));
	}
	
		public static int WordCount(String inputString) {
			int lengthOfString =inputString.length();
			int count=0;
			for(int i =0;i<lengthOfString;i++) {
				if(inputString.charAt(i)== ' ' ) {
					count++;
				}
			}
			return count+1; 
		}
		public static int ReplaceSpace(String inputString) {
			int lengthOfString =inputString.length();
			int count=0;
			for(int i =0;i<lengthOfString;i++) {
				if(inputString.charAt(i)== ' ') {
					//char c=inputString.charAt(i);
					//c.replace(' ','.');
					inputString.replace(' ', '.');
					count++;
				}
			}
			return count+1; 
		}
		
}
