package music_QuizGame;

public class Artist {
String Name;
String SongName;
	public Artist(String name,String songName) {
		this.Name=name;
		this.SongName=songName;
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
	 * @return the listOfSongs
	 */
	public String getSongName() {
		return SongName;
	}
	/**
	 * @param listOfSongs the listOfSongs to set
	 */
	public void setSongName(String listOfSongs) {
		this.SongName = listOfSongs;
	}
	
	
}
