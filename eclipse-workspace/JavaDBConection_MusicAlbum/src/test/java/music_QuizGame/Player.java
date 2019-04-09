package music_QuizGame;

public class Player {
String Name;
double Score;
	public Player(String name,double score) {
		this.Name=name;
		this.Score=score;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the score
	 */
	public double getScore() {
		return Score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.Score = this.Score+ score;
	}
	
}
