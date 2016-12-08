package controller;

import java.util.Scanner;
import model.GeneralRules;

public class GameController {
	GeneralRules generalRules = new GeneralRules();
	Scanner scanner = new Scanner(System.in);
	
	boolean nPCposition[] = new boolean[9]; // 
	public boolean isWin = false; 
	public boolean isComplete(){ // check if every block is fulfilled 
		boolean isFullFill = false; 
		if(generalRules.gameMap[0] && generalRules.gameMap[1] && generalRules.gameMap[2] 
				&& generalRules.gameMap[3] && generalRules.gameMap[4] && generalRules.gameMap[5] 
				&& generalRules.gameMap[6] && generalRules.gameMap[7] && generalRules.gameMap[8]){
			isFullFill = true;
		}; 
		return isFullFill; 
	}
	private boolean isBegin(){ // check for if it is the start of the game 
		boolean rTStart = false; 
		if(!generalRules.gameMap[0] && !generalRules.gameMap[1] && !generalRules.gameMap[2] 
				&& !generalRules.gameMap[3] && !generalRules.gameMap[4] && !generalRules.gameMap[5] 
				&& !generalRules.gameMap[6] && !generalRules.gameMap[7] && !generalRules.gameMap[8]){
			rTStart = true; 
		}
		return rTStart; 
	}
	public boolean isSingleMode = true; // boolean if it is single mode 
	private int nPCSpot = 5; 
	
	public void starter(){
		generalRules.greeting();
		generalRules.chooseMode();
		if(generalRules.isSingle) isSingleMode = true; // send out the mode choices 
		else isSingleMode = false; 
		generalRules.invalidateView();
	}
	public void moves(){ // in here, I prevent user from putting in weird things, 
		// and mock on them!!! I also need to prevent them from putting in 0 
		int inputPosition; 
		if(scanner.hasNextInt()){
			inputPosition = scanner.nextInt(); 
			if(inputPosition == 0 || inputPosition >= 10){ // stop user from putting in 0! 
				System.out.println("Stop being stupid! No BUG!");
			}
			else{
				if(generalRules.gameMap[inputPosition -1]){
					System.out.println("You moron!");
				};
				if(!generalRules.gameMap[inputPosition -1]){  
					generalRules.putChess(generalRules.roundFirst, inputPosition);
					generalRules.gameMap[inputPosition -1] = true; 
					isWin = generalRules.judgement(); 
					if(isWin) {
						generalRules.invalidateView();
//						reset();
						System.out.println("You Win");
					}
					else if(!isComplete() && !isWin){
						generalRules.changeTurn();
						generalRules.invalidateView();
					}
					else if(isComplete() && !isWin){
						generalRules.invalidateView();
//						reset();
						System.out.println("Draw! The only way to win is to not play!");
					}
				}
			}
		}
		else{
			System.out.println("You are invalid! Moron!");
			scanner.next(); 
		}
	}
	public void aI(boolean isStart){ // method of AI challenging human
		if(isStart) {
			generalRules.putChess(generalRules.roundFirst, nPCSpot);
			generalRules.gameMap[nPCSpot-1] = true; 
			generalRules.changeTurn();
			generalRules.invalidateView();
		}
		else{
			while(nPCSpot <1 || nPCSpot >9 || generalRules.gameMap[nPCSpot - 1]){
				nPCSpot = (int)(Math.random() * 10);
			}
			generalRules.putChess(generalRules.roundFirst, nPCSpot);
			generalRules.gameMap[nPCSpot -1] = true;
			isWin = generalRules.judgement();
			if(isWin) {
				generalRules.invalidateView();
//				reset();
				System.out.println("You lost");
			}
			else if(!isComplete() && !isWin){
				generalRules.changeTurn();
				generalRules.invalidateView();
			}
			else if(isComplete() && !isWin){
				generalRules.invalidateView();
//				reset();
				System.out.println("Draw! The only way to win is to not play!");
			}
		}
	}
	public void nPCMove(){ // Fix the npc later ......
		aI(isBegin());
		// check if the spot is available, always put in the middle first and change turn 
	}
	public void singlePlayerGame(){
		while(!isComplete() && !isWin){
			if(generalRules.roundFirst) nPCMove();
			else moves();
		}
	}
	public void twoPlayersGame(){
		while(!isComplete() && !isWin){
			moves();
		}
	}
//	public void reset(){
//		generalRules.resetGame();
//		for (int i = 0; i < generalRules.gameMap.length; i++) {
//			generalRules.gameMap[i] = false; 
//		}
//		isWin = false; 
//		isSingleMode = true; 
//		nPCSpot = 5; 
//		generalRules.roundFirst = true;
//		generalRules.isSingle = true;
//	}
}
