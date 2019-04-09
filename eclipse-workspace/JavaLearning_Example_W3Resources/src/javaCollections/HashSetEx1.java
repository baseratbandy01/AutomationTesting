package javaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetEx1 {

	public static void main(String[] args) {
	/*	HashSet<String> result=TestingHashSet();
		System.out.println("List of HashSet: " +result);
	HashSet<String> iteratedList=	IterateTest();
		System.out.println("Iterated List of HashSet: " +iteratedList);
		EmptyHashSet();
		cloneTest();*/
		/*ChangeToArry();
		CompareTwoHasSet();*/
		retainelements();
	}
	//Exe1
		public static HashSet<String>TestingHashSet(){
		HashSet<String> h_Set=new HashSet<String>();
		h_Set.add("Hello");
		h_Set.add("Great");
		h_Set.add("Good");
		h_Set.add("Bye");
		return h_Set;
	}
	//Exe2 iterate
		public static HashSet<String> IterateTest(){
			HashSet<String> h_Set=new HashSet<String>();
			h_Set.add("Hello");
			h_Set.add("Great");
			h_Set.add("Good");
			h_Set.add("Bye");
		Iterator<String>it=	h_Set.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
			return h_Set;
		}
		//exe4 removing or empty or not element
		public static void EmptyHashSet(){
					
					HashSet<String> h_Set=new HashSet<String>();
					h_Set.add("Hello");
					h_Set.add("Great");
					h_Set.add("Good");
					h_Set.add("Bye");
					System.out.println("Before remove command:"+h_Set);
					System.out.println(h_Set.isEmpty());
					h_Set.removeAll(h_Set);
					System.out.println("All elements removed: "+h_Set );
					System.out.println(h_Set.isEmpty());
					
				}
		public static void cloneTest(){
	HashSet<String> h_Set=new HashSet<String>();
	h_Set.add("Hello");
	h_Set.add("Great");
	h_Set.add("Good");
	h_Set.add("Bye");
	HashSet<String>  new_h_Set=new HashSet<String>();
	new_h_Set=(HashSet)h_Set.clone();
	System.out.println("Cloned Has Set: " +new_h_Set);
	
}
		//exe7 and 9 
		public static void ChangeToArry(){
			HashSet<String> h_Set=new HashSet<String>();
			h_Set.add("Hello");
			h_Set.add("Great");
			h_Set.add("Good");
			h_Set.add("Bye");
			String []  new_Array=new String[(h_Set.size())];
			h_Set.toArray(new_Array);
			for(String Element: new_Array) {
				System.out.println(Element);
			}
			List<String>list_Array=new ArrayList<String>(h_Set);
			System.out.println(list_Array);
		
		}
		public static void CompareTwoHasSet(){
			HashSet<String> h_Set=new HashSet<String>();
			h_Set.add("Hello");
			h_Set.add("Great");
			h_Set.add("Good");
			h_Set.add("Bye");
			HashSet<String> h_Set2=new HashSet<String>();
			h_Set2.add("Hello");
			h_Set2.add("Great");
			h_Set2.add("thanks");
			h_Set2.add("what");
			for(String CompareElements:h_Set) {
				System.out.println(h_Set2.contains(CompareElements)? "Yes":"No");
			}
			
		}
		//exe 10
		public static void retainelements(){
			HashSet<String> h_Set=new HashSet<String>();
			h_Set.add("Hello");
			h_Set.add("Great");
			h_Set.add("Good");
			h_Set.add("Bye");
			HashSet<String> h_Set2=new HashSet<String>();
			h_Set2.add("Hello");
			h_Set2.add("Great");
			h_Set2.add("thanks");
			h_Set2.add("what");
			h_Set.retainAll(h_Set2);
			System.out.println("Hash Set Contents: " );
			System.out.println(h_Set);
			 
	          
			
		}
}