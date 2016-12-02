package unitTester;

import model.GeneralRules;
import controller.GameController;

public class TestingUnit {
	public static void main(String[] args){
		GameController gameController = new GameController();
		gameController.starter();
		for (int i = 0; i < 9; i++) {
			gameController.moves();
		}
	}
}
