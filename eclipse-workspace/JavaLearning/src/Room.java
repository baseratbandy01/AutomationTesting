
import java.util.ArrayList;
import java.util.List;

class House {
	List<Room> Rooms= new ArrayList<Room>();
	List<Bathroom> Bathrooms = new ArrayList<Bathroom>();
	public void AddRooms(Room myRoom){
		Rooms.add(myRoom);
	}
	
	public void AddBathrooms(Bathroom myBathRoom){

		Bathrooms.add(myBathRoom);
	}

	public List<Bathroom> GetAllBathroom ()
	{
		return Bathrooms;
	}
	public int TotalNoOfBulbs() {
	int TotalNoOfBulbs=0;
	for(int i=0; i<Rooms.size();i++) {
		Room room = Rooms.get(i);
		TotalNoOfBulbs=TotalNoOfBulbs+room.getNoOfBulbs();
		
	}
	return TotalNoOfBulbs;
	}

	public int TotalSinksInHouse()
	{

		int	TotalNoSinks=0;
		for (int i=0;i<Bathrooms.size(); i++) {
			//Bathroom bt= MyOwnBathRooms.get(i);
			//TotalNoSinks= TotalNoSinks + bt.getNoOfSinks();
			TotalNoSinks= TotalNoSinks + Bathrooms.get(i).getNoOfSinks();
		}
		return TotalNoSinks;

	}


}

public class Room {

	float size;
	String colour;
	int NoOfLights;
	int NoOfBeds;
	
	List<Bulb> Bulbs = new ArrayList<Bulb>();
	
	public void AddBulbs(Bulb MyBulb) {
		Bulbs.add(MyBulb);
		
	}
	public int getNoOfBulbs() {
		return Bulbs.size();
	}
	
	
}
class Bulb{
	BulbShape ShapeOfBulb;
	BulbColour ColourOfBulb;
	BulbType  bulbType;

	public Bulb(BulbShape ShapeOfBulb,BulbColour ColourOfBulb,BulbType bulbType) {
		this.ShapeOfBulb	 = ShapeOfBulb;
		this.ColourOfBulb = ColourOfBulb;
		this.bulbType = bulbType;
	}
	public 	BulbShape getSLights() {
		return ShapeOfBulb;
	}
	public BulbColour getCLight() {
		return   ColourOfBulb;
	}
	
}


class Bathroom{

	int NoOfSinks;
	int NoOfShowers;

	public Bathroom(int Sinks,int Showers ) {
		NoOfSinks=Sinks;
		NoOfShowers=Showers;
	}
		
	public int getNoOfSinks() {

		return NoOfSinks;
	}
	public int getNoOfShowers() {

		return NoOfShowers;
	}
}

