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
		usersNumbers = generateRandomArray();
		lotteryNumbers = generateRandomArray();
		
		int noOfMatches = checkTheResults();
		
		switch(noOfMatches)
		{
			case MATCH_ONE : return 1;
			case MATCH_TWO : return 5;
			case MATCH_THREE : return 10;
			default : return 0;
		}
	}
	//This method should generate and return a random int array
	private int[] generateRandomArray()
	{
		int[] randomArray = new int[AMOUNT_OF_NUMBERS];
		for(int i=0; i<AMOUNT_OF_NUMBERS; i++)
		{
			randomArray[i] = rand.nextInt(MAX_NUMBER+1);
		}
		return randomArray;
	}
	
	//Checks the lottery ticket against the lottery numbers and returns the number of matches
	private int checkTheResults()
	{
		int noOfMatches = 0;
		
		for(int i=0; i<lotteryNumbers.length; i++)
		{
			//Now go through the ticket
			for(int j=0; j<usersNumbers.length; j++)
			{
				if(lotteryNumbers[i] == usersNumbers[j])
				{
					noOfMatches++;
				}
			}
			
		}
		return noOfMatches;
	}
	
	//Prints the users ticket. 
	public void printUserTicket()
	{
		System.out.print("Your numbers were ---> ");
		printNumbers(usersNumbers);
	}
	
	//Prints the lottery ticket. 
	public void printLotteryNumbers()
	{
		System.out.print("Lottery numbers were ---> ");
		printNumbers(lotteryNumbers);
	}
	
	//Prints any int array of numbers 
	private void printNumbers(int[] theNumbers)
	{
		for(int i=0; i<theNumbers.length; i++)
		{
			System.out.print(theNumbers[i] + " ");
		}
		//Print an empty line for clearer console output
		System.out.println();
		
	}
	
	
}
