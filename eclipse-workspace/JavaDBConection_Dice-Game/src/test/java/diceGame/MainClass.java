package diceGame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
	import java.util.List;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class MainClass {
		public static XSSFWorkbook workbook;
		public static XSSFSheet sheet;
		public static FileInputStream file;
		public static FileOutputStream fileoutput;
		public static Row row;
		public static Cell cell;
		static Player objPlayer;
		static String filePath="E://Library//PullDataFrom_excel//Game.xlsx";
		static String sheetName="PlayersDetails";
		public static void main(String[] args) {
			
			List<Player>listOfPlayers=	listOfPlayers(filePath,sheetName);
			
			Scanner user = new Scanner(System.in);
			System.out.println("Enter Name");
			String playerName1 = user.nextLine();
			System.out.println("Enter Name");
			String playerName2 = user.nextLine();
			Player objPl1=authenticPlayer(listOfPlayers,playerName1);
			Player objPl2=authenticPlayer(listOfPlayers,playerName2);
	//	double total=	getTotalScore(filePath,sheetName,objPl1);
		
		boolean bothPlayersAuthorised =authenticPlayers(listOfPlayers,playerName1,playerName2);
			
			if(bothPlayersAuthorised) {
				
				try {
					rollDice(objPl1,objPl2);
				} catch (EncryptedDocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			else {
				System.out.println("Players not authorised: ");
			}
			
			
			}
		
		public static List<Player>listOfPlayers(String fileName,String sheetName){
			
			List<Player>listOfPlayers=new ArrayList<Player>();
			try {
				file=new FileInputStream(fileName);
				workbook=new XSSFWorkbook(file);
				sheet=workbook.getSheet(sheetName);
				int totalRows=sheet.getLastRowNum();
				System.out.println(totalRows);
				Row firstRow=sheet.getRow(0);
				int totalCells=firstRow.getLastCellNum();
				System.out.println(totalCells);
				
				
				for(int i=1;i<totalRows;i++) {
					
			String checkValue=sheet.getRow(i).getCell(0).getStringCellValue();
			//System.out.println(checkValue);
					
					objPlayer=new Player(sheet.getRow(i).getCell(0).getStringCellValue());
					listOfPlayers.add(objPlayer);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return listOfPlayers;
			
			
		}
	public static boolean authenticPlayers(List<Player>listOfPlayers,String P1,String P2) {
		boolean authorised = false  ;
		for(Player NameOfPlayer:listOfPlayers) {
		
			if(NameOfPlayer.getPlayerName().equalsIgnoreCase(P1)){
				
				for(Player secondPlayer:listOfPlayers) {
				
					if (secondPlayer.getPlayerName().equalsIgnoreCase(P2)) {
						return authorised=true;
								}
					
				}
			}
			
		}
			return authorised;
		
		}
	
	public static Player authenticPlayer(List<Player>listOfPlayers,String playerName) {
			for(Player NameOfPlayer:listOfPlayers) {
		
			if(NameOfPlayer.getPlayerName().equalsIgnoreCase(playerName)){
				return NameOfPlayer;
				
		}
			}
			return null;
		
		}	
	
	public static void rollDice(Player objP1,Player objP2) throws EncryptedDocumentException, IOException {
	
	
		for(int i=0;i<2;i++) {
			System.out.println("ROUND ..." +(i+1));
			//player1 plays
			Scanner player1Input = new Scanner(System.in);
			System.out.println("Enter FirstNumber P1");
			int dice1=player1Input.nextInt();
			System.out.println("Enter SecondNumber P1 ");
			int dice2=player1Input.nextInt();
			if(dice1<=6 && dice2<=6) {
				objP1.setScore(totalScoreOfPlayers(dice1,dice2), i);
				objP1.getHigestScore();
					 }
			
		//player2 plays
			
			Scanner player2Input = new Scanner(System.in);
			System.out.println("Enter FirstNumber P2");
			dice1=player2Input.nextInt();
			System.out.println("Enter SecondNumber P2");
			 dice2=player2Input.nextInt();
			if(dice1<=6 && dice2<=6) {
				objP2.setScore(totalScoreOfPlayers(dice1,dice2), i);
						}
					}
		int higestScoreP1=	objP1.getHigestScore();
		
		int higestScoreP2=	objP2.getHigestScore();
		
		System.out.println("Higest Score For Player Named :" + objP1.getPlayerName() + " Is -->" +higestScoreP1);
		
		System.out.println("Higest Score For Player Named :" + objP2.getPlayerName() + " Is -->" +higestScoreP2);
		
		int totalResultP1= objP1.totalScore();
		int totalResultP2 =objP2.totalScore();
		
		if(totalResultP1>totalResultP2){
			System.out.println("You Won the game : "+objPlayer.getPlayerName()+"-->"+totalResultP1);
		}
		else {
			System.out.println("You Won the game : "+objPlayer.getPlayerName()+"-->"+totalResultP2);
		}
	
		writeScoreInFile(objP1);	
		
		writeScoreInFile(objP2);	
			}
	
	
		public static int totalScoreOfPlayers(int dice1,int dice2) {
			int TotalScore = dice1+dice2;
			if(TotalScore%2==0) {
				return TotalScore+10;
			}
			else {
				return TotalScore-5;
				}
		}
		
		
		public static void writeScoreInFile(Player objPlayer) throws EncryptedDocumentException, IOException {
		
			file=new FileInputStream(filePath);
			workbook=(XSSFWorkbook) WorkbookFactory.create(file);
			sheet=workbook.getSheet(sheetName);
			int noOfRows=sheet.getLastRowNum();
			Row firstRow=sheet.getRow(0);
			int totalCells=firstRow.getLastCellNum();
			System.out.println(totalCells);
			int[]  scoreArray=objPlayer.getScores(); 
			System.out.println(objPlayer.getScores().length);
			for(int k=1;k<noOfRows;k++) {
				row=sheet.getRow(k);
				if(row.getCell(0).getStringCellValue().equalsIgnoreCase(objPlayer.getPlayerName())) {
					for(int h=0;h<objPlayer.getScores().length;h++) {
						row.createCell(h+1).setCellValue(scoreArray[h]);
							}
					break;
					}
							}
		
			
			fileoutput=new FileOutputStream(filePath);
			workbook.write(fileoutput);
			fileoutput.flush();
			fileoutput.close();
			
		}
		public static double getTotalScore(String fileName,String sheetName,Player objPlayer) {
			double valueOfCell=0;
		try {
			file=new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook=new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet=workbook.getSheet(sheetName);
		int totalRows=sheet.getLastRowNum();
		System.out.println(totalRows);
		Row firstRow=sheet.getRow(0);
		int totalCells=firstRow.getLastCellNum();
		System.out.println(totalCells);
		
		
		/*for(int i=0;i<totalRows;i++) {
			
			for(int j=0;j<totalCells;j++) {
			if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("Total_Score")) {
				 
					if(sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(objPlayer.getPlayerName())) {
						try {
						valueOfCell=sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.println(valueOfCell);
						}
						catch(IllegalStateException e) {
							System.out.println(e.getMessage());
						}
						break;
					}
					
				}
				
			}
	
	}*/
		
		//find index of Total_score
		int totalScore_Index=0;
		for(int i=0;i<totalRows;i++) {
			if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Total_Score")) {
				totalScore_Index=i;
			}
		}
		
		//get the value
		
		for(int i=0;i<totalRows;i++) {
			if(sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(objPlayer.getPlayerName())) {
				valueOfCell=sheet.getRow(i).getCell(totalScore_Index).getNumericCellValue();
			}
		}
		return valueOfCell;
		}
	}
		
