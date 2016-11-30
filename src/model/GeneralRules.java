package model;

import viewComponent.FieldInfo;
import viewComponent.Score;
import viewComponent.XO;
import java.util.Scanner; 

public class GeneralRules {
	Score score = new Score();
	XO xo = new XO(); 
	FieldInfo fieldinfo = new FieldInfo();
	Scanner scanner = new Scanner(System.in);
	
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
	public void drawField(boolean isMode){
		System.out.print(
						"----------------------------------------------------------------\n" +
						"|"+ fieldinfo.modeDisplay(isMode) +                                                              "|\n" + // THIS LINE DISPLAYS GAME MODE
						"|                                                              |\n" + // THIS LINE DISPLAYS TURNS 
						"|"+ box() + // START OF THE BOX 9*9 (3*3 EACH)
						"|                                                              |\n" +
						"|                                                              |\n" +
						"----------------------------------------------------------------\n"
				);
	}
	public void greeting(){
		System.out.println("Welcome, here is a Chinese Casino, "
				+ "you will be playing Tic Tac Toe and lose all your money!"); 
	}
	public void chooseMode(){
		System.out.println("Please Choose the game mode, Single Player or Two Players");
		scanner.nextLine();  // Receive user input, need a variable. 
	} 
}
