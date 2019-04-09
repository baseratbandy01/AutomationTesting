package extendsClassExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CallingCalulater {

	public static void main(String[] args) {
				MyCalculater calu=new MyCalculater(9,8);
		
				
		List<Calculater> calculation=new ArrayList<Calculater>();
		calculation.add(new MyCalculater(9,8));
		calculation.add(new MyCalculater(8,3));
		calculation.add(new MyCalculater(6,5));
		calculation.add(new MyCalculater(9,5));
		calculation.add(new MyCalculater(10,8));
		
			checkresult(calculation);
		
		
		/*int addresult=calu.addingtwonumbers();
		int subresult=calu.subtractingtwonumbers();
		int mulresult=calu.addingtwonumbers();
		*/
		//System.out.println("result of all calulation: " +calu.addingtwonumbers()+ "-" +calu.subtractingtwonumbers()+ "-" +calu.multplication());
	
		
	}
	public static void checkresult(List<Calculater> calculation) {
	Iterator<Calculater> calculate=	calculation.iterator();
	while(calculate.hasNext()) {
		Calculater cal=calculate.next();
		System.out.println("result of all calulation : " +cal.addingtwonumbers()+ "-" +cal.subtractingtwonumbers());
		
		}
	
	} 
}
