package console;

import java.util.Scanner;

import controller.GameController;

/*
 * This is the console launcher for the game 
 * This is also an useless line of comment ...... 
 */
public class CLauncher {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		GameController gameController = new GameController();
//		String endWord = ""; 
//		gameController.reset();
//		do{
			gameController.starter();
			if(gameController.isSingleMode) gameController.singlePlayerGame();
			else gameController.twoPlayersGame();
//			System.out.println("Enter end to quit the game or press enter to continue!");
//			endWord = scanner.nextLine(); 
//		}while(!endWord.equalsIgnoreCase("end"));
	}
}
