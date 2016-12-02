package unitTester;

import controller.GameController;

public class TestingUnit {
	public static void main(String[] args){
		GameController gameController = new GameController();
		gameController.starter();
		if(gameController.isSingleMode) gameController.singlePlayerGame();
		else gameController.twoPlayersGame();
	}
}
