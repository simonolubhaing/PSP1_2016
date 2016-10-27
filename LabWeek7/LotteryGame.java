import java.util.Random;
import java.util.Scanner;


public class LotteryGame {
	private static final int MATCH_ONE = 1;
	private static final int MATCH_TWO = 2;
	private static final int MATCH_THREE = 3;
	
	private static final int AMOUNT_OF_NUMBERS = 3;
	private static final int MAX_NUMBER = 10;
	
	private int[] usersNumbers = new int[AMOUNT_OF_NUMBERS];
	private int[] lotteryNumbers = new int[AMOUNT_OF_NUMBERS];
	private Random rand = new Random();
	
	//This method should return how much has been won in the draw
	public int playTheGame()
	{
		//FILL IN CODE HERE
	}
	
	//This method should generate and return a random array
	private int[] generateRandomArray()
	{
		//FILL IN CODE HERE
	}
	//Checks the lottery ticket against the lottery numbers and returns the number of matches
	private int checkTheResults()
	{
		//FILL IN CODE HERE
	}
	
	//Prints the users ticket. 
	public void printUserTicket()
	{
		//FILL IN CODE HERE
	}
	//Prints the lottery ticket. 
	public void printLotteryNumbers()
	{
		//FILL IN CODE HERE
	}
	//This print out the contents of an array. It should be used by the two methods above it
	private void printNumbers(int[] theNumbers)
	{	
		//FILL IN CODE HERE
	}
	
}
