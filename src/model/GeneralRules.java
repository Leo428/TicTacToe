package model;

import viewComponent.XO;

public class GeneralRules {
	XO xo = new XO(); 
	private String[] chessXO = {"empty","empty","empty","empty","empty","empty","empty","empty","empty"};
	private String box(){
		String strBox = 
			"-----" + "-----" + "-------------" 																 +"                                       |\n" +																   
			"|"+ xo.displayChess(chessXO[0]) + xo.displayChess(chessXO[1]) + xo.displayChess(chessXO[2]) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 															 	 +"                                       |\n" +
			"|"+ xo.displayChess(chessXO[3]) + xo.displayChess(chessXO[4]) + xo.displayChess(chessXO[5]) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n" +
			"|"+ xo.displayChess(chessXO[6]) + xo.displayChess(chessXO[7]) + xo.displayChess(chessXO[8]) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n"
			;
		return strBox; 
	}
	private String initBox(){
		String strBox = 
			"-----" + "-----" + "-------------" 																 +"                                       |\n" +																   
			"|"+ xo.empty + xo.empty + xo.empty +"                                   |\n" +
			"|-----" + "-----" + "-------------" 															 	 +"                                       |\n" +
			"|"+ xo.empty + xo.empty + xo.empty +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n" +
			"|"+ xo.empty + xo.empty + xo.empty +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n"
			;
		return strBox; 
	}
	public void initField(){
		System.out.print(
						"----------------------------------------------------------------\n" +
						"|                                                              |\n" + // THIS LINE DISPLAYS GAME MODE
						"|                                                              |\n" + // THIS LINE DISPLAYS TURNS 
						"|"+ initBox() + // START OF THE BOX 9*9 (3*3 EACH)
						"|                                                              |\n" +
						"|                                                              |\n" +
						"----------------------------------------------------------------\n");
	}
	public void drawField(){
		System.out.print(
						"----------------------------------------------------------------\n" +
						"|                                                              |\n" + // THIS LINE DISPLAYS GAME MODE
						"|                                                              |\n" + // THIS LINE DISPLAYS TURNS 
						"|"+ box() + // START OF THE BOX 9*9 (3*3 EACH)
						"|                                                              |\n" +
						"|                                                              |\n" +
						"----------------------------------------------------------------\n"
				);
	}
}
