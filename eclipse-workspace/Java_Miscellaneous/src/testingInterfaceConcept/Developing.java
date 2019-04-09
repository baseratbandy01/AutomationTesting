package testingInterfaceConcept;
//whenever implements is used and interface class name  that means i am taking arragement of that interface 
public class Developing implements BankingClient,TestAnotherInterface {

	public static void main(String[] args) {
		Developing dev=new Developing();
		dev.paycreditCard();
		dev.checkingBalance();
		dev.getAddress();
		BankingClient bk=new Developing();//runtime polymorphisim
		//bk.getAddress();
		TestAnotherInterface test=new Developing();
		test.investment();
	}

	@Override
	public void paycreditCard() {
		System.out.println("This is Correct card deatils");
	}

	@Override
	public void transferBalance() {
		System.out.println("transferBalance");
		
	}

	@Override
	public void checkingBalance() {
		System.out.println("checking balance");
	}
	public void getAddress() {
		System.out.println("This is address method");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		
	}

}
