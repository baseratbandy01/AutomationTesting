package javaW3Resourse;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
import java.util.List;

public class JavaCollections {

	public static void main(String[] args) {
		//ex1 
		//List<String> retList =AddColoursToArray();
		//System.out.println(retList);
		//ex3
		// List<String> element=AddAtFirstPostion();
		// System.out.println(element.get(1));
		 
		 //ex5
		/* List<String> updata=UpdateAarry();
		 System.out.println(updata);
		 updata.set(2, "Bye");
		 System.out.println(updata);
		 updata.remove(3);
		 System.out.println(updata);*/
		 
		/* List<String> search=SearchAarry();
		 System.out.println(search);
		 if(search.contains("Thanks")) {
			 System.out.println("found It");
		 }
		 else {
			 System.out.println("no such element");
		 }*/
		 List <String> sorting =SortAarry();
		 System.out.println("list before sorting: " +sorting);
		 Collections.sort(sorting);
		 System.out.println("After sorting: " +sorting);
	}
	
	//example 1
	public static  List<String> AddColoursToArray() {
		
		List<String> list_string=new ArrayList<String>();
		
		list_string.add("blue");
		list_string.add("red");
		list_string.add("orange");
		list_string.add("green");
		return list_string;
	}

	//example 3 add something at first postion
	public static  List<String> AddAtFirstPostion(){
		
		List<String> list_string=new ArrayList<String>();
		list_string.add(0, "Hello");
		list_string.add(1, "Fine");
		list_string.add(2, "Thanks");
		list_string.add(3, "Bye");
			return list_string;
			}
	
	//Ex 5,6 update aarray ,remove
	public static  List<String> UpdateAarry(){
		
		List<String> list_string=new ArrayList<String>();
		list_string.add(0, "Hello");
		list_string.add(1, "Fine");
		list_string.add(2, "Thanks");
		list_string.add(3, "good");
		list_string.add(4, "great");
			return list_string;
			}
	//Exe7 search an element
	
	public static  List<String> SearchAarry(){
	
	List<String> list_string=new ArrayList<String>();
	list_string.add(0, "Hello");
	list_string.add(1, "Fine");
	list_string.add(2, "Thanks");
	list_string.add(3, "good");
	return list_string;
   }
	//Ex8 sorting
	public static  List<String> SortAarry(){
			
		List<String> list_string=new ArrayList<String>();
			list_string.add("Basirat");
			list_string.add("Irfan");
			list_string.add("Aamina");
			list_string.add("Aafiya");
			
			return list_string;
			}
}
