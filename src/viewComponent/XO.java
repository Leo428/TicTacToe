package viewComponent;


/*
 * This is for displaying X and O
 */
public class XO { // again, this makes me better than anyone else
	public String xPlacement(int x){
		return
				  "   "
				+ " X "
				+ "    "; 
	}
	public String oPlacement(int x) {
		return
				  "   "
				+ " O "
				+ "   "; 
	}
	private int[] position = {1,2,3,4,5,6,7,8,9};
	public String empty(int x){
		return 	  
				  "   "
				+ " " + position[x] + " "
				+ "   "; 
	} // String contain an empty field and position hint
					  
	//Display X and O in the boxes, this String here is too fancy to explain......
	public String displayChess(String isX, int x){
		String strXO = null; 
		if(isX == "X") strXO = xPlacement(x); 
		else if(isX == "O") strXO = oPlacement(x);
		else strXO = empty(x);
		return strXO;
	}
}
