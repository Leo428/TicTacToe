package unitTester;

import model.GeneralRules;

public class TestingUnit {
	public static void main(String[] args){
		GeneralRules gr = new GeneralRules();
		gr.initField();
		gr.drawField();
	}
}
