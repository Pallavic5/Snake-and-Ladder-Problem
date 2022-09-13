package com.bridgelabz.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO SNAKE AND LADDER PROBLEM");
		
		int playerStartPosition = 0;
		System.out.println("Player Position = "+ playerStartPosition);
		
		System.out.println("Player rolls the die and get a number: " + dieThrow());

	}
	
	public static int dieThrow()
		{
	    	int num = (int)(Math.random()* 6) + 1; 
	    	return num;
		}
}
