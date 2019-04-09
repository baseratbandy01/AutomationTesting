package loopingJavaTets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CallingStudents {

	public static void main(String[] args) {
		
		Student std=new Student(233,"Irfan","glenthworth");
		Student std1=new Student(124,"Babli","Jaipur");
		Student std2=new Student(543,"Amna","London");
		Student std3=new Student(657,"Aafiya","Srinagar");
		Student std4=new Student(999,"Aliya","Kashmir");
		
		List<Student> students=new ArrayList<Student>();
		
		students.add(std);
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		
		/*Student studentDetail=findStudent("London",students);
		System.out.println(studentDetail.getstuId());
		System.out.println(studentDetail.getstuName());*/
		
	Student StdFound=findDetail("Aafiya",students);
	System.out.println(StdFound.getstuId());
		System.out.println(StdFound.getstuAddress());

	}
	public static Student findStudent(String address,List<Student> students) {
		for(Student stud:students) {
			if(stud.getstuAddress().equals(address)) {
				return stud;
			}
		}
		return null;
	}
	public static Student findDetail(String name,List<Student>students) {
		 Iterator<Student> std=students.iterator();
		 while(std.hasNext()) {
			 Student std1=std.next();
			 if(std1.getstuName().equals(name)) {
				 return std1;
			 }
		 }
		 return null;
	}

}
