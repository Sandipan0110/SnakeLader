package SnakeandLadder;

public class SnakandLadder {

	//Start
	public static void main(String[] args) {
		
		double startPosition=0;
		double endPosition=100;
		
		//UC1
		GameOperation startGame = new GameOperation(startPosition);
		
		//UC2
		startGame.rollDie(); //go to roll dice fun
		
		//UC3
		startGame.nextMove(); //go to move fun
		
	}

}
