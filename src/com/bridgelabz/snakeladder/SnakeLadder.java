package com.bridgelabz.snakeladder;

public class SnakeLadder {
	
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int player1 = 1;
	static final int player2 = 2;


	public static void main(String[] args) {
		
		int count = 0;
		int playerStartPosition = 0;
		int playerOnePosition = 0;
		int playerTwoPosition = 0;
		int player = player1;
		
		System.out.println("playerOnePosition: "+playerOnePosition);
		System.out.println("playerTwoPosition: "+playerTwoPosition);
		
		
		while ((playerOnePosition < 100) && (playerTwoPosition < 100)) 
		{
			
			int playerRollDice = (int)(Math.random() * 6) + 1;
			System.out.println("Player get a dice number: " + playerRollDice);
			++count;
			
			int optionCheck = (int) (Math.random() * 100) % 3;
			System.out.println("Optioncheck: " + optionCheck);
				
			if(player == player1) 
			{
			
				playerOnePosition = positionCheck(playerRollDice,playerOnePosition,optionCheck);
				if ((optionCheck == SNAKE) || (optionCheck == NO_PLAY)) 
				{
					player = player2;
				}									
			}
				
			else if (player == player2)
			{
				
				playerTwoPosition= positionCheck(playerRollDice,playerOnePosition,optionCheck);
				
				if ((optionCheck == SNAKE) || (optionCheck == NO_PLAY)) 
				{
					player = player1;
				}
			}
						
		}
			System.out.println();
			System.out.println("Player One Position: " + playerOnePosition);
			System.out.println("Player Two Position: " + playerTwoPosition);
			System.out.println("DiceCount: " + count);
		
			if(playerOnePosition == 100) 
			{
				System.out.println("Player One Wins");
			}
			else 
			{
				System.out.println("Player Two Wins");
			}	
	}
	
	public static int positionCheck(int playerRollDice,int playerStartPosition,int optionCheck)
	{
		if((optionCheck == LADDER) && (playerStartPosition + playerRollDice) <= 100){
			
			System.out.println("Ladder");
			playerStartPosition = playerStartPosition + playerRollDice  ;
		}
		
		else if(optionCheck == SNAKE) {
			
			System.out.println("Snake");
			playerStartPosition = playerStartPosition - playerRollDice  ;
			
		}
		
		else {
			
			System.out.println("No Play,the Player stays in the same position");	
		}
		
		if (playerStartPosition < 0)
			playerStartPosition = 0;
		
		System.out.println("PlayerPosition: " + playerStartPosition);
		return playerStartPosition;

	}
}
