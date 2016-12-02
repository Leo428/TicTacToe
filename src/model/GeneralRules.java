package model;

import viewComponent.FieldInfo;
import viewComponent.Score;
import viewComponent.XO;
import java.util.Scanner; 

public class GeneralRules {
	Score score = new Score();
	XO xo = new XO(); 
	FieldInfo fieldinfo = new FieldInfo();
	Scanner scanner = new Scanner(System.in); // init method from View Component
	
	public boolean roundFirst = true; // whose round? 
	public String chooseWord = null; // str to choose mode 
	public boolean isSingle = true; // mode single 
	private String[] chessXO = // String for the chess 
			{"empty","empty","empty",
			 "empty","empty","empty",
			 "empty","empty","empty"};
	private String box(){ // String for the box, contain chess
		String strBox = 
			"-----" + "-----" + "-------------" 																 +"                                       |\n" +																   
			"|"+ xo.displayChess(chessXO[0], 0) + xo.displayChess(chessXO[1], 1) + xo.displayChess(chessXO[2], 2) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 															 	 +"                                       |\n" +
			"|"+ xo.displayChess(chessXO[3], 3) + xo.displayChess(chessXO[4], 4) + xo.displayChess(chessXO[5], 5) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n" +
			"|"+ xo.displayChess(chessXO[6], 6) + xo.displayChess(chessXO[7], 7) + xo.displayChess(chessXO[8], 8) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n"
			;
		return strBox; 
	} 
	private String initBox(){ // String for init box, display at the very start 
		String strBox = 
			"-----" + "-----" + "-------------" 																 +"                                       |\n" +																   
			"|"+ xo.empty(0) + xo.empty(1) + xo.empty(2) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 															 	 +"                                       |\n" +
			"|"+ xo.empty(3) + xo.empty(4) + xo.empty(5) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n" +
			"|"+ xo.empty(6) + xo.empty(7) + xo.empty(8) +"                                   |\n" +
			"|-----" + "-----" + "-------------" 																 +"                                       |\n"
			;
		return strBox; 
	}
	public String turnsString(boolean isMode, boolean isFirst){ // players' turns String 
		String strTurn = null; 
		if(isMode && isFirst) strTurn = fieldinfo.nPCTurnString;
		else if(isMode && !isFirst) strTurn = fieldinfo.humanTurnString; 
		else if(!isMode && isFirst) strTurn =  fieldinfo.player1String;
		else if(!isMode && !isFirst) strTurn = fieldinfo.player2String;
		return strTurn;
	}
	
	public void initField(){ // init field, contain init box and empty game board 
		System.out.print(
						"----------------------------------------------------------------\n" +
						"|                                                              |\n" + // THIS LINE DISPLAYS GAME MODE
						"|                                                              |\n" + // THIS LINE DISPLAYS TURNS 
						"|"+ initBox() + // START OF THE BOX 9*9 (3*3 EACH)
						"|                                                              |\n" +
						"|                                                              |\n" +
						"----------------------------------------------------------------\n");
	}
	public void drawField(boolean isMode, boolean isFirst){ // drawing field method, modes, turns
		System.out.print(
						"----------------------------------------------------------------\n" +
						"|"+ fieldinfo.modeDisplay(isMode) +                                                              "|\n" + // THIS LINE DISPLAYS GAME MODE
						"|"+ turnsString(isMode, isFirst) +                                                              "|\n" + // THIS LINE DISPLAYS TURNS 
						"|"+ box() + // START OF THE BOX 9*9 (3*3 EACH)
						"|                                                              |\n" +
						"|                                                              |\n" +
						"----------------------------------------------------------------\n"
				);
	}
	public void greeting(){ // greeting at start 
		System.out.println("Welcome, here is a Chinese Casino, "
				+ "you will be playing Tic Tac Toe and lose all your money!"); 
	}
	public void chooseMode(){ // choose game mode 
		System.out.println("Please Choose the game mode, Single or Two");
		chooseWord = scanner.nextLine();  // Receive user input, need a variable. 
		if(chooseWord.equalsIgnoreCase("Single")) isSingle = true;
		else isSingle = false; 
	} 
	public void invalidateView(){ // refreshing field 
		drawField(isSingle, roundFirst);
	}
	public void putChess(boolean turn, int position){ // need whose turn and position putting the chess 
		if(turn) chessXO[position - 1] = "O"; 
		else chessXO[position -1] = "X";
	}
	public void changeTurn(){
		if(roundFirst) roundFirst = false;
		else roundFirst = true;
	}
}
