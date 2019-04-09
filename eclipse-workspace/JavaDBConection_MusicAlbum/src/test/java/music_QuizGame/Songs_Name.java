package music_QuizGame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Line;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Songs_Name {
	public static Workbook workbook;
	public static Sheet sheet;
	public static FileInputStream file;
	public static FileOutputStream fileoutput;
	public static Row row;
	public static Cell cell;
	static Artist objArt;
	static Player objPlayer;
	static String[][] songs = null;
	static List<Player>listOfPlayer=new ArrayList<Player>();
	
	
	public static void main(String[] args) throws Exception {
		String userName;
		//get list of artist from file
		List<Artist> artistList=getAristFromFile("Artist","E://Library//Write-In-Excel//List-Of-Songs.xlsx");
		//get list from player file
		List<Player> playerList=getPlayerFromFile("Player","E://Library//Write-In-Excel//List-Of-Songs.xlsx");
		//authorised player by inputing players name
		Scanner user = new Scanner(System.in);
		System.out.println("Enter Name");
		userName=user.nextLine();
		boolean eligible =	authanticatePlayer(playerList,userName);
		if(eligible) {
			//Get Obj Player that has name "lay" from playerList
			Player currentPlayer = getCurrentPlayer ( playerList,userName);
			//Game will start 
			playGame(artistList,currentPlayer,"E://Library//Write-In-Excel//List-Of-Songs.xlsx");
		}else
		{
			System.out.println("User not authanticated ");
		}
		//Get Obj Player that has name "lay" from playerList
		
		int scoreBoard=displayScore(playerList);
		System.out.println(scoreBoard);
		
		
		
	}
	
	//this method will get data from excel
	//input:sheetname,file path
	//output:list of artists
	
	public static  List<Artist> getAristFromFile(String sheetName,String path) throws Exception {
		file=new FileInputStream(path);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		sheet=workbook.getSheet(sheetName);
		int totalRows=sheet.getLastRowNum();
		System.out.println(totalRows);
		
		Row firstRow=sheet.getRow(0);
		int totalCells=firstRow.getLastCellNum();
		System.out.println(totalCells);
		
		 List<Artist>listOfArtist=new ArrayList<Artist>();
		for(int i=1;i<totalRows;i++) {
			 objArt=new Artist(sheet.getRow(i).getCell(0).getStringCellValue(),
										sheet.getRow(i).getCell(1).getStringCellValue());
			
					listOfArtist.add(objArt);
					
					}
		return listOfArtist;
		
			}
		
	public static List<Player> getPlayerFromFile(String sheetName,String path) throws Exception {
		file=new FileInputStream(path);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		sheet=workbook.getSheet(sheetName);
		int totalRows=sheet.getLastRowNum();
		System.out.println(totalRows);
		
		Row firstRow=sheet.getRow(0);
		int totalCells=firstRow.getLastCellNum();
		System.out.println(totalCells);
		 List<Player>listOfPlayer=new ArrayList<Player>();
		
		for(int i =1;i<totalRows;i++) {
			
			double playerScore=sheet.getRow(i).getCell(1).getNumericCellValue();
		int scoreChanged=	(int)Math.round(playerScore);
								objPlayer=new Player(sheet.getRow(i).getCell(0).getStringCellValue(),scoreChanged);
			
			listOfPlayer.add(objPlayer);
			
					}
		
		return listOfPlayer;
		
			}
	
	//this method will check weather user is authorised to play the game or not
	//input:player name 
	//output :wil check authorisation if he is eligiable to play game
	
	public static  boolean authanticatePlayer(List<Player> listOfPlayer,String playerName){
		boolean authorised = false ;
		for(Player name:listOfPlayer) {
		String	userName=name.getName();
			if(userName.equalsIgnoreCase(playerName)) {
				authorised=true;
				System.out.println("Is this player  authorised to play this game ? " +authorised);
			}
		}
		return authorised;
	
			}
	
	public static Player getCurrentPlayer(List<Player>playerList,String name) {
		
		
		for(Player currentPlayer:playerList) {
		String playerToPlayGame=	currentPlayer.getName();
			if(playerToPlayGame.equalsIgnoreCase(name)) {
			return currentPlayer;
			}
		}
		return null;
				
	
	}
	public static void playGame(List<Artist> artistList,Player currentPlayer,String filePath) throws IOException,Exception {
		String actualSong;
		String playerGuess;
		for(Artist artist:artistList) {
			String givenArtist=	artist.getName();
			actualSong	=artist.getSongName();
			char firtCharOfSong=artist.getSongName().charAt(0);
			System.out.println("Player need to guess song of  this artist :  "+ givenArtist + "  And First charater of the song is  : " +firtCharOfSong);
				
			
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter Song-Name");
				playerGuess=sc.nextLine();
					
					if(playerGuess.equalsIgnoreCase(actualSong)) {
						currentPlayer.setScore(3);
						
						}
					else {					//second chance	
						System.out.println("Enter Song-Name");
						playerGuess=sc.nextLine();
						if(playerGuess.equalsIgnoreCase(actualSong)) {
							currentPlayer.setScore(1);
						}	
						else  
						{break;}
						//if second chance fails, comes out of the for loop
					} 
					
					
				
		}
		
		writeScoreToFile(currentPlayer,filePath);
		
	}
	
	
	//this method adds to score to the current player
	public static void writeScoreToFile(Player currentPlayer,String filePath) throws Exception {

		
		try {
			
			 populateFile(currentPlayer,filePath);
			}
		catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
			workbook.close();
			populateFile(currentPlayer,filePath);
			
			} 
		catch (Exception e) {
				System.out.println(e.getMessage());
				}
		
		}
	
	public static int displayScore(List<Player> playerList) {
		int higestScore = 0;
		for(Player name:playerList) {
			double playerScore=name.getScore();
			 higestScore=(int)Math.round(playerScore);
			if(higestScore>=10) {
			System.out.println("This Player has highest score:"	+name.getName()+
					"And the score is --> "+name.getScore());
			}
		}
	
		return higestScore;
		
	}
		
public static void populateFile(Player currentPlayer,String filePath) throws Exception {
	file=new FileInputStream(filePath);
	workbook=WorkbookFactory.create(file);
	sheet=workbook.getSheet("Player");
	int noOfRows=sheet.getLastRowNum();
		for(int j=0;j<noOfRows;j++) {
			row=sheet.getRow(j);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(currentPlayer.getName())) {
				row.createCell(1).setCellValue(currentPlayer.getScore());
				fileoutput=new FileOutputStream(filePath);
				workbook.write(fileoutput);
				fileoutput.flush();
				fileoutput.close();
		 	}	
		}
}	
			
		
		
	
		}
	
	
		



