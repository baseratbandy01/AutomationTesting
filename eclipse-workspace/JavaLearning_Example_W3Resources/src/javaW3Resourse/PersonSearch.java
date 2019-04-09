package javaW3Resourse;

import java.util.ArrayList;
import java.util.List;

public class PersonSearch {

	public static void main(String[] args) {
		Compare();
		AddTwoArray();
		CheckingArray();
		/*Person p1=new Person("irfan",23);
		Person p2=new Person("Aamina",15);
		Person p3=new Person("Aliya",8);
		
		List<Person> SearchForPerson=new ArrayList<Person>();
		SearchForPerson.add(p1);
		SearchForPerson.add(p2);
		SearchForPerson.add(p3);
	int result_age=searchForPeople(SearchForPerson,"irfan");
		System.out.println(result_age);
				*/
	}
		public static int searchForPeople(List<Person> list_persons,String name) {
			int age=0;
			
			for(int i=0;i<list_persons.size();i++) {
				Person p = list_persons.get(i);
				try {
					if(p.getName().equalsIgnoreCase(name)) {
						age= p.getAge();
					}
					
				}
				catch (Exception e) {
					e.getMessage();
				
				}
			}
			return age;
		}
			
		
		public static void  Compare(){
			   ArrayList<String> c1= new ArrayList<String>();
			          c1.add("Red");
			          c1.add("Green");
			          c1.add("Black");
			          c1.add("White");
			          c1.add("Pink");

			          ArrayList<String> c2= new ArrayList<String>();
			          c2.add("Red");
			          c2.add("Green");
			          c2.add("Black");
			          c2.add("Pink");

			          //Storing the comparison output in ArrayList<String>
			          ArrayList<String> c3 = new ArrayList<String>();
			          for (String e : c1)
			             c3.add(c2.contains(e) ?  retYes(): retNo());
			        //  c3.add(c2.contains(e) ? "Yes" : "No");
			          System.out.println(c3);
			         
			     }
		
		public static String retYes() {
			return  "Yes";
					}
		
		public static String retNo() {
			return  "No";
					}
		
		public static void  AddTwoArray(){
			   ArrayList<String> c1= new ArrayList<String>();
			          c1.add("Red");
			          c1.add("Green");
			          c1.add("Black");
			          c1.add("White");
			          c1.add("Pink");
			          System.out.println("Array list of c1: "+ c1);
			          ArrayList<String> c2= new ArrayList<String>();
			          c2.add("Red");
			          c2.add("Green");
			          c2.add("Black");
			          c2.add("Pink");
			          System.out.println("Array list of c2: "+ c2);
			        ArrayList<String> c3= new ArrayList<String>();
			        c3.addAll(c1);
			        c3.addAll(c2);
			        System.out.println("New array: "+ c3);
			        
		}
		//increasing size,trim,checking empty or not
		public static void  CheckingArray(){
			   ArrayList<String> c1= new ArrayList<String>();
			   		c1.add("Red");
			   		c1.add("Green");
			   		c1.add("Black");
			   		c1.add("White");
			   		c1.add("Pink");
			   		
			   		c1.ensureCapacity(3);
			   		c1.add("Blue");
			   		c1.add("Brown");
			   		c1.add("yellow");
			   		
			   		c1.trimToSize();
			   		System.out.println("New Array: " +c1);
			   		System.out.println("Array after trim: " +c1);
			          System.out.println(c1.isEmpty());
		}
}
