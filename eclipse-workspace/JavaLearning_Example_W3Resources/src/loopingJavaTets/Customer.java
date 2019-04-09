package loopingJavaTets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	int Id;
	String Name;
	
	public void SetId(int id) {
		this.Id=id;
			}
	public int getId() {
		return Id;
	}
	public void SetName(String name) {
		this.Name=name;
			}
	public String getName() {
		return Name;
	}
	public Customer(int id,String name) {
		this.Id=id;
		this.Name=name;
	
	}

	

}
