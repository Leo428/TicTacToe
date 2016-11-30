package viewComponent;

/*
 * Here is the drawing of the field ... 
 */
public class FieldInfo {
	
	private final String singleMode = "Single Mode";
	private final String twoMode = "Two Players Mode"; 
	
	public String modeDisplay(boolean isSingle){ // display game mode in the game board
		if(isSingle) return singleMode;
		else return twoMode;
	}
		
}
