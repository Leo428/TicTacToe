package viewComponent;
/*
 * This is for displaying X and O
 */
public class XO { // again, this makes me better than anyone else
	public String xPlacement(){
		return
				  "   "
				+ " X"
				+ "    "; 
	}
	public String oPlacement() {
		return
				  "   "
				+ " O"
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
	public String displayChess(int isX, int x){// 0 = O, 1 = X
		String strXO = null; 
		if(isX == 1) strXO = xPlacement(); 
		else if(isX == 0) strXO = oPlacement();
		else strXO = empty(x);
		return strXO;
	}
}
