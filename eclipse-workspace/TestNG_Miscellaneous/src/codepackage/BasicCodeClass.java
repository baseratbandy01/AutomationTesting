package codepackage;

public class BasicCodeClass {
	
	public  int sumNumber(int a,int b) {
	int total;
	return total=a+b;

	}
	public String addStrings(String str1,String str2) {
		String newstr=str1.concat(str2);
		 System.out.println("String without space :"+newstr);
		return str1+ " " +str2;
		
	}
	public int[] getArray() {
		int[] array1= {1,2,3,4};
		return array1;
	}
}
