package loopingJavaTets;

public class Student {
int StuId;
String StuName;
String StuAddress;
public Student(int id,String name,String address) {
	this.StuId=id;
	this.StuName=name;
	this.StuAddress=address;
	}
public int getstuId() {
	return StuId;
}
public String getstuName() {
	return StuName;
}
public String getstuAddress() {
	return StuAddress;
  }
}
