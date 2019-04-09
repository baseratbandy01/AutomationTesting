package arrayExamples;

import java.util.Arrays;

public class ArrayClassExe {

	public static void main(String[] args) {
		averageCal();
		//CopyArray();
	}
	//Exe4,5 average calcultation
	public static void averageCal() {
		int []numbers=new int[] {12,3,45,16,24};
		int sum=0;
		int Average;
		System.out.println(numbers.equals(45));
		for(int i=0;i<numbers.length;i++) {
			sum= sum+numbers[i];
			System.out.println(sum);
		}
		Average=sum/numbers.length;
		System.out.println(Average);
	}
	//ex8 to copy
	public static void CopyArray() {
		int []numbers=new int[] {12,3,45,16,24};
		int[]insertnumber=new int [numbers.length];
			
		int[]copynumbers=new int [numbers.length];
		for(int i=0;i<numbers.length;i++) {
			copynumbers[i]= numbers[i];
					}
		System.out.println(Arrays.toString(copynumbers));
		
	}
	 
}

