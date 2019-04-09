package StringTest18Nov;

public class JavaStringClass {

	public static void main(String[] args) {
		String str="Payment $100 paid";
		/*System.out.println(str.charAt(8));
		System.out.println(str.indexOf("$"));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.codePointAt(4))*/;
		System.out.println(str.endsWith("dias"));
		reverse();
	}
	public static void reverse() {
		//palindrome or not my name is not but if u do madam it will be
		String name="basirat";
		String demo="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			demo=demo+name.charAt(i);
		
		}
		
		System.out.println(demo);
	}

}
