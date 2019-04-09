package gamePackage.Test_Cases;

import gamePackage.Card;
import gamePackage.Player;
import gamePackage.Play_Card_Game;
public class TestCases {

	
	static Card redCard=new Card(8,"Red");
	static Card blackCard=new Card(6,"Black");
	static Card yellowCard=new Card(4,"Yellow");
	static Card redCard2=new Card(5,"Red");
	
	static Player objP1=new Player("Irfan");
	static Player objP2=new Player("Aamina");
	
	public static void colourTestCase() {

	
		objP1.setMyCurrentCard(redCard);
		objP2.setMyCurrentCard(blackCard);
		Play_Card_Game objPlayercardGame=new Play_Card_Game();
		
		System.out.println("Test for red and black:");
		Player winnerPlayer=objPlayercardGame.decideWinner(objP1,objP2);
		if(winnerPlayer.getMyCurrentCard().getCardColour().equalsIgnoreCase("Red")) {
			System.out.println("Test is successful");
			objPlayercardGame.addCardToWinner(winnerPlayer, redCard, blackCard);
		}else {
			System.out.println("Test fails");
			
		}
		
		System.out.println("Test for yellow and red:");
		 winnerPlayer=objPlayercardGame.decideWinner(objP1,objP2);
		if(winnerPlayer.getMyCurrentCard().getCardColour().equalsIgnoreCase("Yellow")) {
			System.out.println("Test is successful");
		}else {
			System.out.println("Test fails");
		
		}
		System.out.println("Test for  black and yellow :");
		 winnerPlayer=objPlayercardGame.decideWinner(objP1,objP2);
		if(winnerPlayer.getMyCurrentCard().getCardColour().equalsIgnoreCase("Black")) {
			System.out.println("Test is successful");
		}else {
			System.out.println("Test fails");
		
		
		}
	}
		
	public static void numberTestCase() {

			
		objP1.setMyCurrentCard(redCard);
		objP2.setMyCurrentCard(redCard2);
		Play_Card_Game objPlayercardGame=new Play_Card_Game();
		
		System.out.println("Test for red and red:");
		Player winnerPlayer=objPlayercardGame.decideWinner(objP1,objP2);
		if(winnerPlayer.getMyCurrentCard().getCardNumber()==objP1.getMyCurrentCard().getCardNumber()) {
			
			System.out.println("Test is successful");
			objPlayercardGame.addCardToWinner(winnerPlayer, redCard, redCard2);
		}else {
			System.out.println("Test fails");
			
		}
		
		System.out.println("Test for yellow and red:");
		 winnerPlayer=objPlayercardGame.decideWinner(objP1,objP2);
		if(winnerPlayer.getMyCurrentCard().getCardColour().equalsIgnoreCase("Yellow")) {
			System.out.println("Test is successful");
		}else {
			System.out.println("Test fails");
		
		}
		System.out.println("Test for  black and yellow :");
		 winnerPlayer=objPlayercardGame.decideWinner(objP1,objP2);
		if(winnerPlayer.getMyCurrentCard().getCardColour().equalsIgnoreCase("Black")) {
			System.out.println("Test is successful");
		}else {
			System.out.println("Test fails");
		
				}
	}//end Method
	public static int getWinnerTotal() {
		
		return 0;
		
	}
	
	
}
