package controller;

import java.util.Scanner;
import model.GeneralRules;

public class GameController {
	GeneralRules generalRules = new GeneralRules();
	Scanner scanner = new Scanner(System.in);
	public boolean[] gameMap = // false means no chess, true means there is a chess
		{false, false, false, 
		 false, false, false,
		 false, false, false};
	
	public boolean isComplete(){ // check if every block is fulfilled 
		boolean isFullFill = false; 
		if(gameMap[0] && gameMap[1] && gameMap[2] && gameMap[3] && gameMap[4] && gameMap[5] 
				&& gameMap[6] && gameMap[7] && gameMap[8]){
			isFullFill = true;
		}; 
		return isFullFill; 
	}
	public boolean isSingleMode = true; // boolean if it is single mode 
	public void starter(){
		generalRules.greeting();
		generalRules.chooseMode();
		if(generalRules.isSingle) isSingleMode = true; // send out the mode choices 
		else isSingleMode = false; 
		generalRules.invalidateView();
	}
	public void moves(){
		int inputPosition; 
		try {
			inputPosition = scanner.nextInt(); 
			if(gameMap[inputPosition -1]){
				System.out.println("You moron!");
			};
			if(!gameMap[inputPosition -1]){  
				generalRules.putChess(generalRules.roundFirst, inputPosition);
				gameMap[inputPosition -1] = true; 
				generalRules.changeTurn();
				generalRules.invalidateView();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("You are Invalid! Moron!"); 
	}
	public void singlePlayerGame(){
		
	}
	public void twoPlayersGame(){
		do{
			moves();
		}while(!isComplete());
	}
}
