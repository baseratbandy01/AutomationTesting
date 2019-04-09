package javaCollections23Nov;

import java.util.ArrayList;

public class ExrciseTestOnCollections {

	public static void main(String[] args) {
		int a[]= {4,5,5,5,4,4,6,6,7,4,9};
		ArrayList<Integer>ab= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				/*System.out.println("Value of a is: "+a[i]);
				System.out.println("This Value of a is repeated this much time : " +k);*/
				if(k==1) {
					System.out.println(a[i]+ " this is unique number");
				}
			}
			
		}

	}

}
