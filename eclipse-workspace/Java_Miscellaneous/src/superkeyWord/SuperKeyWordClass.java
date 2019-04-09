package superkeyWord;

public class SuperKeyWordClass extends ChildDemoForSuperClass {
	//super keywords will refer to inhertance class
	String name="Basirat";
	 public void getName() {
		// System.out.println(name);
		// System.out.println(super.name);
		 System.out.println(name.concat (super.name));
	 }
	 public SuperKeyWordClass() {
		 //to call constructor of child class u should give 
		 super();//this should be always first line 
		 System.out.println("this is main class constructor");
	 }
	 public void getString() {
		 super.getString();
		 System.out.println("Hello This is my  in extended class string");
	 }
	public static void main(String[] args) {
		SuperKeyWordClass superkey=new SuperKeyWordClass();
		//it will first give prefernce to local variable
		//if their is same name method u can add super.methodname
		superkey.getName();
		superkey.getString();

	}

}
