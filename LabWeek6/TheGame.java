import java.util.Random;
import java.util.Scanner;


public class TheGame 
{
	private int theNumberToGuess = 0;
	private int lastCorrectNumberGuessed = 0;
	private Random rand = new Random();
	private int noOfGuessesCorrectInARow = 0;
	
	public static final int MAX_NUMBER = 5;
	
	public void playTheGame()
	{
		//Generates the random number
		theNumberToGuess = rand.nextInt(MAX_NUMBER+1);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your guess (1-"+MAX_NUMBER+") : ");
		int usersGuess = keyboard.nextInt();
		
		//Now do the comparison of the guess versus the random number
		if(usersGuess == theNumberToGuess)
		{
			System.out.println("Congratulations you are right!!");
			lastCorrectNumberGuessed = usersGuess;
			noOfGuessesCorrectInARow++;
		}
		else if (usersGuess > TheGame.MAX_NUMBER)
		{
			System.out.println("Number out of range. Try again!");
		}
		else
		{
			System.out.println("Unlucky, you are wrong!");
			noOfGuessesCorrectInARow = 0;
		}
		System.out.println();
		System.out.println();
	}
	
	public void printNoOfGuessesInARow()
	{
		System.out.println("The correct number of guesses in a row is : "+noOfGuessesCorrectInARow);
		System.out.println("The last value you guessed correctly is : "+theNumberToGuess);
	}
	
	public void printMenu()
	{
		System.out.println("Choose an option");
		System.out.println("1. Play The Game");
		System.out.println("2. Print Highscore");
		System.out.println("3. Exit");
		System.out.println();
	}
}
