package viewComponent;

/*
 * This is for displaying X and O
 */
public class XO { // again, this makes me better than anyone else
	private final String xPlacement =
				  "   "
				+ " X "
				+ "   "; 
	private final String oPlacement =
				  "   "
				+ " O "
				+ "   "; 
	public String empty = 
					  "   "
					+ "   "
					+ "   "; 
	
	//Display X and O in the boxes 
	public String displayChess(String isX){
		String strXO = null; 
		if(isX == "X") strXO = xPlacement; 
		else if(isX == "O") strXO = oPlacement;
		else strXO = empty;
		return strXO;
	}
}
