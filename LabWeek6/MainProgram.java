import java.util.Scanner;


public class MainProgram {

	private static final int PLAY_THE_GAME = 1;
	private static final int SEE_HIGHSCORE = 2;
	private static final int EXIT = 3;
	
	public static void main(String[] args) {
		int usersMenuChoice = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome. Please enter numbers between 1 and "+TheGame.MAX_NUMBER);
		
		TheGame game = new TheGame();
		game.printMenu();
		
		usersMenuChoice = keyboard.nextInt();
		
		while(usersMenuChoice != EXIT)
		{
			switch(usersMenuChoice)
			{
				case PLAY_THE_GAME : game.playTheGame();break;
				case SEE_HIGHSCORE : game.printNoOfGuessesInARow(); break;
				default : System.out.println("Invalid Choice");
			}
			game.printMenu();
			usersMenuChoice = keyboard.nextInt();
		}
		
		System.out.println("Goodbye!");
	}

}
