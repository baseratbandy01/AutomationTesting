package StringExamples;

public class StringTest {
	
	
	public static void main(String[] args) {
		getCharater();
		//concatenateString();
		//replacecharater();
		//startWith();
		//convertInLowerCase();
		//divideString();
		//spiltString();

	}
	
	//Exe1,22 getcharater
	public static void getCharater() {
		 String str;
			
		str="I am doing java";
		str.indexOf("m");
		System.out.println(str.length());
		System.out.println("Original String :" +str);
		for(int i=0;i<str.length();i++) {
			
		char value=str.charAt(i);
		System.out.println("value at: " + i + " is :" +value);
				}
	}
		//Exe7,8,9concatenate
		public static void concatenateString() {
			String str1=" Learing Selenium Testing ";
			String str2="With Java Code ";
			
			String str3=str1.concat(str2);
			String str4="With Java Code";
			System.out.println("Concatenated Strings Are : " + str3);
			
			System.out.println("Specified Sequence of char value: " + str3.contains("Selenium"));
			
			System.out.println("Comparing" + str2 + " and " +str4 + ":" + str2.contentEquals(str4));
			}
		//Exe24,
		 public static void replacecharater()
		 {
			 String str=" Learing Selenium Testing with different commandes and deteting  ";
			 String str1="The quick brown fox jumps over the lazy dog";
			 System.out.println(str);
			System.out.println(str);
			 System.out.println("orginal string: " + str1);
			 System.out.println(str.replace("d", "c"));
			System.out.println("After Replycing : " +str1.replace("fox", "cat"));
			 
				}
		 //Exe26
		 public static void startWith() {
			 String str = "Blue is my faviourt colour";
			 String str1="Orange is my faviourt colour";
			 
			 String startWith="Blue";
			 boolean strWith;
			 boolean strwith1;
			 System.out.println(str + "StartWith: " + str.startsWith(startWith)  + "?" );
			 System.out.println(str1 + "StartWith: " + str1.startsWith(startWith)  + "?");
		 }
		//Exe 29,30
		 public static void convertInLowerCase() {
			 String str = "Blue Is My FaviourT COlouR";
			 System.out.println( str.toUpperCase());
			 System.out.println( str.toLowerCase());
		 		 }
		 
		 public static void divideString() {
		String str="abcdefghij";
		int len=str.length();
		String str3;
		String str4;
		String str1="";
		String str2="";
		for(int i=0;i<len;i++) {
			
			for(int j=0;j<len/2;j++) {
				 String tempStr = Character.toString(str.charAt(j));
				 str3=	str1.concat(tempStr);
				 str1=str3;
				 break;
			}
			
			for(int j=(len/2)-1;j<len/2;j++) {
				 String tempStr = Character.toString(str.charAt(j));
				 str4=	str2.concat(tempStr);
				 str2=str4;
				 
			}
			
			System.out.println(str2);
			
			
		}
	}
		 public static void spiltString() {
			 String str="java selenium restAPI SoapUI";
			 String [] languages=str.split("\\s");//this will divide or split  them according to their white spaces
			 for(String str1:languages) {
				 System.out.println(str1);
			 }
		 }
}

