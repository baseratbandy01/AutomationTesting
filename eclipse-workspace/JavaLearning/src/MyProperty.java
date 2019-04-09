import java.util.List;

public class MyProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		House hs = new House();
		//creating 3 rooms
		Room rm1 = new Room();
		Room rm2 = new Room();
		Room rm3 = new Room();
		//in rm1 added one bulb, rm2 added one bulb,rm3 added one bulb
		
		Bulb blb = new Bulb(BulbShape.Round,BulbColour.Yellow,BulbType.Day);
		
		rm1.AddBulbs(blb);
		rm1.AddBulbs(new Bulb(BulbShape.Round,BulbColour.Yellow,BulbType.Day));
		
		rm2.AddBulbs(new Bulb(BulbShape.Round,BulbColour.Red,BulbType.Night));
		rm3.AddBulbs(new Bulb(BulbShape.Square,BulbColour.Red,BulbType.Night));
		//adding rm1 in the house
		hs.AddRooms(rm1);
		hs.AddRooms(rm2);
		hs.AddRooms(rm3);
		
		
		
		//int AllBulbs= rm1.getNoOfBulbs();
		int TotalBulbInTheHouse = hs.TotalNoOfBulbs();
		System.out.println(TotalBulbInTheHouse);
		//hs.AddRooms(new Room());
		
		Bathroom BT1 = new Bathroom(3,4);
		 hs.AddBathrooms( BT1);
		 hs.AddBathrooms(new Bathroom(1,2)); 
		// hs.AddLights(new NoOfLights());
		 
		 //BT1.getNoOfSinks();
		
		 //Get all the sinks from the house - Method1
		/*List<Bathroom> MyOwnBathRooms =  hs.GetAllBathroom();
		int	TotalNoSinks=0;
		 for (int i=0;i<MyOwnBathRooms.size(); i++) {
		//Bathroom bt= MyOwnBathRooms.get(i);
		//TotalNoSinks= TotalNoSinks + bt.getNoOfSinks();
		TotalNoSinks= TotalNoSinks + MyOwnBathRooms.get(i).getNoOfSinks();
		
		//Better way - create a method in the house class TotalSinksInHouse and access it.
		int totalSinks = BT1.getNoOfSinks();
		*/
		 
		
		 }
		 
	}


