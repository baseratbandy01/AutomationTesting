package javaCollections23Nov;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTypeJave {
	String Name;
	//int Id;
	String Address;
//	int age;
	// int balance;
//first example for arrayList
	public static void main(String[] args) {
		
		ArrayList<String> Details=CustomerRecords("Basirat","glenth worth");
		ArrayList<String> Details1=CustomerRecords("irfan","glenth worth");
		System.out.println(Details);
		System.out.println(Details1);
	}
	public static ArrayList<String> CustomerRecords(String name,String address) {
		ArrayList<String> array=new ArrayList<String>();
		array.add(name);
		array.add(address);
		array.add(0, name);
		
		return array;
		
		
	}
	

}
