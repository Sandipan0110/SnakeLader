package SnakeandLadder;

public class GameOperation {
	
	public double startPosition;
	public double previousPosition;
	public double movePlayer;
	public int count=0;
	
	//UC1
	//starting 
	public GameOperation(double startPosition) {
		super();
		this.startPosition = startPosition;
		System.out.println("Player Start position - "+startPosition);
	}
	
	//UC2
	//rollDie function 
	public void rollDie() {
	 previousPosition=movePlayer;
	 movePlayer=(Math.floor((Math.random()*6)+1));
	 count++;
	}
	
	//UC3
	//nextMove function
	public void nextMove() {
		double option =Math.floor((Math.random()*3)+1);
		int optionSelect=(int)option;
		switch (optionSelect) {
		case 1: {
			startPosition=previousPosition;
			System.out.println("no play");
			System.out.println("player at sameposition - " +startPosition);
			break;
		}
		case 2: {
			startPosition=movePlayer;
			System.out.println("got ladder");
			System.out.println("player at - "+startPosition);
			
			break;
		}
		case 3: {
			startPosition=startPosition-movePlayer;
			System.out.println("bitten by snake");
			System.out.println("player at - "+startPosition);
			break;
		}
		
		}
	}

}
