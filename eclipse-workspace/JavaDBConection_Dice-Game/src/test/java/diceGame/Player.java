package diceGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
String playerName;

//int [] Scores=new int[2];
List<Integer> listOfScores = new ArrayList<Integer>();
public Player(String Name) {
	this.playerName=Name;
	
	
	
	}
public void setScore(int score,int index) {
	// Scores[index]=score;
	listOfScores.add(score);
}
public int[] getScores() {
	int[] Score=listOfScores.stream().mapToInt(Integer::intValue)
			.toArray();
		return Score;
	 
	}
public int totalScore() {
	int  totalScoreResult=0;
	for(int i=0;i<listOfScores.size();i++) {
	totalScoreResult=listOfScores.get(i)+totalScoreResult;
}

	return totalScoreResult;
	
}
public int getHigestScore() {
	int higestScore=listOfScores.get(0);
	
	for(int i=0;i<listOfScores.size();i++) {
		
		if(listOfScores.get(i)>higestScore) {
			higestScore=listOfScores.get(i);
		}
	}
	
	return higestScore;
}
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
 * @return the playerScore
 */





}

