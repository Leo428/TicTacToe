package viewComponent;

/*
 * Here is the drawing of the field ... 
 */
public class FieldInfo {
	private final String singleMode = "Single Mode";
	private final String twoMode = "Two Players Mode"; 
	public final String humanTurnString = "> Your Turn"; 
	public final String nPCTurnString = "		< Computer's Turn";
	public final String player1String = "> Player 1";
	public final String player2String = "		< Player 2";
		
	public String modeDisplay(boolean isSingle){ // display game mode in the game board
		if(isSingle) return singleMode;
		else return twoMode;
	}
}
