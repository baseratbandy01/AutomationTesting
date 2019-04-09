package gamePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random_class_Method {



/**
 * @param cardColour the cardColour to set
 */

/**
 * @param cardNumber the cardNumber to set
 */


public static int randomNumber() {
	int result = 0;
	System.out.println(" Random Number between 1 and 20 are : ");
	for(int i=0;i<5;i++) {
		System.out.println("Random Number [" +(i+1)+ "] : " +(int)(Math.random()*20));
	}
	return result;
	
}
public static List<String> shuffleElements(){
	
	 List<String> colourList=new ArrayList<String>();
	 
	 colourList.add("Red");
	 colourList.add("Black");
	 colourList.add("Yellow");
	 colourList.add("Orange");
	 Collections.shuffle(colourList);
	 System.out.println("Shuflled colours:" +colourList);
	return colourList;
	
}
}
