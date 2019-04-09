package gamePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
String cardColour;
int cardNumber;
String uniqueID;

/**
 * @param uniqueID the uniqueID to set
 */


public Card(int IndexNumber,String colour) {
	this.cardColour=colour;
	this.cardNumber=IndexNumber;
	//this.uniqueID=id;
}

/**
 * @return the cardColour
 */
public String getCardColour() {
	return cardColour;
}

/**
 * @param cardColour the cardColour to set
 */
public void setCardColour(String cardColour) {
	this.cardColour = cardColour;
}

/**
 * @return the cardNumber
 */
public int getCardNumber() {
	return cardNumber;
}

/**
 * @param cardNumber the cardNumber to set
 */
public void setCardNumber(int cardNumber) {
	this.cardNumber = cardNumber;
}

/**
 * @return the uniqueID
 */

public String getUniqueID() {
	
	return this.cardColour+this.cardNumber;
	}


	
}

/**
 * @param uniqueID the uniqueID to set
 */



