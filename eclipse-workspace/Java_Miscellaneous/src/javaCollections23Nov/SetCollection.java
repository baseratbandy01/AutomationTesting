package javaCollections23Nov;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollection {

	public static void main(String[] args) {
		
//Hashset,treeset,linkedHashset implements Set interface
		//does not accept duplictae value
		//their is no gurantee that elemnts stored in sequational order
		HashSet<String> set=new HashSet<String>();
		set.add("USA");
		set.add("UK");
		set.add("India");
		set.add("Jaipur");
		set.add("Srinagr");
		set.add("Palama");
		System.out.println(set);
		set.add("UK");//it wont print duplicate value 
		System.out.println(set.contains("India"));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		 Iterator it=set.iterator();
		 while(it.hasNext()) {
			System.out.println( it.next());
		
		 }
		 System.out.println("I am out from while loop") ;
		 
	}

}
