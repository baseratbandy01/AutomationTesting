package gamePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import gamePackage.Test_Cases.TestCases;







public class Play_Card_Game {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream file;
	public static FileOutputStream fileoutput;
	public static Row row;
	public static Cell cell;
	static Player objPlayer;
	static Card objCard;
	static String filePath="E://Library//Game_Folder//Card_Game.xlsx";
	static String sheetName="Player";
	public static void main(String[] args) {
		TestCases tc=new TestCases();

		// List<Player> playerList=	listOfPlayers(filePath,sheetName);
		 List<Card> listCardObjects=	listOfCards();
		tc.colourTestCase();
		//tc.numberTestCase();
		
	/*	Player objP1=new Player("irfan");
		
		Player objP2=new Player("Aamina");
		Card objCard1=new Card(1,"Red");
		Card objCard2=new Card(1,"Black");*/
		
	//	playCardGame(objP1,objP2,listCardObjects,playerList);*/
	
		/*for(Card card:listCardObjects) {
		
		System.out.println(card.getUniqueID());
	}//end for loop
	
		Scanner user=new Scanner(System.in);
		System.out.println("Enter Name");
		String Player1=user.nextLine();
		System.out.println("Enter Name");
		String Player2=user.nextLine();
	Player objP1=	authenticPlayer(playerList,Player1);
	Player objP2=	authenticPlayer(playerList,Player2);
	boolean bothPlayerAuthorised=authanticationTest(playerList,Player1,Player2);
	
	if(bothPlayerAuthorised) {
		//Collections.shuffle(listCardObjects);
		
		playCardGame(objP1,objP2,listCardObjects,playerList);
			}
	else {
		System.out.println("Player is not authorised ");
	}*/
	}//end main method
	
	public static List<Player>listOfPlayers(String fileName,String sheetName){
		List<Player>listOfPlayers=new ArrayList<Player>();
		try {
			file=new FileInputStream(fileName);
			workbook=new XSSFWorkbook(file);
			sheet=workbook.getSheet(sheetName);
		int totalRows=sheet.getLastRowNum();
		System.out.println(totalRows);
		Row firstRow=sheet.getRow(0);
		int totalCell=firstRow.getLastCellNum();
		System.out.println(totalCell);
		
		for(int i=1;i<totalRows;i++) {
			objPlayer=new Player(sheet.getRow(i).getCell(0).getStringCellValue());
			listOfPlayers.add(objPlayer);
			}//end for loop
		}//end try
		catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());		
			} //end catch
		catch (IOException e) {
			System.out.println(e.getMessage());
		}//end catch
		return listOfPlayers;
		
	}//end method

	public static boolean authanticationTest(List<Player>listOfPlayers,String P1,String P2) {
		boolean authorised=false;
		for(Player name:listOfPlayers) {
			
			if(name.getPlayerName().equalsIgnoreCase(P1)) {
				for(Player secondPlayer:listOfPlayers) {
					if(secondPlayer.getPlayerName().equalsIgnoreCase(P2)) {
						return authorised =true;
					}//end of inner if loop
				}//end inner for loop
			}//end outer if loop
			
		}//end for loop
		return authorised;
		
	}//end method

	public static Player authenticPlayer(List<Player>listOfPlayers,String playerName) {
		for(Player NameOfPlayer:listOfPlayers) {
	
		if(NameOfPlayer.getPlayerName().equalsIgnoreCase(playerName)){
			return NameOfPlayer;
			
	}//end if loop
		}//end for loop
		return null;
	
	}	//end method
	
		
		public static List<Card> listOfCards(){
		List<Card>listOfCards=new ArrayList<Card>();
		
		for(int i=1;i<=10;i++){
			listOfCards.add(new Card(i,"Red"));
		}//end loop
		for(int i=1;i<=10;i++) {
					listOfCards.add(new Card(i,"Black"));
					
				}//end loop
		for(int i=1;i<=10;i++) {
					listOfCards.add(new Card(i,"Yellow"));
					
				}//end loop
		return listOfCards;
		}//end method
		
		//shuffle the card first
		//Players will pick cards one by one
		//if colour of their card is same the highest number card will win that player will keep that both cards
		//if colours of cards are different then if loop applies

	public static void playCardGame(Player P1,Player P2,List<Card> listCardObjects,List<Player> playerList) {
		//shuffle the card
		Collections.shuffle(listCardObjects);
				String colour;	
		for(int i=0;i<listCardObjects.size();i++){
			//Player 1  pick the card
	 P1.setMyCurrentCard(listCardObjects.get(i));
		
		//Player 2 will pick the card
		P2.setMyCurrentCard(listCardObjects.get(i+1));
		
				Player winnerPlayer=decideWinner(P1,P2);
				addCardToWinner(winnerPlayer,listCardObjects.get(i),listCardObjects.get(i+1));
				i++;
			}//end for loop
	
		}//end method	
	public static Player decideWinner(Player P1,Player P2){
		Player winnerPlayer = null;
		Card p1Card=P1.getMyCurrentCard();
		Card p2Card=P2.getMyCurrentCard();
	
		if(p1Card.getCardColour().equalsIgnoreCase(p2Card.getCardColour())) {
			if(p1Card.getCardNumber()>p2Card.getCardNumber()) {
				winnerPlayer=	P1;
			}//end of inner if loop
			else{
				winnerPlayer=	P2;
			}//end of inner if loop
		}
		
		if(p1Card.getCardColour().equalsIgnoreCase("Red")
					&&p2Card.getCardColour().equalsIgnoreCase("Black")) {
			winnerPlayer=P1;
			
			}
			//end if loop
			else if(p1Card.getCardColour().equalsIgnoreCase("Black")
						&&p2Card.getCardColour().equalsIgnoreCase("Red")){
				winnerPlayer=P2;
				
			}//end of else if loop
			else {
				if(p1Card.getCardColour().equalsIgnoreCase("Yellow")
						&&p2Card.getCardColour().equalsIgnoreCase("Red")){
					winnerPlayer=P1;
				
				}//end if loop
			}//end else loop
			 if(p1Card.getCardColour().equalsIgnoreCase("Red")
						&&p2Card.getCardColour().equalsIgnoreCase("Yellow")) {
					winnerPlayer=P2;
				}//end if loop
			 else if(p1Card.getCardColour().equalsIgnoreCase("Black")
						&&p2Card.getCardColour().equalsIgnoreCase("Yellow")) {
				 winnerPlayer=P1;
				 }//end else if loop
			 else {
				 if(p1Card.getCardColour().equalsIgnoreCase("Yellow")
						&&p2Card.getCardColour().equalsIgnoreCase("Black")) {
					 winnerPlayer=P2;
				 }//end if loop
			 }//end else loop
			
			 
		return winnerPlayer;
		
		}//end method
	public static void addCardToWinner(Player winnerPlayer,Card card1,Card card2) {
		winnerPlayer.setListOfCards(card1, card2);
	}//end method
	
	
	}//end class

	
	
	
		
		
			

			
			
		
	
		
	

