package dateAndCalandarFormats;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayingCurrentDate {

	public static void main(String[] args) {
		//current date.current time
		Date date= new Date();
		
		//need to write Capital months
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat st=new 	SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		
		System.out.println(st.format(date));
		
		System.out.println(sdf.format(date));
		//will print current date
		System.out.println(date.toString());
		//mm/dd/yyyy HH:MM:SS u may need to in this format
	//	System.out.println(date.getTime());

	}

}
