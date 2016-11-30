package viewComponent;

/*
 * This will keep tracking the scores and store them 
 */
public class Score {
	//Private INT proves that I am better than 99.9% of the programmers in this class
	private int nPCScore = 0;
	private int singleScore = 0;
	private int player1Score = 0;
	private int player2Score = 0;

	public void singlePlayer(){ // mode for human v.s. computer, display on the game board 
		
	}
	public void twoPlayers(){ // mode for two human players, display on the game board 
		
	}
	
	// boring getter setter
	public void setNPCScore(int newNPCScore){
		nPCScore = newNPCScore;
	}
	public int getNPCScore(){
		return nPCScore; 
	}
	
	public void setSingleScore(int newSingleScore){
		singleScore = newSingleScore;
	}
	public int getSingleScore(){
		return singleScore; 
	}
	
	public void setPlayer1Score(int newPlayer1Score){
		player1Score = newPlayer1Score;
	}
	
	public int getPlayer1Score(){
		return player1Score; 
	}
	
	public void setPlayer2Score(int newPlayer2Score){
		player2Score = newPlayer2Score;
	}
	public int getPlayer2Score(){
		return player2Score; 
	}
}
