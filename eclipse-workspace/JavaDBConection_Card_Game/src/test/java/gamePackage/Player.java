package gamePackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
private String playerName;
public static List<Card>listOfWinningCards;
public Card myCurrentCard;

public Player(String name) {
	this.playerName=name;
	List<Card>listOfWinningCards=new ArrayList<Card>();

}
/**
 * @return the winner
 */
/**
 * @return the myCurrentCard
 */
public Card getMyCurrentCard() {
	return myCurrentCard;
}
/**
 * @param myCurrentCard the myCurrentCard to set
 */
public void setMyCurrentCard(Card myCurrentCard) {
	this.myCurrentCard = myCurrentCard;
}
/**
 * @return the listOfCards
 */
public List<Card> getListOfCards() {
	return listOfWinningCards;
}
/**
 * @param listOfCards the listOfCards to set
 */
public void setListOfCards(Card card1, Card card2) {
	List<Card>listOfWinningCards=new ArrayList<Card>();
	this.listOfWinningCards.add(card1);
	this.listOfWinningCards.add(card2);
}
/**
 * @param winner the winner to set
 */

/**
 * @param winner the winner to set
 */


/**
 * @return the playerName
 */
public String getPlayerName() {
	return playerName;
}
/**
 * @param playerName the playerName to set
 */
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
/**
 * @return the cardColour
 */




}
