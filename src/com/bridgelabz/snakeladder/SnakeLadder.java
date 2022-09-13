package com.bridgelabz.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		
		int playerStartPosition = 0;
		
		while(playerStartPosition < 100) {
			
			int playerRollDice = (int)(Math.random() * 6) + 1;
			System.out.println("Player get a dice number: " + playerRollDice);
			
			int optionCheck = (int) (Math.random() * 100) % 3;
			System.out.println("Optioncheck: " + optionCheck);
			
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
			
			if(playerStartPosition < 0)
				playerStartPosition = 0;
			System.out.println("PlayerPosition: " + playerStartPosition);
			
		}
	}
}
