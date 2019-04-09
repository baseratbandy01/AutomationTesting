package arrayExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListLoopExe {

	public static void main(String[] args) {
		forLoopExeample();
		//sortingMethod();
		//addAllMethod();

	}
	public static void forLoopExeample() {
		ArrayList<Integer>arryList=new ArrayList<Integer>(50);
		arryList.add(92);
		arryList.add(72);
		arryList.add(52);
		arryList.add(82);
		//arryList.trimToSize();
		arryList.clear();
		System.out.println(arryList);
		
		/*arryList.set(0, 34);
		arryList.set(1, 54);
		arryList.set(2, 64);
		arryList.set(3, 74);
		System.out.println(arryList);*/
		/*for(Integer num:arryList) {
			System.out.println(num);
		}
		Collections.sort(arryList);
		System.out.println(arryList);*/
		
		/*Iterator It=arryList.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}*/
			}
	public static void sortingMethod() {
		ArrayList<String> arryStr=new ArrayList<String>();
		arryStr.add("Zebra");
		arryStr.add("elephant");
		arryStr.add("cat");
		arryStr.add("yoyke");
		arryStr.add(3, "Hello");
		arryStr.add(2, "Thanks");
		arryStr.add(0, "Bye");
		
		System.out.println("String after adding : " +arryStr);
		System.out.println("After removing: " +arryStr.remove(3));
		/*System.out.println("Before Sorting: ");
		for(String sorting:arryStr) {
			System.out.println(sorting);
		}
		 Collections.sort(arryStr);
		 System.out.println("After sorted : " );
		 System.out.println(arryStr);
		 
		 Collections.sort(arryStr,Collections.reverseOrder());
		 System.out.println(arryStr);*/
	}
	public static void addAllMethod() {
		ArrayList<String>Str1=new ArrayList<String>();
		Str1.add("Hello");
		Str1.add("How");
		Str1.add("Are");
		Str1.add("I");
		Str1.add("am");
		Str1.add("Fine");
		ArrayList<String>Str=new ArrayList<String>();
		System.out.println("After SubListing : " + Str1.subList(1, 4));
		/*ArrayList<String>Str2=new ArrayList<String>();
		Str2.add("You");
		Str2.add("Thanks");
		Str2.add("Bye");
		Str1.addAll(Str2);
		System.out.println(Str1);*/
	}

}
