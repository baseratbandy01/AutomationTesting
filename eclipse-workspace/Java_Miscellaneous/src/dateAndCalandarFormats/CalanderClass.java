package dateAndCalandarFormats;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalanderClass {

	public static void main(String[] args) {
	Calendar cal=	Calendar.getInstance();
	SimpleDateFormat st=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
	System.out.println(st.format(cal.getTime()));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(cal.get(Calendar.AM_PM));
	System.out.println(cal.get(Calendar.MINUTE));
	System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	System.out.println(cal.get(Calendar.LONG_FORMAT));
	}

}
