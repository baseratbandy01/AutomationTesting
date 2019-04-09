package superkeyWord;

public class FinalKeyWordClass {
//whole class can be marked as a final u can't extend that class
	final void getData() {
		System.out.println("final methods r unquie cannot use with same name");
	}
	public static void main(String[] args) {
		final int a=7;//this value will not change 
	
		FinalKeyWordClass finalkey= new FinalKeyWordClass();
		finalkey.getData();
	}

}
