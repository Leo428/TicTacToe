package controller;

import java.util.Scanner;

import model.GeneralRules;

public class GameController {
	
	private int[] gameMap = // 0 represent empty, 1 means X, 2 means O
		{0, 0, 0, 
		 0, 0, 0,
		 0, 0, 0};
	
	GeneralRules generalRules = new GeneralRules();
	Scanner scanner = new Scanner(System.in);
	
	public void starter(){
		generalRules.greeting();
		generalRules.chooseMode();
		generalRules.initField();
	}
	public void moves(){
		if(generalRules.chooseWord.equalsIgnoreCase("Single")) generalRules.isSingle = true;
		else generalRules.isSingle = false; 
		generalRules.putChess(generalRules.roundFirst, scanner.nextInt());
		generalRules.invalidateView();
	}
}
