package javaCollections23Nov;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//their is not much difference between hash table
		//Hashtable<Integer,String> hm= new Hashtable<Integer,String>();
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0, "good");
		hm.put(1, "Morning");
		hm.put(2, "Great");
		hm.put(3, "Afternoon");
		hm.put(4, "Evening");
		//System.out.println(hm);
		System.out.println(hm.get(2));
	Set sm=	hm.entrySet();
	System.out.println(sm);
	sm.toArray();
	sm.size();
	Iterator it=sm.iterator();
	//question may be create the hashtable pass table set colletions
	while(it.hasNext()) {
		//System.out.println(it.next());
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	}
	
	}

}
